package com.tx.xml;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 
	 * @param outUser 汇款人
	 * @param inUser 收款人
	 * @param money 收款金额
	 */
	public void transfer(String outUser,String inUser,Double money) {
		//收款时候，收款账户的余额=现有余额+所汇金额
		String sql1 = "update account set balance=balance+? where username=?";
		jdbcTemplate.update(sql1,money,inUser);
		//模拟出错
		int i = 10/0;
		//汇款时候，汇款账户余额=现有余额-所汇金额
		String sql2 = "update account set balance=balance-? where username=?";
		jdbcTemplate.update(sql2,money,outUser);
	}
}
