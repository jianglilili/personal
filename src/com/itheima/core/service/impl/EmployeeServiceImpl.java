package com.itheima.core.service.impl;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.itheima.common.utils.Page;
import com.itheima.core.dao.EmployeeDao;
import com.itheima.core.po.Employee;
import com.itheima.core.service.EmployeeService;
/**
 * 
 * @author 19867
 * 客户管理
 */@Service("employeeService")
 @Transactional

public class EmployeeServiceImpl implements EmployeeService{
	 //声明DAO属性并注入
	 @Autowired
	 private EmployeeDao employeeDao;
	 //客户列表
	 public Page<Employee> findEmployeeList(Integer page,Integer rows,
			 String emplName, String emplDepartment,
			 String emplItem){
		 //创建用户对象
		 Employee employee=new Employee();
		 //判断客户名称
		 if(StringUtils.isNotBlank(emplName)) {
			 employee.setEmpl_name(emplName);
		 }
		 //判断客户信息来源
//		 if(StringUtils.isNotBlank(emplSex)) {
//			 employee.setEmpl_sex(emplSex);
//		 }
		 //判断客户所属行业
		 if(StringUtils.isNotBlank(emplDepartment)) {
			 employee.setEmpl_department(emplDepartment);
		 }
		 //判断客户级别
		 if(StringUtils.isNotBlank(emplItem)) {
			 employee.setEmpl_item(emplItem);
		 }
		 //当前页
		 employee.setStart((page-1)*rows);
		 //每页数
		 employee.setRows(rows);
		 //查询客户列表
		 List<Employee> employees=employeeDao.selectEmployeeList(employee);
		 //查询客户列表总记录数
		 Integer count=employeeDao.selectEmployeeListCount(employee);
		 //创建Page返回对象
		 Page<Employee> result=new Page<>();
		 result.setPage(page);
		 result.setRows(employees);
		 result.setSize(rows);
		 result.setTotal(count);
		 return result;
	 }
	 /**
	  * 创建客户
	  */
	@Override
	public int createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.createEmployee(employee);
	}
	/**
	 * 通过id查询客户
	 */
	@Override
	public Employee getEmployeeById(Integer id) {
		Employee employee=employeeDao.getEmployeeById(id);
		return employee;
	}
	/**
	 * 更新客户
	 */
	@Override
	public int updateEmployee(Employee employee)
	{
		return employeeDao.updateEmployee(employee);
	}
	/**
	 * 删除客户
	 */
	@Override
	public int deleteEmployee(Integer id) {
		return employeeDao.deleteEmployee(id);
	}
	
}
