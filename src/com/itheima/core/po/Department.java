package com.itheima.core.po;
import java.io.Serializable;
/**
 * 
 * @author 19867
 * ���ų־û���
 */
public class Department  implements Serializable{
	private static final long serialVersionUID=1L;
	private Integer dept_id;       //���ű��
    private String dept_name;      //��������
    private String dept_phone;     //���ŵ绰
    private String dept_manager;   //���ž���
    private String dept_number;    //��������
    private Integer start;               //��ʼ��
	private Integer rows;                //��ȡ����
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
