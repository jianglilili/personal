package com.itheima.core.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.common.utils.Page;
import com.itheima.core.dao.ItemDao;
import com.itheima.core.po.Item;
import com.itheima.core.service.ItemService;

/**
 * 
 * @author 19867
 * 项目管理
 */
@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemService{
	//声明DAO属性并注入
	@Autowired
	private ItemDao itemDao;
	//项目列表
	public Page<Item> findItemList(Integer page,Integer rows,String itemName){
		//创建部门对象
		Item item=new Item();
		//判断项目名称
		if(StringUtils.isNotBlank(itemName)) {
			item.setItem_name(itemName);
		}
		//当前页
		item.setStart((page-1)*rows);
		//每页数
		item.setRows(rows);
		//查询项目列表
		List<Item> items=itemDao.selectItemList(item);
		//查询项目列表总记录数
		Integer count=itemDao.selectItemListCount(item);
		//创建page返回对象
		Page<Item> result=new Page<>();
		result.setPage(page);
		result.setRows(items);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

}
