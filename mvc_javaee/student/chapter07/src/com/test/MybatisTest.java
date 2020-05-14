package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.po.Customer;
import com.utils.MybatisUtils;

public class MybatisTest {
	/**
	 * 根据客户编号查询客户信息
	 * @throws IOException 
	 */
//	@Test
//	public void findById() throws IOException {
//		//1 读取配置文件
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		//2 根据配置文件构建SqlSessionFactory
//		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		//3 通过SqlSessionFactory创建SqlSession
//		SqlSession sqlSession = sessionFactory.openSession();
//		//4 sqlSession执行映射文件定义的sql
//		Customer c = sqlSession.selectOne("com.mapper.CustomerMapper.findById",1);
//		System.out.println(c);
//		//5 关闭SqlSession
//		sqlSession.close();
//	@Test
//	public void findByNmae() throws IOException {
//		//1 读取配置文件
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		//2 根据配置文件构建SqlSessionFactory
//		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		//3 通过SqlSessionFactory创建SqlSession
//		SqlSession sqlSession = sessionFactory.openSession();
//		//4 sqlSession执行映射文件定义的sql
//		List<Customer> list = sqlSession.selectList("com.mapper.CustomerMapper.findByName","o");
//		for(Customer c:list) {
//			System.out.println(c);
//		}
//		//5 关闭SqlSession
//		sqlSession.close();
//	}
//	@Test
//	public void add() throws IOException {
//		//1 读取配置文件
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		//2 根据配置文件构建SqlSessionFactory
//		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		//3 通过SqlSessionFactory创建SqlSession
//		SqlSession sqlSession = sessionFactory.openSession();
//		//4 sqlSession执行添加操作
//		//4.1 创建Customer对象，并向对象中添加数据
//		Customer c = new Customer();
//		c.setUsername("test1");
//		c.setJobs("student");
//		c.setPhone("97989898");
//		//4.2 执行SqlSession的插入方法，返回的是Sql影响的行数
//		int rows = sqlSession.insert("com.mapper.CustomerMapper.add",c);
//		//4.3通过返回结果判断插入操作是否执行成功
//		if(rows>0) {
//			System.out.println("插入了"+rows+"条记录");
//		}else {
//			System.out.println("插入失败");
//		}
//		//4.4 提交事务
//		sqlSession.commit();
//		//5、关闭sqlSession
//		sqlSession.close();
//	}
//	@Test
//	public void update() throws IOException {
//		//1 读取配置文件
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		//2 根据配置文件构建SqlSessionFactory
//		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		//3 通过SqlSessionFactory创建SqlSession
//		SqlSession sqlSession = sessionFactory.openSession();
//		//4 sqlSession执行更新操作
//		//4.1 创建Customer对象，并向对象中添加数据
//		Customer c = new Customer();
//		c.setId(5);
//		c.setUsername("rose111");
//		c.setJobs("donkey");
//		c.setPhone("31");
//		//4.2 执行SqlSession的更新方法，返回的是Sql影响的行数
//		int rows = sqlSession.update("com.mapper.CustomerMapper.update",c);
//		//4.3通过返回结果判断更新操作是否执行成功
//		if(rows>0) {
//			System.out.println("更新了"+rows+"条记录");
//		}else {
//			System.out.println("更新失败");
//		}
//		//4.4 提交事务
//		sqlSession.commit();
//		//5、关闭sqlSession
//		sqlSession.close();
//	}
//	@Test
//	public void del() throws IOException {
//		//1 读取配置文件
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		//2 根据配置文件构建SqlSessionFactory
//		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		//3 通过SqlSessionFactory创建SqlSession
//		SqlSession sqlSession = sessionFactory.openSession();
//		//4 sqlSession执行映射文件定义的sql
//		int row = sqlSession.delete("com.mapper.CustomerMapper.del",8);//数字代表id
//		if(row>0) {
//			System.out.println("删除了"+row+"行记录");
//		}else {
//			System.out.println("删除失败");
//		}
//		//提交事务
//		sqlSession.commit();
//		//5 关闭SqlSession
//		sqlSession.close();
//	}
//	@Test
//	//使用utils中的方法替换到2、3步骤中的
//	public void del() throws IOException {
//		//1 读取配置文件
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		MybatisUtils u = new MybatisUtils();
//		SqlSession sqlSession = u.getSession();
//		//4 sqlSession执行映射文件定义的sql
//		int row = sqlSession.delete("com.mapper.CustomerMapper.del",8);//数字代表id
//		if(row>0) {
//			System.out.println("删除了"+row+"行记录");
//		}else {
//			System.out.println("删除失败");
//		}
//		//提交事务
//		sqlSession.commit();
//		//5 关闭SqlSession
//		sqlSession.close();
//	}
}
