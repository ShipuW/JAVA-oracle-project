package com.corejava.light;

public class Testmain {
	public static void main(String[] args) {
		//控制中心
		Lamp lamp=new Lamp();
		RedBuble redBuble=new RedBuble("3haomen");
		GreenBuble green=new GreenBuble();
		//让控制中心可以访问到红灯对象
		lamp.setRedBuble(redBuble);
		lamp.on();
	}

}
