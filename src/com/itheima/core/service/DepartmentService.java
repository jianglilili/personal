package com.itheima.core.service;
import com.itheima.common.utils.Page;
import com.itheima.core.po.Department;
import java.util.List;

public interface DepartmentService {
	//查询部门列表
	public Page<Department> findDepartmentList(Integer page,Integer rows,String deptName);

}
