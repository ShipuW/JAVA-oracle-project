package com.bank.biz;

import com.bank.model.BankAccount;

/**
 * ҵ���߼���,�ӿ�,��Ҫ�����жϷ���
 * @author Administrator
 *
 */
public interface BankBiz {
	/**
	 * ����
	 * @param name
	 * @param balance
	 * @return
	 */
	public BankAccount insertAccount(String name, float balance);
}
