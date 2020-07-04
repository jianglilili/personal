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
import com.itheima.core.po.Item;
import com.itheima.core.service.BaseDictService;
import com.itheima.core.service.ItemService;

/**
 * 
 * @author 19867
 * 项目管理控制器类
 */
@Controller
public class ItemController {
	//依赖注入
	@Autowired
	private ItemService itemService;
	@Autowired
	private BaseDictService baseDictService;
	//项目名称
	@Value("${item.name.type}")
	private String NAME_TYPE;
	/**
	 * 项目列表
	 */
	@RequestMapping(value="/item/list.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="10")Integer rows,
			String itemName,Model model) {
		//条件查询所有项目
		Page<Item> items=itemService.findItemList(page, rows, itemName);
		model.addAttribute("page", items);
		//项目名称
		List<BaseDict> nameType=baseDictService
				.findBaseDictByTypeCode(NAME_TYPE);
		//添加参数
		model.addAttribute("nameType", nameType);
		model.addAttribute("itemName", itemName);
		return "item";
	}

}
