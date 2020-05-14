package com.itheima.instance.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 测试构造器实例化
 */
public class InstanceTest1 {

	public static void main(String[] args) {
		// ApplicationContext在加载配置文件的时候，对bean进行了实例化
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/itheima/instance/constructor/Bean1.xml");
		//获取bean(通过xmk中的id)
		Bean1 bean1 = (Bean1)ap.getBean("bean1");
		System.out.println(bean1);
		
	}
	
}
