package com.jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class AccountDaoImpl implements AccountDao {
	//声明JdbcTemplate属性以及setter 方法
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int add(Account account) {
		String sql = "insert into account(username,balance) values(?,?)";
		//定义数组来存储sql语句当中的参数
		Object[] obj = new Object[] {
				account.getUsername(),
				account.getBalance()
		};
		
		int num = jdbcTemplate.update(sql,obj);
		return num;
	}

	@Override
	public int update(Account account) {
		String sql = "update account set username=?,balance=? where id=?";
		//定义数组来存储sql语句当中的参数
		Object[] obj = new Object[] {
				account.getUsername(),
				account.getBalance(),
				account.getId()
		};
		
		int num = jdbcTemplate.update(sql,obj);
		return num;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from account where id=?";
		return jdbcTemplate.update(sql,id);
	}

	/**
	 * 根据id查询
	 */
	public Account findById(int id) {
		//定义sql语句
		String sql = "select*from account where id=?";
		//创建一个新的BeanPropertyRowMapper对象
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		//将id绑定到sql语句中，并通过RowMapper返回一个Object类型的单行记录
		return jdbcTemplate.queryForObject(sql, rowMapper,id);
	}

	/**
	 * 查询所有的记录
	 */
	public List<Account> findAll() {
		String sql = "select*from account";
		//创建一个新的BeanPropertyRowMapper对象
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		return jdbcTemplate.query(sql,rowMapper);
	}

}
