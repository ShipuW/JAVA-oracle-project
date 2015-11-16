package com.cqupt.join;

public class MyThread1 implements Runnable{
	/*MyThread t;*/

	@Override
	public  void run() {
		/*try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		synchronized(this){
		for (int i = 0; i < 10; i++) {
			System.out.println("current thread name:"+Thread.currentThread().getName());
		}
		}
	}
	
	
}
