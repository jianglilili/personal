package com.itheima.core.dao;
import java.util.List;

import com.itheima.core.po.Employee;
/**
 * 
 * @author 19867
 * Employee�ӿ�
 */
public interface EmployeeDao {
	//Ա���б�
	public List<Employee> selectEmployeeList(Employee employee);
	//Ա����
	public Integer selectEmployeeListCount(Employee employee);
	//���Ա��
	public Integer createEmployee(Employee employee);
	//ͨ��id��ѯԱ��
	public Employee getEmployeeById(Integer id);
	//����Ա����Ϣ
	public int updateEmployee(Employee employee);
	//ɾ��Ա��
	int deleteEmployee(Integer id);
}
