package com.cqupt.practice1;

public class ThreadImple implements Runnable {
	String s;

	public ThreadImple(String s) {
		this.s = s;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {

			System.out.println(s);
		}

	}

}
