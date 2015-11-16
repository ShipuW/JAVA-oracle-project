package cqupt.java.six;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		gets();
	}
	public static void gets(){
		System.out.println("请输入数字：");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		try {
			int a=Integer.parseInt(s);
			System.out.println("输入正确得到的数为：");
			System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
			gets();
		}
	}
}
