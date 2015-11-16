package com.cqupt.join;

public class MyThread2 extends Thread{
	Thread t;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("current thread name:"+Thread.currentThread().getName());
	}
	
	

}
