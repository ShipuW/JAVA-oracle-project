package com.bank.biz;

import com.bank.model.BankAccount;

/**
 * 业务逻辑层,接口,主要用于判断方法
 * @author Administrator
 *
 */
public interface BankBiz {
	/**
	 * 新增
	 * @param name
	 * @param balance
	 * @return
	 */
	public BankAccount insertAccount(String name, float balance);
}
