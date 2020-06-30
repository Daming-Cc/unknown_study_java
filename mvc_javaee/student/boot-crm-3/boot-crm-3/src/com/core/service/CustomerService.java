package com.core.service;

import java.util.List;

import com.common.utils.Page;
import com.core.po.Customer;

public interface CustomerService {
	public Page<Customer> list(int page, int rows, String custName, String custSource,
			String custIndustry, String custLevel);
	public int createCustomer(Customer customer);
	// 通过id查询客户
	public Customer getCustomerById(Integer id);
	// 更新客户
	public int updateCustomer(Customer customer);
	// 删除客户
	public int deleteCustomer(Integer id);
}
