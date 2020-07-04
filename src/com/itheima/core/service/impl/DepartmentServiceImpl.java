package com.itheima.core.service.impl;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.common.utils.Page;
import com.itheima.core.dao.DepartmentDao;
import com.itheima.core.po.Department;
import com.itheima.core.service.DepartmentService;
/**
 * 
 * @author 19867
 * 部门管理
 */
@Service("departmentService")
@Transactional

public class DepartmentServiceImpl implements DepartmentService{
	//声明DAO属性并注入
	@Autowired
	private DepartmentDao departmentDao;
	//部门列表
	public Page<Department> findDepartmentList(Integer page,Integer rows,String deptName){
		//创建部门对象
		Department department=new Department();
		//判断部门名称
		if(StringUtils.isNotBlank(deptName)) {
			department.setDept_name(deptName);
		}
		//当前页
		 department.setStart((page-1)*rows);
		 //每页数
		 department.setRows(rows);
		//查询部门列表
		List<Department> departments=departmentDao.selectDepartmentList(department);
		//查询客户列表总记录数
		Integer count=departmentDao.selectDepartmentListCount(department);
		//创建Page返回对象
		Page<Department> result=new Page<>();
		result.setPage(page);
		result.setRows(departments);
		result.setSize(rows);
		result.setTotal(count);
		return result;
		
	}

}
