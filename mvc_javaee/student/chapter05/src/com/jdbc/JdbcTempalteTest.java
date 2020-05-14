package com.jdbc;


import java.util.List;

import org.junit.Test;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTempalteTest {
	//加载配置文件
	ApplicationContext ac = 
			new ClassPathXmlApplicationContext("com/jdbc/applicationContext.xml");
	  @Test 
	  
//	  public void createTable(){
//	 
		  //获取JdbcTemplate实例 
//	  JdbcTemplate jdbcTempalte = (JdbcTemplate)ac.getBean("jdbcTemplate"); 
//	  jdbcTempalte.execute("create table account"
//	  		+ "(id int primary key auto_increment,username varchar(50),balance double)"); 
//	  System.out.println("账户表account创建成功");
//	  
//	  }
	 
//	public void add() {
//		AccountDao dao = (AccountDao) ac.getBean("accountDao");
//		//创建Account对象，并向其添加数据
//		Account account = new Account();
//		account.setUsername("jhxbx");
//		account.setBalance(99999999.0);
//		int num = dao.add(account);
//		if(num>0) {
//			System.out.println("成功添加了"+num+"条数据");
//		}else {
//			System.out.println("添加失败");
//		}
//	}
//	public void update() {
//		AccountDao dao = (AccountDao) ac.getBean("accountDao");
//		//创建Account对象，并向其添加数据
//		Account account = new Account();
//		account.setUsername("tome");
//		account.setBalance(100.0);
//		account.setId(1);
//		int num = dao.update(account);
//		if(num>0) {
//			System.out.println("成功修改了"+num+"条数据");
//		}else {
//			System.out.println("添加失败");
//		}
//			
//	}
//	public void delete() {
//		AccountDao dao = (AccountDao)ac.getBean("accountDao");
//		int num = dao.delete(1);
//		if(num>0) {
//			System.out.println("陈功删除了"+num+"条记录");
//		}else {
//			System.out.println("删除失败");
//		}
//	}
//	public void findById() {
//		AccountDao dao = (AccountDao)ac.getBean("accountDao");
//		Account account = dao.findById(3);
//		System.out.println(account);
//	}
	public void findAll(){
		AccountDao dao = (AccountDao)ac.getBean("accountDao");
		List<Account> list = dao.findAll();
		for(Account account:list) {
			System.out.println(account);
		}
	}
}
