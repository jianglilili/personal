package com.itheima.core.dao;

import java.util.List;

import com.itheima.core.po.Item;

/**
 * 
 * @author 19867
 * Item�ӿ�
 */
public interface ItemDao {
	//��Ŀ�б�
	public List<Item> selectItemList(Item item);
	//��Ŀ��
	public Integer selectItemListCount(Item item);

}
