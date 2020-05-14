package com.itheima.instance.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * 测试构造器实例化
 */
public class InstanceTest2 {

	public static void main(String[] args) {
		// ApplicationContext在加载配置文件的时候，对bean进行了实例化
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/itheima/instance/static_factory/bean2.xml");
		//获取bean(通过xmk中的id)
		Bean2 bean2 = (Bean2)ap.getBean("bean2");
		System.out.println(bean2);
		
	}
	
}
