package com.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.dao.UserDao;
import com.core.po.Customer;
import com.core.po.User;
import com.core.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	public User findByUser(String username, String password) {
		return userDao.findByUser(username, password);
	}
}
