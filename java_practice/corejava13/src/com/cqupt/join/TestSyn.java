package com.cqupt.join;

public class TestSyn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
//		m1.t=m0;
		t1.start();
		System.out.println(t1.equals(t2));
		t2.start();
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
