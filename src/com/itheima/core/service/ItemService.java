package com.itheima.core.service;

import com.itheima.common.utils.Page;
import com.itheima.core.po.Item;

public interface ItemService {
	//��ѯ��Ŀ�б�
	public Page<Item> findItemList(Integer page,Integer rows,String itemName);

}
