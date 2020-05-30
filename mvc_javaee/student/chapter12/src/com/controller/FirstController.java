package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/*
 * ����������
 */
public class FirstController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		//����ModelAndView����
		ModelAndView mav = new ModelAndView();
		//��ģ�Ͷ������������
		mav.addObject("msg","You first mvc program");
		//������ͼ��
		mav.setViewName("/WEB-INF/first.jsp");
		return mav;
	}
	
}
