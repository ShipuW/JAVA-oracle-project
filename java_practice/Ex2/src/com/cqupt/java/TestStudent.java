package com.cqupt.java;

import java.util.Scanner;

public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stu = new Student[5];
		for (int i = 0; i < stu.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("please input a student's score:");
			stu[i].score = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < stu.length; i++) {
			sum += stu[i].score;
		}
		System.out.println("average=" + sum / 5);
	}

}
