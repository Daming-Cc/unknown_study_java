package com.itheima.annotation;

import org.springframework.stereotype.Repository;

/*
 * 持久层
 * 将UserDaoImpl类标识为Spring当中的Bean，写法相当于
 * <bean id="userDao" class="com.itheima.annotation.UserDao"/>
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{
	public void save() {
		System.out.println("userdao...save...");
	}
}
