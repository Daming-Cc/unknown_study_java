package com.jdbc;

import java.util.List;

public interface AccountDao {
	public int  add(Account account);
	public int update(Account account);
	public int delete(int id);
	public Account findById(int id);
	public List<Account> findAll();
}
