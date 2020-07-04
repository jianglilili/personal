package com.itheima.core.service;
import com.itheima.common.utils.Page;
import com.itheima.core.po.Employee;

public interface EmployeeService {
	//查询客户列表
	public Page<Employee> findEmployeeList(Integer page,Integer rows,
								String emplName,String emplDepartment,String emplItem);
	//创建客户
	public int createEmployee(Employee employee);
	//通过id查询客户
	public Employee getEmployeeById(Integer id);
	//更新客户
	public int updateEmployee(Employee employee);
	//删除客户
	public int deleteEmployee(Integer id);
	
}
