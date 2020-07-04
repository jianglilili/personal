package com.itheima.core.dao;

import java.util.List;

import com.itheima.core.po.Item;

/**
 * 
 * @author 19867
 * Item接口
 */
public interface ItemDao {
	//项目列表
	public List<Item> selectItemList(Item item);
	//项目数
	public Integer selectItemListCount(Item item);

}
