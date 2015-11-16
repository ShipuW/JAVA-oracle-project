package com.cqupt.testenum;

public class Tesr {
	public static void main(String[] args) {
//		Season o = Season.spring;
		Season o = Season.autumn;
		System.out.println(o.name());
		System.out.println(o);
		System.out.println(o.toString());
		System.out.println(o.cal(100,100));
	}

}
