package com.factoryBean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
/*
 * 切面类
 */
public class MyAspect implements MethodInterceptor {
		public void check_Permissions() {
			System.out.println("模拟检查权限");
		}
		public void log() {
			System.out.println("模拟记录日志");
		}
	public Object invoke(MethodInvocation arg0) throws Throwable {
		check_Permissions();
		Object object = arg0.proceed();
		log();
		return object;
	}

}
