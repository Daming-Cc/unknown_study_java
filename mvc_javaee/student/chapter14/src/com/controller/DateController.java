package com.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 日期控制器类
 */
@Controller
public class DateController {
	@RequestMapping("CustomDate")
	//使用自定义类型数据绑定日期类型
	public String CustomDate(Date date) {
		System.out.println(date);
		return "success";
	}
}
