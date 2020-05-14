package com.test;

import org.apache.ibatis.session.SqlSession;

import com.po.Customer;
import com.utils.MybatisUtils;

public class UpdateTest {
	/*
	 * 更新客户
	 */
	public static void main(String[] args) {
		//获取Sqlsession
		SqlSession session = MybatisUtils.getSession();
		Customer c = new Customer();
		c.setId(5);	//需要更新数据的id
		//需要更新的数据
		c.setUsername("谢田安泽");	
		c.setJobs("婴儿");
		c.setPhone("1");
		int rows = session.update("com.mapper.CustomerMapper.updateCustomer",c);
		if (rows>0) {
			System.out.println("更新了"+rows+"条记录");
		}else {
			System.out.println("更新失败");
		}
		session.commit();//提交事务
		session.close();//关闭sqlsession
	}
	
}
