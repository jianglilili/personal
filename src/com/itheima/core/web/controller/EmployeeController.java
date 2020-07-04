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
 * �ͻ������������
 */
@Controller
public class EmployeeController {
	//����ע��
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private BaseDictService baseDictService;
	//�ͻ���Դ
//	@Value("${employee.sex.type}")
//	private String SEX_TYPE;
	//Ա����������
	@Value("${employee.department.type}")
	private String DEPARTMENT_TYPE;
	//Ա��������Ŀ
	@Value("${employee.item.type}")
	private String ITEM_TYPE;
	/**
	 * �ͻ��б�
	 */
	@RequestMapping(value="/employee/list.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="10")Integer rows,
			String emplName,String emplDepartment,
			String emplItem,Model model) {
		//������ѯ�����û�
		Page<Employee> employees=employeeService
				.findEmployeeList(page, rows, emplName, emplDepartment, emplItem);
		model.addAttribute("page",employees);
		//�ͻ���Դ
//		List<BaseDict> sexType=baseDictService
//				.findBaseDictByTypeCode(SEX_TYPE);
		//�ͻ�������ҵ
		List<BaseDict> departmentType=baseDictService
				.findBaseDictByTypeCode(DEPARTMENT_TYPE);
		//�ͻ�����
		List<BaseDict> itemType=baseDictService
				.findBaseDictByTypeCode(ITEM_TYPE);
		//��Ӳ���
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
	 * �����ͻ�
	 */
	@RequestMapping("/employee/create.action")
	@ResponseBody
	public String employeeCreate(Employee employee,HttpSession session) {
		//��ȡSession�еĵ�ǰ�û���Ϣ
		User user=(User) session.getAttribute("USER_SESSION");
		//����ǰ�û�id�洢�ڿͻ�������
		employee.setEmpl_create_id(user.getUser_id());
		//����Date����
		Date date=new Date();
		//�õ�һ��Timestamp��ʽ��ʱ�䣬����MySQL�е�ʱ���ʽ��yyyy/MM/dd HH:mm:ss"
		Timestamp timeStamp=new Timestamp(date.getTime());
		employee.setEmpl_createtime(timeStamp);
		//ִ��Service���еĴ������������ص�����Ӱ�������
		int rows=employeeService.createEmployee(employee);
		if(rows>0) {
			return "OK";
		}else {
			return "FALL";
		}
	}
	/**
	 * ͨ��id��ȡ�ͻ���Ϣ
	 */
	@RequestMapping("/employee/getEmployeeById.action")
	@ResponseBody
	public Employee getEmployeeById(Integer id) {
		Employee employee=employeeService.getEmployeeById(id);
		return employee;
	}
	/**
	 * ���¿ͻ�
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
	 * ɾ���û�
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
