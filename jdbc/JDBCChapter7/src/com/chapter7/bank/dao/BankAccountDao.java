package com.chapter7.bank.dao;

import java.util.Set;

import com.chapter7.bank.entity.BankAccount;
import com.chapter7.bank.entity.BankStatement;

public interface BankAccountDao {
	BankAccount newBankAccount(BankAccount ba);//�������˻�
	BankAccount deposit(BankAccount ba, float amt);//���
	BankAccount withdraw(BankAccount ba, float amt);//ȡ��
	BankAccount transfer(BankAccount from, BankAccount to, float amt);//ת��
	BankAccount findAccountByAccno(long accno);//�����˺���Ϣ
	Set<BankStatement> findStatementByAccno(long accno);//���ҽ�����Ϣ
}