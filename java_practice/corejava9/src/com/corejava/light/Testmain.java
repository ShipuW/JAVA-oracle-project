package com.corejava.light;

public class Testmain {
	public static void main(String[] args) {
		//��������
		Lamp lamp=new Lamp();
		RedBuble redBuble=new RedBuble("3haomen");
		GreenBuble green=new GreenBuble();
		//�ÿ������Ŀ��Է��ʵ���ƶ���
		lamp.setRedBuble(redBuble);
		lamp.on();
	}

}
