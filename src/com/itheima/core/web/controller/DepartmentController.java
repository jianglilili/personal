package com.itheima.core.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itheima.common.utils.Page;
import com.itheima.core.po.BaseDict;
import com.itheima.core.po.Department;
import com.itheima.core.service.BaseDictService;
import com.itheima.core.service.DepartmentService;

/**
 * 
 * @author 19867
 * 部门管理控制器类
 */
@Controller
public class DepartmentController {
	//依赖注入
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private BaseDictService baseDictService;
	//部门名称
	@Value("${department.name.type}")
	private String NAME_TYPE;
	/**
	 * 部门列表
	 */
	@RequestMapping(value="/department/list.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="10")Integer rows,
			String deptName,Model model) {
		//条件查询所有部门
		Page<Department> departments=departmentService.findDepartmentList(page, rows, deptName);
		model.addAttribute("page", departments);
		//部门名称
		List<BaseDict> nameType=baseDictService
				.findBaseDictByTypeCode(NAME_TYPE);
		//添加参数
		model.addAttribute("nameType", nameType);
		model.addAttribute("deptName", deptName);
		return "department";
		
	}
}
