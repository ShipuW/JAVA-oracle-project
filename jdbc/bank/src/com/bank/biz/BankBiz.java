package com.bank.biz;

import com.bank.model.BankAccount;

/**
 * ҵ���߼���ӿڣ���Ҫ�����жϷ���
 * @author ��˧
 *
 */
public interface BankBiz {
	/**
	 * ����
	 * @param name
	 * @param balance
	 * @return
	 */
	public BankAccount insertAccount(String name,float balance);
}
