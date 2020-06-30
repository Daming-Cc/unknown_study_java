package com.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.core.po.Customer;
import com.core.po.User;

public interface UserDao {
	public User findByUser(@Param("username") String username,@Param("password") String password);
	public List<Customer> findAll(Customer customer);
}
