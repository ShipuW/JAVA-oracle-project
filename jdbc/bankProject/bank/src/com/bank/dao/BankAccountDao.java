package com.bank.dao;

import com.bank.model.BankAccount;

/**
 * ҵ���߼���Ҫ���ڣ����ݿ�Ĳ�������
 * 
 * @author Administrator
 * 
 */
public interface BankAccountDao {
	/**
	 * ���������������ɹ�������Ҫ�õ���������ϸ��Ϣ
	 * @param name �˻�����
	 * @param balance ���
	 * @return ������ϸ��Ϣ
	 */
	public BankAccount open(String name, float balance);
}
