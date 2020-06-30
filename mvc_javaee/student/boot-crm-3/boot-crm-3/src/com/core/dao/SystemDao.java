package com.core.dao;

import java.util.List;

//对应生成的基础表
import com.core.po.System;

public interface SystemDao {
	//客户列表
	public List<System> findAll(System system);
	// 客户数
	public Integer selectSystemListCount(System system);
	// 创建客户
	public int createSystem(System system);
	// 通过id查询客户
	public System getSystemById(Integer id);
	// 更新客户信息
	public int updateSystem(System system);
	// 删除客户
	int deleteSystem (Integer id);
}
