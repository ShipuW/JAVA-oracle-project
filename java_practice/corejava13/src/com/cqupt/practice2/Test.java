package com.cqupt.practice2;

public class Test {
	public static void main(String[] args) {
		Thread t1=new MyNumberThread();
		MyCharThread t2=new MyCharThread();
		t2.t=t1;
		t1.start();
		t2.start();
	}
}
class MyNumberThread extends Thread{
	public void run(){
		for(int i=1;i<=26;i++){
			System.out.print(" "+(i*2-1));
			System.out.print(" "+i*2);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MyCharThread extends Thread{
	Thread t;
	public void run(){
		try {
			Thread .sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(char c='A';c<='Z';c++){
			System.out.print(" "+c);
			try {
				Thread.sleep(100);
				if (c=='D') t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
