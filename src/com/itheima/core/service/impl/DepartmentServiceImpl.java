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
 * ���Ź���
 */
@Service("departmentService")
@Transactional

public class DepartmentServiceImpl implements DepartmentService{
	//����DAO���Բ�ע��
	@Autowired
	private DepartmentDao departmentDao;
	//�����б�
	public Page<Department> findDepartmentList(Integer page,Integer rows,String deptName){
		//�������Ŷ���
		Department department=new Department();
		//�жϲ�������
		if(StringUtils.isNotBlank(deptName)) {
			department.setDept_name(deptName);
		}
		//��ǰҳ
		 department.setStart((page-1)*rows);
		 //ÿҳ��
		 department.setRows(rows);
		//��ѯ�����б�
		List<Department> departments=departmentDao.selectDepartmentList(department);
		//��ѯ�ͻ��б��ܼ�¼��
		Integer count=departmentDao.selectDepartmentListCount(department);
		//����Page���ض���
		Page<Department> result=new Page<>();
		result.setPage(page);
		result.setRows(departments);
		result.setSize(rows);
		result.setTotal(count);
		return result;
		
	}

}
