package com.cqupt.practice1;

public class MyThread1 extends Thread {
	String s;

	MyThread1(String s) {
		this.s = s;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {

			System.out.println(s);
		}
	}

}
