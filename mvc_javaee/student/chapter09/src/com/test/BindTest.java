package com.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.po.Customer;
import com.utils.MybatisUtils;

public class BindTest {
	public static void main(String[] args) {
		SqlSession session = MybatisUtils.getSession();
		Customer customer = new Customer();
		customer.setUsername("a");
		List<Customer> list = session.selectList("com.mapper.CustomerMapper.findCustomerByName",customer);
		for(Customer c:list) {
			System.out.println(c);
		}
		session.close();
	}
}
