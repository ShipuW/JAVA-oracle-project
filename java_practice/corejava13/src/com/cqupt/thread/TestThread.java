package com.cqupt.thread;

public class TestThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread name:"+Thread.currentThread().getName());
		MyThread thob1=new MyThread(123);
		MyThread thob2=new MyThread(321);
		MyThread thob3=new MyThread(567);
		Thread s1=new Thread(thob1);
		Thread s2=new Thread(thob2);
		Thread s3=new Thread(thob3);
		s1.start();
		try {
			s3.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s2.start();
		try {
			s3.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		s3.start();

	}

}
