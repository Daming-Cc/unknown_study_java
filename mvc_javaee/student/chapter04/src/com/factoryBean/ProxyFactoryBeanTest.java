package com.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdk.UserDao;

public class ProxyFactoryBeanTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/factoryBean/applicationContext.xml");
		UserDao dao = (UserDao) ac.getBean("userDaoProxy");
		dao.add();
		dao.delete();
	}
}
