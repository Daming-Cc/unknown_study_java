package com.core.service.impl;

import com.common.utils.Page;
import com.core.dao.SystemDao;
import com.core.po.Customer;
import com.core.po.System;
import com.core.service.SystemService;

import java.util.List;
//调用到各种方法接口的服务,参照customer更改数据
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SystemServiceImpl implements SystemService {
	@Autowired
	public SystemDao systemDao;
	
	/*
	 * 系统列表
	 */
	public Page<System> list(int page, int rows, String systName, String systSource, String systIndustry,
			String systLevel) {
		// 创建系统对象
		System system = new System();
		// 判断系统名称
		if(StringUtils.isNotBlank(systName)){
			system.setSyst_name(systName);
		}
		// 判断系统信息来源
		if(StringUtils.isNotBlank(systSource)){
			system.setSyst_source(systSource);
		}
		// 判断系统所属行业
		if(StringUtils.isNotBlank(systIndustry)){
			system.setSyst_industry(systIndustry);
		}
		// 判断系统级别
		if(StringUtils.isNotBlank(systLevel)){
			system.setSyst_level(systLevel);
		}
		// 当前页
		system.setStart((page-1) * rows) ;
		// 每页数
		system.setRows(rows);
		// 查询系统列表
		List<System> systems = 
				systemDao.findAll(system);
		// 查询系统列表总记录数
		Integer count = systemDao.selectSystemListCount(system);
		// 创建Page返回对象
		Page<System> result = new Page<>();
		result.setPage(page);
		result.setRows(systems);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}
	//创建系统
	@Override
	public int createSystem(System system) {
		return systemDao.createSystem(system);
	}
	//通过id查询系统
	@Override
	public System getSystemById(Integer id) {
		System system = systemDao.getSystemById(id);
	    return system;	
	}
	//更新系统
	@Override
	public int updateSystem(System system) {
		 return systemDao.updateSystem(system);
	}
	//删除系统
	@Override
	public int deleteSystem(Integer id) {
		 return systemDao.deleteSystem(id);	
	}

}
