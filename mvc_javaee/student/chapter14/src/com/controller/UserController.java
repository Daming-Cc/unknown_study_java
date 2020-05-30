package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pojo.User;

@Controller
public class UserController {
	@RequestMapping("selectUser")
	//public String selectUser(HttpServletRequest req ) {
	//	String id = req.getParameter("id");
	public String selectUser(@RequestParam(value="userId")int id) {
		System.out.println(id);
		return "success";
	}
	//跳转到注册界面
	@RequestMapping("toRegister")
	public String toRegister() {

		return "register";
	}
	//注册
	@RequestMapping("register")
	public String register(User user) {
		System.out.println("注册信息:");
		System.out.println(user);
		System.out.println("----------------------");
		return "success";
		
	}
}
