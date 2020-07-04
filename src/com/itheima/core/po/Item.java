package com.itheima.core.po;

import java.io.Serializable;
/**
 * 
 * @author 19867
 * 项目持久化类
 */

public class Item implements Serializable{
	private static final long serialVersionUID=1L;
	private Integer item_id;             //项目编号
	private String item_name;            //项目名称
	private String item_principal;		 //项目负责人
	private Integer start;    			 //起始行
	private Integer rows; 				 //所取行数
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
