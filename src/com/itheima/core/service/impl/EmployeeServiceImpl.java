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
 * �ͻ�����
 */@Service("employeeService")
 @Transactional

public class EmployeeServiceImpl implements EmployeeService{
	 //����DAO���Բ�ע��
	 @Autowired
	 private EmployeeDao employeeDao;
	 //�ͻ��б�
	 public Page<Employee> findEmployeeList(Integer page,Integer rows,
			 String emplName, String emplDepartment,
			 String emplItem){
		 //�����û�����
		 Employee employee=new Employee();
		 //�жϿͻ�����
		 if(StringUtils.isNotBlank(emplName)) {
			 employee.setEmpl_name(emplName);
		 }
		 //�жϿͻ���Ϣ��Դ
//		 if(StringUtils.isNotBlank(emplSex)) {
//			 employee.setEmpl_sex(emplSex);
//		 }
		 //�жϿͻ�������ҵ
		 if(StringUtils.isNotBlank(emplDepartment)) {
			 employee.setEmpl_department(emplDepartment);
		 }
		 //�жϿͻ�����
		 if(StringUtils.isNotBlank(emplItem)) {
			 employee.setEmpl_item(emplItem);
		 }
		 //��ǰҳ
		 employee.setStart((page-1)*rows);
		 //ÿҳ��
		 employee.setRows(rows);
		 //��ѯ�ͻ��б�
		 List<Employee> employees=employeeDao.selectEmployeeList(employee);
		 //��ѯ�ͻ��б��ܼ�¼��
		 Integer count=employeeDao.selectEmployeeListCount(employee);
		 //����Page���ض���
		 Page<Employee> result=new Page<>();
		 result.setPage(page);
		 result.setRows(employees);
		 result.setSize(rows);
		 result.setTotal(count);
		 return result;
	 }
	 /**
	  * �����ͻ�
	  */
	@Override
	public int createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.createEmployee(employee);
	}
	/**
	 * ͨ��id��ѯ�ͻ�
	 */
	@Override
	public Employee getEmployeeById(Integer id) {
		Employee employee=employeeDao.getEmployeeById(id);
		return employee;
	}
	/**
	 * ���¿ͻ�
	 */
	@Override
	public int updateEmployee(Employee employee)
	{
		return employeeDao.updateEmployee(employee);
	}
	/**
	 * ɾ���ͻ�
	 */
	@Override
	public int deleteEmployee(Integer id) {
		return employeeDao.deleteEmployee(id);
	}
	
}
