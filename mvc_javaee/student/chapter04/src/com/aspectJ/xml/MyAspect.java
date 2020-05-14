package com.aspectJ.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	//前置通知
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("前置通知，模拟执行权限检查");
		System.out.println("目标类是："+joinPoint.getTarget());
		System.out.println(",被植入增强处理的目标方法为:"+joinPoint.getSignature().getName());
	}
	//后置通知
	public void myAfterReturn(JoinPoint joinPoint) {
		System.out.println("后置通知，模拟记录日志为...");
		System.out.println(",被植入增强处理的目标方法为:"+joinPoint.getSignature().getName());
	}
	//环绕通知
	/* 1、返回值必须是Object类型
	 * 2、必须接收一个参数，类型为ProceedingJoinPoint
	 * 3、必须throws Throwable
	 * 
	 */
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		//开始
		System.out.println("现在开始环绕");
		//执行当前的目标方法
		Object object = proceedingJoinPoint.proceed();
		//结束
		System.out.println("环绕结束，执行目标方法之后，模拟关闭事务");
		return object;
	}
	//异常通知
	public void myAfterThrow(JoinPoint joinPoint,Throwable e) {
		System.out.println("异常通知:出错了"+e.getMessage());			//从异常的参数e中调用到message方法来查看
	}
	//最终通知
	public void myAfter() {
		System.out.println("最终通知：模拟方法结束后的释放资源...");
	}

}
