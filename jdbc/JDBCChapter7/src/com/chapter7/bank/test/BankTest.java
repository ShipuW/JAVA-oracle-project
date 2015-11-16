package com.chapter7.bank.test;

import java.util.Scanner;

import com.chapter7.bank.biz.BankBizImpl;
import com.chapter7.bank.dao.BankAccountDao;
import com.chapter7.bank.dao.BankAccountDaoImpl;
import com.chapter7.bank.entity.BankAccount;

/*
 * ��ʾ�㣬
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
		print("���������ƣ�");
		String name = in.next();
		print("���������");
		float balance = in.nextFloat();
		
		BankBizImpl bankBiz = new BankBizImpl();
		BankAccountDao dao = new BankAccountDaoImpl();
		bankBiz.setDao(dao);
		BankAccount bank = bankBiz.open(name, balance);
		if(bank!=null){
			println("�����ɹ����˻���Ϣ��");
			println("�˻���ţ�"+bank.getAccno());
			println("�˻����ƣ�"+bank.getName());
			println("�˻���"+bank.getBalance());
		}
	}
	public void transfer(){
		Scanner in = new Scanner(System.in);
		print("������ת���˺ţ�");
		long fromaccno = in.nextLong();
		print("������ת���˺ţ�");
		long toaccno = in.nextLong();
		print("������ת�˽�");
		float balance = in.nextFloat();
		BankBizImpl bankBiz = new BankBizImpl();
		BankAccountDao dao = new BankAccountDaoImpl();
		bankBiz.setDao(dao);
		BankAccount bank = bankBiz.transfer(fromaccno, toaccno, balance);
		if(bank!=null){
			println("ת�˳ɹ���ת���˻���Ϣ��");
			println("�˻���ţ�"+bank.getAccno());
			println("�˻����ƣ�"+bank.getName());
			println("�˻���"+bank.getBalance());
		}
	}
}