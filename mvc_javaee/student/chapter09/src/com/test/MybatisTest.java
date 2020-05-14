package com.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.po.Customer;
import com.utils.MybatisUtils;

public class MybatisTest {
	public static void main(String[] args) {
		//通过工具类生成sqlSeesion
		SqlSession sqlSession = MybatisUtils.getSession();
		Customer c = new Customer();
		c.setUsername("daming");
		c.setJobs("bhrder");
		List<Customer> list = sqlSession.selectList("com.mapper.CustomerMapper.findCustomerByNameOrJobs",c);
		for(Customer cu:list) {
			System.out.println(cu);
		}
		//关闭
		sqlSession.close();
	}
}
