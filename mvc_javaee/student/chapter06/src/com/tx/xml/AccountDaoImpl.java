package com.tx.xml;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 
	 * @param outUser �����
	 * @param inUser �տ���
	 * @param money �տ���
	 */
	public void transfer(String outUser,String inUser,Double money) {
		//�տ�ʱ���տ��˻������=�������+������
		String sql1 = "update account set balance=balance+? where username=?";
		jdbcTemplate.update(sql1,money,inUser);
		//ģ�����
		int i = 10/0;
		//���ʱ�򣬻���˻����=�������-������
		String sql2 = "update account set balance=balance-? where username=?";
		jdbcTemplate.update(sql2,money,outUser);
	}
}
