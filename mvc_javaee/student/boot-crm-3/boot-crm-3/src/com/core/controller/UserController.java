package com.core.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.core.po.Customer;
import com.core.po.User;
import com.core.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login.action")
	public String findByUser(String username,String password,HttpSession session,Model model) {
		User u = userService.findByUser(username, password);
		if(u!=null) {
			session.setAttribute("user", u);
			//这里可更改默认登录进去的界面
			return "redirect:/customer/list.action";//重定向
			//return "redirect:/system/list.action";//重定向
			//return "forward:/customer/list.action";//转发
			//return "customer";
		}
		model.addAttribute("msg", "用户名或密码错误");
		return "login";
	}
	
	
	
}
