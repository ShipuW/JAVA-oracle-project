package cqupt.java.six;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		gets();
	}
	public static void gets(){
		System.out.println("���������֣�");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		try {
			int a=Integer.parseInt(s);
			System.out.println("������ȷ�õ�����Ϊ��");
			System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
			gets();
		}
	}
}
