package com.itheima.core.service;
import java.util.List;
import com.itheima.core.po.BaseDict;
/**
 * 
 * @author 19867
 * �����ֵ�Service�ӿ�
 */

public interface BaseDictService {
	//�����������ѯ�����ֵ�
	public List<BaseDict> findBaseDictByTypeCode(String typecode);

}
