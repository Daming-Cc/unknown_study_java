package com.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.aspect.MyAspect;

public class JdkProxy implements InvocationHandler{
	//声明目标类接口
	private UserDao userDao;
	//创建代理方法
	public Object createProxy(UserDao userDao) {
		this.userDao = userDao;
		//1、类加载器
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		//2、 被代理 对线实现的所有接口
		Class<?>[] interfaces = userDao.getClass().getInterfaces();
		//使用代理类，进行增强，返回的是代理后的对象
		return Proxy.newProxyInstance(classLoader, interfaces, this);
	}
	/**
	 * proxy:被代理后的对象
	 * method：将鸭皮被执行的方法的信息
	 * args：执行方法时需要的参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//声明切面
		MyAspect myAspect = new MyAspect();
		//前增强
		myAspect.check_Permissions();
		//在目标类上调用方法。并传入参数
		method.invoke(userDao, args);
		//后增强
		myAspect.log();
		return null;
	}

}
