package com.bank.view;

import java.util.Scanner;

import com.bank.biz.BankBizImpl;
import com.bank.model.BankAccount;

/**
 * 显示层，主要用于收集和显示信息
 * 
 * @author Administrator
 * 
 */
public class BankTest {
	public static void main(String[] args) {
		open();
	}
	/**
	 * 开户
	 */
	public static void open() {
		// 创建业务逻辑对象
		BankBizImpl impl = new BankBizImpl();
		// 输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入账户名");
		String name = sc.next();
		System.out.println("请输入金额");
		float balance = sc.nextFloat();
		BankAccount account = impl.insertAccount(name, balance);
		if (account == null) {
			System.out.println("开户失败!");
		} else {
			System.out.println("开户成功!开户信息如下");
			System.out.println("账户iD" + account.getAccno());
			System.out.println("账户名:" + account.getName());
			System.out.println("金额" + account.getBalance());
		}
	}
}
