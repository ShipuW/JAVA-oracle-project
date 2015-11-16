package com.cqupt.practice1;

public class TestThread extends Thread {

	public static void main(String []args) {
		MyThread1 a = new MyThread1("1-2600");
		MyThread1 b = new MyThread1("A-Z");
		a.start();
		b.start();
	}

}

