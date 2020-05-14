package com.itheima.ioc;
/*
 * 实现UserService接口
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao;//声明成员变量
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void say() {
		//调用userDao
		userDao.say();
		System.out.println("UserService say hello Daming");
	}
}
