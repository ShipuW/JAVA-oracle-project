package com.chapter7.bank.biz;

import com.chapter7.bank.entity.BankAccount;

/*
 * ҵ��ӿ�
 */
public interface BankBiz {
	BankAccount open(String name, float balance);//����
	BankAccount deposit(long accno, float amt);//���
	BankAccount withdraw(long accno, float amt);//ȡ��
	BankAccount transfer(long from, long to, float amt);//ת��
}