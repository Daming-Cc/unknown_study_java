package com.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.po.Orders;
import com.po.Person;
import com.po.User;
import com.utils.MybatisUtils;

/*
 * mybatis关联的映射测试类 
 */
public class MybatisAssociationTest {
	/*
	 * 一对一
	 */
//	@Test
//	public void findPersonTest() {
//	//1、获得sqlsession
//	SqlSession session = MybatisUtils.getSession();
//	//2 、查询
//	Person person = session.selectOne("com.mapper.PersonMapper.findPersonById2",1);
//	//3 输出结果
//	System.out.println(person);
//	//4 关闭
//	session.close();
	/*
	 * 一对多
	 */
//	@Test
//	public void findUserTest() {
//		SqlSession session = MybatisUtils.getSession();
//		User user = session.selectOne("com.mapper.UserMapper.findUserWithOrders",3);
//		System.out.println(user);
//		session.close();
//	}
	@Test
	public void findOrdersById() {
		SqlSession session = MybatisUtils.getSession();
		Orders orders = session.selectOne("com.mapper.OrdersMapper.findOrdersWithProduct2",1);
		System.out.println(orders);
		session.close();
	}
}
