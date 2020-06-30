package com.core.service;
import java.util.List;
import com.common.utils.Page;
import com.core.po.System;
//生成对应方法接口服务
public interface SystemService {
	public Page<System> list(int page, int rows, String custName, String custSource,
			String custIndustry, String custLevel);
	public int createSystem(System system);
	// 通过id查询客户
	public System getSystemById(Integer id);
	// 更新客户
	public int updateSystem(System system);
	// 删除客户
	public int deleteSystem(Integer id);
}
