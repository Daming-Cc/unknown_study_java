package com.tx.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {

	public static void main(String[] args) {
		ApplicationContext ac =
		new ClassPathXmlApplicationContext("com/tx/xml/applicationContext.xml");
		AccountDao dao = (AccountDao) ac.getBean("accountDao");
		dao.transfer("admin", "tome", 100.0);
		System.out.println("×ªÕË³É¹¦");

	}

}
