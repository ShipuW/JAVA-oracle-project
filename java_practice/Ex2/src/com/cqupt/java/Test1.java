package com.cqupt.java;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("please input a score:");
			int a = sc.nextInt();
			if (a <= 100 && a >= 90) {
				System.out.println("��");
			} else if (a >= 80 && a < 90) {
				System.out.println("��");
			} else if (a >= 70 && a < 80) {
				System.out.println("��");
			} else if (a >= 60 && a < 70) {
				System.out.println("����");
			} else if (a < 60) {
				System.out.println("������");
			} else {
				System.out.println("�������");
			}

		}
	}
}
