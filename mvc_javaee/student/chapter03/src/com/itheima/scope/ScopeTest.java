package com.itheima.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/itheima/scope/Bean1.xml");
		System.out.println(ap.getBean("bean"));
		System.out.println(ap.getBean("bean1"));
	}

}
