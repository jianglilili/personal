package com.itheima.core.po;
import java.io.Serializable;
/**
 * 
 * @author 19867
 * 部门持久化类
 */
public class Department  implements Serializable{
	private static final long serialVersionUID=1L;
	private Integer dept_id;       //部门编号
    private String dept_name;      //部门名称
    private String dept_phone;     //部门电话
    private String dept_manager;   //部门经理
    private String dept_number;    //部门人数
    private Integer start;               //起始行
	private Integer rows;                //所取行数
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getDept_phone() {
		return dept_phone;
	}
	public void setDept_phone(String dept_phone) {
		this.dept_phone = dept_phone;
	}
	public String getDept_manager() {
		return dept_manager;
	}
	public void setDept_manager(String dept_manager) {
		this.dept_manager = dept_manager;
	}
	public String getDept_number() {
		return dept_number;
	}
	public void setDept_number(String dept_number) {
		this.dept_number = dept_number;
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
