package com.aspectJ.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdk.UserDao;

public class TestAnnotationAspectJ {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/aspectJ/annotation/applicationContext.xml");
		UserDao userDao = (UserDao)ac.getBean("userDao");
		userDao.delete();
	}

}
