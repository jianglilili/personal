package com.itheima.core.service;
import com.itheima.core.po.User;
/**
 * 
 * @author 19867
 *�û�Service�ӿ�
 */

public interface UserService {
	//ͨ���˺ź������ѯ�û�
	public User findUser(String usercode,String password);
}
