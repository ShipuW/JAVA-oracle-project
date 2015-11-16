package com.cqupt.string;

public class TestString {

	public static void main(String[] args) {
	
		String s1 = new String("zeng");
		String s2 = new String("zeng");
		
		System.out.println(s1==s2);//比较的是地址
		System.out.println(s1.equals(s2)); //比较的是内容
		System.out.println("---------------");
		String a1 = "Hello";
		String a2 = "Hello Hello cqupt Hello法轮功Hello法轮功";
		System.out.println(a1==a2);//true
		System.out.println(a1.equals(a2));//true
		
		System.out.println(a1.charAt(0));
		System.out.println(a1.length());
		System.out.println(a2.indexOf("cqupt"));
		String ss = a2.substring(a2.indexOf("cqupt"),a2.indexOf("cqupt")+"cqupt".length());
		System.out.println(ss);
		System.out.println(a2);
		System.out.println(a2.replaceAll("法轮功", "共产党好"));
		
		String ip ="192,168,10,123,hello,world";
		//String[] s = new String[6];
		String [] as = ip.split(","); //以某个标示 分割字符串  分割成数组
		for (int i = 0; i < as.length; i++) {
			System.out.println(as[i]);
		}
		
	}

}
