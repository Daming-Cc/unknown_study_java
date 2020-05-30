package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Orders;

/*
 * �����Ŀ�����
 */
@Controller
public class OrdersController {
	//��ת�������Ľ���
	@RequestMapping("toOrders")	//ӳ��·��:ӳ�䵽��Ҫ��ת����jsp�ļ�
	public String toOrders() {
		return "orders";
	}
	//��ѯ����
	@RequestMapping("findOrders")
	public String findOrders(Orders o) {
		Integer orderId = o.getOrdersid();
		String username = o.getUser().getUsername();
		System.out.println("��ѯ��:");
		System.out.println("������:"+orderId);
		System.out.println("�û���:"+username);
		System.out.println("--------------------");
		return "success";	//��ת����jsp����
	}
}
