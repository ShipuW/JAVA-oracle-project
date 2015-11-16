package com.cqupt.list;

import java.util.Scanner;

public class Menuehelp {
	public static int menu(){
		System.out.println("************welcome************");
		System.out.println("********1.addStudent***********");
		System.out.println("********2.searchStudent********");
		System.out.println("********3.deleteStudent********");
		System.out.println("********4.help*****************");
		System.out.println("********5.exit*****************");
		System.out.println("*******************************");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	}

}
