package com.cqupt.string;

public class Account {
	long id;
	String password;
	String name;
	String personId;
	String email;
	double balance;
	
	public Account(){ 
	}
	
	public Account(String password, String name, String personId, String email) {
		this.password = password;
		this.name = name;
		this.personId = personId;
		this.email = email;
	}

	public void deposit(double money) {
		this.balance += money;
	}

	public void name(double money) {
		this.balance -= money;

	}

}
