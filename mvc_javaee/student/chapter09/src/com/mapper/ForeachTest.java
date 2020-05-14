package com.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.po.Customer;
import com.utils.MybatisUtils;

public class ForeachTest {
	public static void main(String[] args) {
		SqlSession session = MybatisUtils.getSession();
		//创建List集合，封装查询的id
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		List<Customer> list = session.selectList("com.mapper.CustomerMapper.findCustomerByIds",ids);
		for(Customer c:list) {
			System.out.println(c);
		}
		session.close();
//		session.selectList("com.mapper.CustomerMapper.findCustomerByIds");
	}
}
