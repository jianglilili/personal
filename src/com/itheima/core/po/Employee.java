package com.itheima.core.po;
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author 19867
 * 员工持久化类
 */
public class Employee implements Serializable{
	private static final long serialVersionUID=1L;
	private Integer empl_id;             //员工编号
	private String empl_name;            //员工名称
	private Integer empl_user_id;        //负责人id
	private Integer empl_create_id;      //创建人id
	private String empl_sex;             //性别
	private String empl_department;        //员工所属部门
	private String empl_item;           //项目名称
	private String empl_linkman;         //联系人
	private String empl_education_background;//学历
	private String empl_salary;          //薪水
	private String empl_phone;           //固定电话
	private String empl_mobile;          //移动电话
	private String empl_email;         //邮政编码
	private String empl_address;         //联系地址
	private Date empl_createtime;        //创建时间
	private Integer start;               //起始行
	private Integer rows;                //所取行数
	public Integer getEmpl_id() {
		return empl_id;
	}
	public void setEmpl_id(Integer empl_id) {
		this.empl_id = empl_id;
	}
	public String getEmpl_name() {
		return empl_name;
	}
	public void setEmpl_name(String empl_name) {
		this.empl_name = empl_name;
	}
	public Integer getEmpl_user_id() {
		return empl_user_id;
	}
	public void setEmpl_user_id(Integer empl_user_id) {
		this.empl_user_id = empl_user_id;
	}
	public Integer getEmpl_create_id() {
		return empl_create_id;
	}
	public void setEmpl_create_id(Integer empl_create_id) {
		this.empl_create_id = empl_create_id;
	}
	public String getEmpl_department() {
		return empl_department;
	}
	public void setEmpl_department(String empl_department) {
		this.empl_department = empl_department;
	}
	public String getEmpl_item() {
		return empl_item;
	}
	public void setEmpl_item(String empl_item) {
		this.empl_item = empl_item;
	}
	public String getEmpl_linkman() {
		return empl_linkman;
	}
	public void setEmpl_linkman(String empl_linkman) {
		this.empl_linkman = empl_linkman;
	}
	public String getEmpl_phone() {
		return empl_phone;
	}
	public void setEmpl_phone(String empl_phone) {
		this.empl_phone = empl_phone;
	}
	public String getEmpl_mobile() {
		return empl_mobile;
	}
	public void setEmpl_mobile(String empl_mobile) {
		this.empl_mobile = empl_mobile;
	}
	public String getEmpl_address() {
		return empl_address;
	}
	public void setEmpl_address(String empl_address) {
		this.empl_address = empl_address;
	}
	public Date getEmpl_createtime() {
		return empl_createtime;
	}
	public void setEmpl_createtime(Date empl_createtime) {
		this.empl_createtime = empl_createtime;
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
	public String getEmpl_sex() {
		return empl_sex;
	}
	public void setEmpl_sex(String empl_sex) {
		this.empl_sex = empl_sex;
	}
	public String getEmpl_education_background() {
		return empl_education_background;
	}
	public void setEmpl_education_background(String empl_education_background) {
		this.empl_education_background = empl_education_background;
	}
	public String getEmpl_salary() {
		return empl_salary;
	}
	public void setEmpl_salary(String empl_salary) {
		this.empl_salary = empl_salary;
	}
	public String getEmpl_email() {
		return empl_email;
	}
	public void setEmpl_email(String empl_email) {
		this.empl_email = empl_email;
	}
}
