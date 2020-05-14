package com.itheima.assemble;

import java.util.List;

public class User {
	private String userName;
	private String passWord;
	private List<String> list;
	/*
	 * 1、使用构造注入
	 * 1.1、提供带有所有参数的有参构造方法
	 */
	public User(String userName, String passWord, List<String> list) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.list = list;
	}
	/*
	 * 2、设值注入
	 * 2.1、带有无参的构造函数
	 * 2.2为所以的属性提供setter方法
	 */
	public User() {
		super();
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", list=" + list + "]";
	}
}
