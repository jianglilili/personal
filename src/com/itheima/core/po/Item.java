package com.itheima.core.po;

import java.io.Serializable;
/**
 * 
 * @author 19867
 * ��Ŀ�־û���
 */

public class Item implements Serializable{
	private static final long serialVersionUID=1L;
	private Integer item_id;             //��Ŀ���
	private String item_name;            //��Ŀ����
	private String item_principal;		 //��Ŀ������
	private Integer start;    			 //��ʼ��
	private Integer rows; 				 //��ȡ����
	public Integer getItem_id() {
		return item_id;
	}
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_principal() {
		return item_principal;
	}
	public void setItem_principal(String item_principal) {
		this.item_principal = item_principal;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
}
