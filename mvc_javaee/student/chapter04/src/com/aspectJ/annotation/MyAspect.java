package com.aspectJ.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//切面类
@Aspect
@Component
public class MyAspect {
	//定义切入点表达式
	@Pointcut("execution(* com.jdk.*.*(..))")
	public void myPoinCut() {}
	//前置通知
	@Before("myPoinCut()")
	public void myBefore(JoinPoint joinPoint) {
		System.out.print("前置通知：模拟执行权限检查...,");
		System.out.println("目标类是："+joinPoint.getTarget());
		System.out.println(",被植入增强处理的目标方法为："+joinPoint.getSignature().getName());
		
	}
	//后置通知
	@AfterReturning("myPoinCut()")
	public void myAfterReturning(JoinPoint joinPoint) {
		System.out.print("后置通知：模拟记录日志...,");
		System.out.println(",被植入增强处理的目标方法为："+joinPoint.getSignature().getName());
	}
	//环绕通知
	/**
	 * 
	 * @param proceedingJoinPoint 是 JoinPoint的子接口,表示可以执行目标方法
	 * 1、返回值必须是Object类型
	 * 2、必须接收一个参数，类型为ProceedingJoinPoint
	 * 3、必须 throws Throwable
	 * @throws Throwable 
	 */
	@Around("myPoinCut()")
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		//开始
		System.out.println("环绕通知：执行目标方法之前，模拟开启事务...");
		//执行当前的目标方法
		Object object = proceedingJoinPoint.proceed();
		//结束
		System.out.println("环绕结束：执行目标方法之后，模拟关闭事务...");
		return object;
	}
	//异常通知
	@AfterThrowing(value="myPoinCut()",throwing="e")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("异常通知：出错了"+e.getMessage());
	}
	//最终通知
	@After("myPoinCut()")
	public void myAfter() {
		System.out.println("最终通知：模拟方法结束后的释放资源...");
	}
}
