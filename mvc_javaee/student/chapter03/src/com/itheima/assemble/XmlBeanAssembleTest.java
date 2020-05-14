package com.itheima.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/itheima/assemble/bean.xml");
		//System.out.println(ap.getBean("user1"));
		System.out.println(ap.getBean("user2"));
	}

}
