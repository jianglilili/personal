package com.itheima.core.dao;
import java.util.List;
import com.itheima.core.po.Department;
/**
 * 
 * @author 19867
 * Department接口
 */

public interface DepartmentDao {
	//部门列表
	public List<Department> selectDepartmentList(Department department);
	//部门数
	public Integer selectDepartmentListCount(Department department);
	//通过id查询部门
//	public Department getDepartmentById(Integer id);
}
