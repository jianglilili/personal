package com.itheima.core.service;
import com.itheima.common.utils.Page;
import com.itheima.core.po.Department;
import java.util.List;

public interface DepartmentService {
	//��ѯ�����б�
	public Page<Department> findDepartmentList(Integer page,Integer rows,String deptName);

}
