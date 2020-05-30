package com.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



/*
 * 控制器的类
 */
@Controller
@RequestMapping(value="/firstController")
public class FirstController{
	@RequestMapping(value="/handleRequest")
	//public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
	public String handleRequest(Model model) throws Exception {

		//创建ModelAndView对象
		//ModelAndView mav = new ModelAndView();
		//向模型对象中添加数据
		//mav.addObject("msg","You first mvc program");
		//设置视图名
		//mav.setViewName("/WEB-INF/first.jsp");
		model.addAttribute("msg","first MVC program");
		//return mav;
		return "first";
	}
	
}

