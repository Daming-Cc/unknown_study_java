package com.itheima.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
/*
 * 业务层
 * 将UserServiceImpl类标识为Spring当中的Bean，写法相当于
 * 					<bean id="userDao" class="com.itheima.annotation.UserDaoImpl">
 * 
 * @Resource(name="userDao")相当于
 * 					配置文件中
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource(name="userDao")
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void save() {
		userDao.save();//调用userDao中的save方法
		System.out.println("userService...save..");
	}
}
