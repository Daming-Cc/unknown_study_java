package com.aspectJ.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdk.UserDao;

public class TestXmlAspectJ {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("com/aspectJ/xml/applicationContext.xml");
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		System.out.println("first");
		userDao.add();
		System.out.println("");
		System.out.println("second");
		userDao.delete();

	}

}
