package com.bank.dao;

import com.bank.model.BankAccount;

/**
 * 业务逻辑主要用于，数据库的操作方法
 * 
 * @author Administrator
 * 
 */
public interface BankAccountDao {
	/**
	 * 开户方法，开启成功后我们要得到开户的详细信息
	 * @param name 账户名称
	 * @param balance 金额
	 * @return 开户详细信息
	 */
	public BankAccount open(String name, float balance);
}
