package com.bank.model;

/**
 * 实体类
 * 
 * @author Administrator
 * 
 */
public class BankAccount {
	// 账户
	private int accno;
	// 账户名
	private String name;
	// 余额
	private float balance;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
}
