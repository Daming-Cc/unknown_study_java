package com.core.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.utils.Page;
import com.core.po.BaseDict;
import com.core.po.System;
import com.core.po.User;
import com.core.service.BaseDictService;
import com.core.service.SystemService;

@Controller
public class SystemController {
	@Autowired
	private SystemService systemService;
	@Autowired
	private BaseDictService baseDictService;
	//系统来源
	@Value("${system.from.type}") private String FROM_TYPE; 
	// 系统所属行业
	@Value("${system.industry.type}") private String INDUSTRY_TYPE; 
	// 系统级别
	@Value("${system.level.type}") private String LEVEL_TYPE;

	/**
	 * 系统列表
	 * 
	 * @param page
	 * @param rows
	 * @param systName
	 * @param systSource
	 * @param systIndustry
	 * @param systLevel
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/system/list.action")
	public String sys_list(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "10") Integer rows, String systName, String systSource, String systIndustry,
			String systLevel, Model model) {
		// 条件查询所有客户
		Page<System> systems = systemService.list(page, rows, systName, systSource, systIndustry,
				systLevel);
		model.addAttribute("page", systems);
		// 客户来源
		List<BaseDict> fromType = baseDictService.findBaseDictByTypeCode(FROM_TYPE);
		// 客户所属行业
		List<BaseDict> industryType = baseDictService.findBaseDictByTypeCode(INDUSTRY_TYPE);
		// 客户级别
		List<BaseDict> levelType = baseDictService.findBaseDictByTypeCode(LEVEL_TYPE);
		// 添加参数
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		model.addAttribute("systName", systName);
		model.addAttribute("systSource", systSource);
		model.addAttribute("systIndustry", systIndustry);
		model.addAttribute("systLevel", systLevel);
		return "system";
	}

	/**
	 * 创建客户
	 */
	@RequestMapping("/system/create.action")
	@ResponseBody
	public String systemCreate(System system, HttpSession session) {
		// 获取Session中的当前用户信息
		User user = (User) session.getAttribute("user");
		// 将当前用户id存储在客户对象中
		system.setSyst_create_id(user.getUserId());
		// 创建Date对象
		Date date = new Date();
		// 得到一个Timestamp格式的时间，存入mysql中的时间格式“yyyy/MM/dd HH:mm:ss”
		Timestamp timeStamp = new Timestamp(date.getTime());
		system.setSyst_createtime(timeStamp);
		// 执行Service层中的创建方法，返回的是受影响的行数
		int rows = systemService.createSystem(system);
		if (rows > 0) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

	/**
	 * 通过id获取客户信息
	 */
	@RequestMapping("/system/getSystemById.action")
	@ResponseBody
	public System getSystemById(Integer id) {
		System system = systemService.getSystemById(id);
		return system;
	}

	/**
	 * 更新客户
	 */
	@RequestMapping("/system/update.action")
	@ResponseBody
	public String systemUpdate(System system) {
		int rows = systemService.updateSystem(system);
		if (rows > 0) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

	/**
	 * 删除客户
	 */
	@RequestMapping("/system/delete.action")
	@ResponseBody
	public String systemDelete(Integer id) {
		int rows = systemService.deleteSystem(id);
		if (rows > 0) {
			return "OK";
		} else {
			return "FAIL";
		}
	}
}
