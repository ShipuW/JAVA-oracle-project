package com.cqupt.practice1;

public class TestTImple {
	public static void main(String []args) {
		ThreadImple a = new ThreadImple("1-2600");
		ThreadImple b = new ThreadImple("A-Z");
		Thread s = new Thread(a);
		Thread w = new Thread(b);
		w.start();
		s.start();
	}
}
