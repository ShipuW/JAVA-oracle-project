package com.chapter7.bank.dao;

import java.util.Set;

import com.chapter7.bank.entity.BankAccount;
import com.chapter7.bank.entity.BankStatement;

public interface BankAccountDao {
	BankAccount newBankAccount(BankAccount ba);//创建新账户
	BankAccount deposit(BankAccount ba, float amt);//存款
	BankAccount withdraw(BankAccount ba, float amt);//取款
	BankAccount transfer(BankAccount from, BankAccount to, float amt);//转账
	BankAccount findAccountByAccno(long accno);//查找账号信息
	Set<BankStatement> findStatementByAccno(long accno);//查找交易信息
}