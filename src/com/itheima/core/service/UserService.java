package com.itheima.core.service;
import com.itheima.core.po.User;
/**
 * 
 * @author 19867
 *用户Service接口
 */

public interface UserService {
	//通过账号和密码查询用户
	public User findUser(String usercode,String password);
}
