package com.jdk;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	public void add() {
		System.out.println("添加");
		int i = 10/0;

	}

	public void delete() {
		System.out.println("删除");
	}

}
