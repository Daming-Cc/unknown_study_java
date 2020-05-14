package com.itheima.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

/*
 * 控制层
 */
@Controller("userController")//相当于在配置文件当中编写<bean id="userController" class="com.itheima.annotation.userController"/>
public class UserController {
	@Resource(name="userService")//相当在配置文件当中编写<property name="userService" ref="userService"></property>
	private UserService userService;
	
	public void save() {
		userService.save();
		System.out.println("UserController...save....");
	}
}
