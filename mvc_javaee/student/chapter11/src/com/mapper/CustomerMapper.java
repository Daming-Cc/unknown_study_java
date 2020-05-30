package com.mapper;

import com.po.Customer;

public interface CustomerMapper {
	//创建一个接口,根据id查询
	public Customer findCustomerById(int id);
}
