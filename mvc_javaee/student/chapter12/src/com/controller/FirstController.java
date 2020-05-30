package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/*
 * 控制器的类
 */
public class FirstController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		//创建ModelAndView对象
		ModelAndView mav = new ModelAndView();
		//向模型对象中添加数据
		mav.addObject("msg","You first mvc program");
		//设置视图名
		mav.setViewName("/WEB-INF/first.jsp");
		return mav;
	}
	
}
