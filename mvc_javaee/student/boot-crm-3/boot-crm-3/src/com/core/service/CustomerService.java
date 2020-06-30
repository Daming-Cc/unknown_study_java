package com.core.service;

import java.util.List;

import com.common.utils.Page;
import com.core.po.Customer;

public interface CustomerService {
	public Page<Customer> list(int page, int rows, String custName, String custSource,
			String custIndustry, String custLevel);
	public int createCustomer(Customer customer);
	// ͨ��id��ѯ�ͻ�
	public Customer getCustomerById(Integer id);
	// ���¿ͻ�
	public int updateCustomer(Customer customer);
	// ɾ���ͻ�
	public int deleteCustomer(Integer id);
}
