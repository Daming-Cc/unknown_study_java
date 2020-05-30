package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.CustomerDao;
import com.mapper.CustomerMapper;
import com.po.Customer;
import com.service.CustomerService;


public class CustomerTest {
	/*
	 * public static void main(String[] args) { 
	 * //����spring�������ļ�
	 * ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	 * //��ȡdao��bean CustomerDao dao = (CustomerDao)ac.getBean("customerDao");
	 * System.out.println(dao.findCustomerById(1));
	 *  }
	 */
	@Test
//	public void findCustomerByMapperTest() {
//		//����spring�����ļ�
//		ApplicationContext ac =  new ClassPathXmlApplicationContext("applicationContext.xml");
//		CustomerMapper c =  (CustomerMapper) ac.getBean("customerMapper");
//		System.out.println(c.findCustomerById(1));
//	}
	public void add() {
		//����spring�����ļ�
		ApplicationContext ac =  new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service =  (CustomerService) ac.getBean("customerService");
		Customer c = new Customer();
		c.setId(10);
		c.setUsername("sonboy");
		c.setJobs("student");
		c.setPhone("12314214");
	}
}
