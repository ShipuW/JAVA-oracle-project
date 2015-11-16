package com.cqupt.thread;

public class Testextends {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread name:"+Thread.currentThread().getName());
		MyThead m1=new MyThead();
		MyThead m2=new MyThead();
		MyThead m3=new MyThead();
		m1.start();
		m2.start();
		m3.start();
		
	}

}
