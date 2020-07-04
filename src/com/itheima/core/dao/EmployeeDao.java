package com.itheima.core.dao;
import java.util.List;

import com.itheima.core.po.Employee;
/**
 * 
 * @author 19867
 * Employee接口
 */
public interface EmployeeDao {
	//员工列表
	public List<Employee> selectEmployeeList(Employee employee);
	//员工数
	public Integer selectEmployeeListCount(Employee employee);
	//添加员工
	public Integer createEmployee(Employee employee);
	//通过id查询员工
	public Employee getEmployeeById(Integer id);
	//更新员工信息
	public int updateEmployee(Employee employee);
	//删除员工
	int deleteEmployee(Integer id);
}
