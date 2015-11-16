package com.cqupt.join;

public class TestJoin {
	public static void main(String[] args) {
		MyThread1 a = new MyThread1();
		Thread t1 = new  Thread(a);
		MyThread2 b = new MyThread2();
		b.t = t1;
		b.start(); 
		t1.start();
	}

}
