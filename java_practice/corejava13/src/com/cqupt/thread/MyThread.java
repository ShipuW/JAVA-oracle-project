package com.cqupt.thread;

public class MyThread implements Runnable{
	public MyThread(int a){
		this.a=a;
	}
	private int a;
	public void run(){
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		for (int i = 0; i < 10; i++) {
			
			System.out.println("a="+a);
			
		}
	}
	
	
	

}
