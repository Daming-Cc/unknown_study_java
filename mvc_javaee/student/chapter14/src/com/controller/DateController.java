package com.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * ���ڿ�������
 */
@Controller
public class DateController {
	@RequestMapping("CustomDate")
	//ʹ���Զ����������ݰ���������
	public String CustomDate(Date date) {
		System.out.println(date);
		return "success";
	}
}
