package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 测试依赖注入
 */
public class TestrDI {

	public static void main(String[] args) {
		//初始化容器，并且加载配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从容器当中取出userService
		UserService userService = (UserService)applicationContext.getBean("userService");
		//调用say方法
		userService.say();
		
	}

}
