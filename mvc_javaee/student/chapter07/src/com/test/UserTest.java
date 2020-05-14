package com.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.po.User;
import com.utils.MybatisUtils;

public class UserTest {

	public static void main(String[] args) {
		//加载配置文件
		SqlSession session = MybatisUtils.getSession();
		List<User> list = session.selectList("com.mapper.UserMapper.findAllUser");
		for(User u:list) {
			System.out.println(u);
		}
	}

}
