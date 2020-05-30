package com.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerDao;
import com.po.Customer;
import com.service.CustomerService;
@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	//
	private CustomerDao customerDao;
	//
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
		//int i = 10/0;	//Ä£Äâ³ö´í
	}

}
