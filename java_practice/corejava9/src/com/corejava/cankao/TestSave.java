package com.corejava.cankao;

import java.util.Scanner;

public class TestSave {
	public static void main(String[] args) {
		do{
		System.out.println("***1...txt****");
		System.out.println("***2...doc****");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		FileSave filesave= Factoryobj.getobj(a);
		filesave.save();
		filesave.read();
		Scanner sb=new Scanner(System.in);
		System.out.println("�Ƿ������1����Yes or 0����No?");
		int b=sb.nextInt();
		}while(b==1);
	}

}

