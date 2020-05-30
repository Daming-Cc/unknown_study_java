package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Orders;

/*
 * 订单的控制器
 */
@Controller
public class OrdersController {
	//跳转到订单的界面
	@RequestMapping("toOrders")	//映射路径:映射到需要跳转到的jsp文件
	public String toOrders() {
		return "orders";
	}
	//查询订单
	@RequestMapping("findOrders")
	public String findOrders(Orders o) {
		Integer orderId = o.getOrdersid();
		String username = o.getUser().getUsername();
		System.out.println("查询到:");
		System.out.println("订单号:"+orderId);
		System.out.println("用户名:"+username);
		System.out.println("--------------------");
		return "success";	//跳转到的jsp界面
	}
}
