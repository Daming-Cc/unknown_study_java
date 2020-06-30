package com.core.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.core.po.Customer;
import com.core.po.User;

public interface UserService {
	public User findByUser( String username,String password);
	
}
