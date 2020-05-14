package com.cglib;

public class CglibTest {

	public static void main(String[] args) {
		//创建代理对象
		CglibProxy cglibProxy = new CglibProxy();
		//创建目标对象
		UserDao userDao = new UserDao();
		//获取增强后的目标对象
		UserDao userDao1 = (UserDao)cglibProxy.createProxy(userDao);
		userDao1.add();
		userDao1.delete();
	}

}
