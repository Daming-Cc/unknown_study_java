package com.jdk;
/*
 * 测试类
 */
public class JdkTest {

	public static void main(String[] args) {
		//创建代理对象
		JdkProxy proxy = new JdkProxy();
		//创建目标对象
		UserDao userDao = new UserDaoImpl();
		//从代理对象中获取增强后的目标对象
		UserDao userDao1 = (UserDao)proxy.createProxy(userDao);
		userDao1.add();
		userDao1.delete();
	}

}
