package com.chapter7.bank.test;

import java.util.Scanner;

import com.chapter7.bank.biz.BankBizImpl;
import com.chapter7.bank.dao.BankAccountDao;
import com.chapter7.bank.dao.BankAccountDaoImpl;
import com.chapter7.bank.entity.BankAccount;

/*
 * 显示层，
 */
public class BankTest {
	public static void main(String args[]){
		BankTest test = new BankTest();
//		test.open();
		test.transfer();
	}
	public static void print(String str){
		System.out.print(str);
	}
	public static void println(String str){
		System.out.println(str);
	}
	public void open(){
		Scanner in = new Scanner(System.in);
		print("请输入名称：");
		String name = in.next();
		print("请输入存款金额：");
		float balance = in.nextFloat();
		
		BankBizImpl bankBiz = new BankBizImpl();
		BankAccountDao dao = new BankAccountDaoImpl();
		bankBiz.setDao(dao);
		BankAccount bank = bankBiz.open(name, balance);
		if(bank!=null){
			println("开户成功，账户信息：");
			println("账户编号："+bank.getAccno());
			println("账户名称："+bank.getName());
			println("账户金额："+bank.getBalance());
		}
	}
	public void transfer(){
		Scanner in = new Scanner(System.in);
		print("请输入转出账号：");
		long fromaccno = in.nextLong();
		print("请输入转入账号：");
		long toaccno = in.nextLong();
		print("请输入转账金额：");
		float balance = in.nextFloat();
		BankBizImpl bankBiz = new BankBizImpl();
		BankAccountDao dao = new BankAccountDaoImpl();
		bankBiz.setDao(dao);
		BankAccount bank = bankBiz.transfer(fromaccno, toaccno, balance);
		if(bank!=null){
			println("转账成功，转出账户信息：");
			println("账户编号："+bank.getAccno());
			println("账户名称："+bank.getName());
			println("账户余额："+bank.getBalance());
		}
	}
}