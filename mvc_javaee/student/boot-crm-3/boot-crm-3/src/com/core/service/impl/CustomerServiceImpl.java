package com.core.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.Page;
import com.core.dao.CustomerDao;
import com.core.po.Customer;
import com.core.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDao customerDao;

	/**
	 * �ͻ��б�
	 */
	public Page<Customer> list(int page, int rows, String custName, String custSource,
			String custIndustry, String custLevel) {
		// �����ͻ�����
        Customer customer = new Customer();
		// �жϿͻ�����
		if(StringUtils.isNotBlank(custName)){
			customer.setCust_name(custName);
		}
		// �жϿͻ���Ϣ��Դ
		if(StringUtils.isNotBlank(custSource)){
			customer.setCust_source(custSource);
		}
		// �жϿͻ�������ҵ
		if(StringUtils.isNotBlank(custIndustry)){
			customer.setCust_industry(custIndustry);
		}
		// �жϿͻ�����
		if(StringUtils.isNotBlank(custLevel)){
			customer.setCust_level(custLevel);
		}
		// ��ǰҳ
		customer.setStart((page-1) * rows) ;
		// ÿҳ��
		customer.setRows(rows);
		// ��ѯ�ͻ��б�
		List<Customer> customers = 
                           customerDao.findAll(customer);
		// ��ѯ�ͻ��б��ܼ�¼��
		Integer count = customerDao.selectCustomerListCount(customer);
		// ����Page���ض���
		Page<Customer> result = new Page<>();
		result.setPage(page);
		result.setRows(customers);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}
	/**
	 * �����ͻ�
	 */
	@Override
	public int createCustomer(Customer customer) {
	    return customerDao.createCustomer(customer);
	}
	/**
	 * ͨ��id��ѯ�ͻ�
	 */
	@Override
	public Customer getCustomerById(Integer id) {	
	    Customer customer = customerDao.getCustomerById(id);
	    return customer;		
	}
	/**
	 * ���¿ͻ�
	 */
	@Override
	public int updateCustomer(Customer customer) {
	    return customerDao.updateCustomer(customer);
	}
	/**
	 * ɾ���ͻ�
	 */
	@Override
	public int deleteCustomer(Integer id) {
	    return customerDao.deleteCustomer(id);	
	}
	
	

}
