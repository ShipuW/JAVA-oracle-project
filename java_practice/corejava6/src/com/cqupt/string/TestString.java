package com.cqupt.string;

public class TestString {

	public static void main(String[] args) {
	
		String s1 = new String("zeng");
		String s2 = new String("zeng");
		
		System.out.println(s1==s2);//�Ƚϵ��ǵ�ַ
		System.out.println(s1.equals(s2)); //�Ƚϵ�������
		System.out.println("---------------");
		String a1 = "Hello";
		String a2 = "Hello Hello cqupt Hello���ֹ�Hello���ֹ�";
		System.out.println(a1==a2);//true
		System.out.println(a1.equals(a2));//true
		
		System.out.println(a1.charAt(0));
		System.out.println(a1.length());
		System.out.println(a2.indexOf("cqupt"));
		String ss = a2.substring(a2.indexOf("cqupt"),a2.indexOf("cqupt")+"cqupt".length());
		System.out.println(ss);
		System.out.println(a2);
		System.out.println(a2.replaceAll("���ֹ�", "��������"));
		
		String ip ="192,168,10,123,hello,world";
		//String[] s = new String[6];
		String [] as = ip.split(","); //��ĳ����ʾ �ָ��ַ���  �ָ������
		for (int i = 0; i < as.length; i++) {
			System.out.println(as[i]);
		}
		
	}

}
