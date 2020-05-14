package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 测试Ioc用法（控制反转）
 */
public class TestIoc {
	public static void main(String[] args) {
		//初始化容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从容器中获取userDao
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		//调用userDao中的say方法
		userDao.say();
	}
}
