package cqupt.java.four2;

import java.util.Arrays;

public class Test {

	/**
	 * �������ܣ����Գ��򣬶������˺������б��������
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccount [] bac = new BankAccount[5];
		bac[0] = new BankAccount("0000",12000);
		bac[1] = new BankAccount("0001",10000);
		bac[2] = new BankAccount("0002",20000);
		bac[3] = new BankAccount("0003",1300);
		bac[4] = new BankAccount("0004",9000);
		//����
		Arrays.sort(bac);
		
		for (BankAccount bankAccount : bac) {
			System.out.println(bankAccount);
		}
	}

}
