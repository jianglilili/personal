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
 * ��Ŀ����
 */
@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemService{
	//����DAO���Բ�ע��
	@Autowired
	private ItemDao itemDao;
	//��Ŀ�б�
	public Page<Item> findItemList(Integer page,Integer rows,String itemName){
		//�������Ŷ���
		Item item=new Item();
		//�ж���Ŀ����
		if(StringUtils.isNotBlank(itemName)) {
			item.setItem_name(itemName);
		}
		//��ǰҳ
		item.setStart((page-1)*rows);
		//ÿҳ��
		item.setRows(rows);
		//��ѯ��Ŀ�б�
		List<Item> items=itemDao.selectItemList(item);
		//��ѯ��Ŀ�б��ܼ�¼��
		Integer count=itemDao.selectItemListCount(item);
		//����page���ض���
		Page<Item> result=new Page<>();
		result.setPage(page);
		result.setRows(items);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

}
