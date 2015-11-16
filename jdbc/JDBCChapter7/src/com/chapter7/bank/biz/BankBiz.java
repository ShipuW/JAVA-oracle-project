package com.chapter7.bank.biz;

import com.chapter7.bank.entity.BankAccount;

/*
 * 业务接口
 */
public interface BankBiz {
	BankAccount open(String name, float balance);//开户
	BankAccount deposit(long accno, float amt);//存款
	BankAccount withdraw(long accno, float amt);//取款
	BankAccount transfer(long from, long to, float amt);//转账
}