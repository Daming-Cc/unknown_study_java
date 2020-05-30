package com.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.dao.CustomerDao;
import com.po.Customer;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {

	public Customer findCustomerById(int id) {
		return this.getSqlSession().selectOne("com.po.CustomerMapper.findCustomerById",id);
	}
	public void addCustomer(Customer customer) {
		this.getSqlSession().insert("com.mapper.CustomerMapper.add");
	}

}
