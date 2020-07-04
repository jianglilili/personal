package com.itheima.core.web.controller;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.common.utils.Page;
import com.itheima.core.po.BaseDict;
import com.itheima.core.po.Employee;
import com.itheima.core.po.User;
import com.itheima.core.service.BaseDictService;
import com.itheima.core.service.EmployeeService;
/**
 * 
 * @author 19867
 * 客户管理控制器类
 */
@Controller
public class EmployeeController {
	//依赖注入
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private BaseDictService baseDictService;
	//客户来源
//	@Value("${employee.sex.type}")
//	private String SEX_TYPE;
	//员工所属部门
	@Value("${employee.department.type}")
	private String DEPARTMENT_TYPE;
	//员工所做项目
	@Value("${employee.item.type}")
	private String ITEM_TYPE;
	/**
	 * 客户列表
	 */
	@RequestMapping(value="/employee/list.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="10")Integer rows,
			String emplName,String emplDepartment,
			String emplItem,Model model) {
		//条件查询所有用户
		Page<Employee> employees=employeeService
				.findEmployeeList(page, rows, emplName, emplDepartment, emplItem);
		model.addAttribute("page",employees);
		//客户来源
//		List<BaseDict> sexType=baseDictService
//				.findBaseDictByTypeCode(SEX_TYPE);
		//客户所属行业
		List<BaseDict> departmentType=baseDictService
				.findBaseDictByTypeCode(DEPARTMENT_TYPE);
		//客户级别
		List<BaseDict> itemType=baseDictService
				.findBaseDictByTypeCode(ITEM_TYPE);
		//添加参数
//		model.addAttribute("sexType", sexType);
		model.addAttribute("departmentType", departmentType);
		model.addAttribute("itemType", itemType);
		model.addAttribute("emplName", emplName);
//		model.addAttribute("emplSex", emplSex);
		model.addAttribute("emplDepartment", emplDepartment);
		model.addAttribute("emplItem", emplItem);
		return "employee";
	}
	/**
	 * 创建客户
	 */
	@RequestMapping("/employee/create.action")
	@ResponseBody
	public String employeeCreate(Employee employee,HttpSession session) {
		//获取Session中的当前用户信息
		User user=(User) session.getAttribute("USER_SESSION");
		//将当前用户id存储在客户对象中
		employee.setEmpl_create_id(user.getUser_id());
		//创建Date对象
		Date date=new Date();
		//得到一个Timestamp格式的时间，存入MySQL中的时间格式“yyyy/MM/dd HH:mm:ss"
		Timestamp timeStamp=new Timestamp(date.getTime());
		employee.setEmpl_createtime(timeStamp);
		//执行Service层中的创建方法，返回的是受影响的行数
		int rows=employeeService.createEmployee(employee);
		if(rows>0) {
			return "OK";
		}else {
			return "FALL";
		}
	}
	/**
	 * 通过id获取客户信息
	 */
	@RequestMapping("/employee/getEmployeeById.action")
	@ResponseBody
	public Employee getEmployeeById(Integer id) {
		Employee employee=employeeService.getEmployeeById(id);
		return employee;
	}
	/**
	 * 更新客户
	 */
	@RequestMapping("/employee/update.action")
	@ResponseBody
	public String employeeUpdate(Employee employee) {
		int rows=employeeService.updateEmployee(employee);
		if(rows>0) {
			return "OK";
		}else {
			return "FALL";
		}
	}
	/**
	 * 删除用户
	 */
	@RequestMapping("/employee/delete.action")
	@ResponseBody
	public String employeeDelete(Integer id)
	{
		int rows=employeeService.deleteEmployee(id);
		if(rows>0) {
			return "OK";
		}else {
			return "FALL";
		}
	}
}
