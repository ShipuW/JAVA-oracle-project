package com.bank.view;

import java.util.Scanner;

import com.bank.biz.BankBizImpl;
import com.bank.model.BankAccount;

/**
 * ��ʾ�㣬��Ҫ�����ռ�����ʾ��Ϣ
 * 
 * @author Administrator
 * 
 */
public class BankTest {
	public static void main(String[] args) {
		open();
	}
	/**
	 * ����
	 */
	public static void open() {
		// ����ҵ���߼�����
		BankBizImpl impl = new BankBizImpl();
		// ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������˻���");
		String name = sc.next();
		System.out.println("��������");
		float balance = sc.nextFloat();
		BankAccount account = impl.insertAccount(name, balance);
		if (account == null) {
			System.out.println("����ʧ��!");
		} else {
			System.out.println("�����ɹ�!������Ϣ����");
			System.out.println("�˻�iD" + account.getAccno());
			System.out.println("�˻���:" + account.getName());
			System.out.println("���" + account.getBalance());
		}
	}
}
