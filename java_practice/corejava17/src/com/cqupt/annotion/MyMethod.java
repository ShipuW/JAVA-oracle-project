package com.cqupt.annotion;

public class MyMethod {
	public void m1(String s){
		System.out.println("Œ“ «m1");
	}
	@MyAnnotaion(value="exe1",order=100)
	public void m2(String s){
		System.out.println("m(2)"+s);
	}
	@MyAnnotaion(value="exe2",order=200)
	public void m3(String s){
		System.out.println("m3()"+s);
	}
	
}
