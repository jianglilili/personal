package com.itheima.core.dao;
import java.util.List;
import com.itheima.core.po.Department;
/**
 * 
 * @author 19867
 * Department�ӿ�
 */

public interface DepartmentDao {
	//�����б�
	public List<Department> selectDepartmentList(Department department);
	//������
	public Integer selectDepartmentListCount(Department department);
	//ͨ��id��ѯ����
//	public Department getDepartmentById(Integer id);
}
