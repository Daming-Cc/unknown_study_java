package com.itheima.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 测试注解方式装配
 * @author Administrator
 *
 */
public class AnatationTest {

	public static void main(String[] args) {
		// 初始化容器，加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/itheima/annotation/bean2.xml");
		UserController userController = (UserController)ac.getBean("userController");
		userController.save();
	}

}
