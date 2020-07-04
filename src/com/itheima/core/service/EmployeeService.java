package com.itheima.core.service;
import com.itheima.common.utils.Page;
import com.itheima.core.po.Employee;

public interface EmployeeService {
	//��ѯ�ͻ��б�
	public Page<Employee> findEmployeeList(Integer page,Integer rows,
								String emplName,String emplDepartment,String emplItem);
	//�����ͻ�
	public int createEmployee(Employee employee);
	//ͨ��id��ѯ�ͻ�
	public Employee getEmployeeById(Integer id);
	//���¿ͻ�
	public int updateEmployee(Employee employee);
	//ɾ���ͻ�
	public int deleteEmployee(Integer id);
	
}
