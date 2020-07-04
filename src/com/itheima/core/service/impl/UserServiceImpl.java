package com.itheima.core.service.impl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.itheima.core.dao.UserDao;
import com.itheima.core.po.User;
import com.itheima.core.service.UserService;
/**
 * 
 * @author 19867
 *�û�Service�ӿ�ʵ����
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	
	//ע��UserDao
	@Autowired
	private UserDao userDao;
	//ͨ���˺ź���������ѯ�û�
	@Override
	public User findUser(String usercode, String password) {
		// TODO Auto-generated method stub
		User user=this.userDao.findUser(usercode, password);
		return user;
	}

}
