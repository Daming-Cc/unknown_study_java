package com.dao;

import com.po.Customer;

public interface CustomerDao {
	public Customer findCustomerById(int id);

	public void addCustomer(Customer customer);
}
