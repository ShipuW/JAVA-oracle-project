package com.cqupt.jxc.ent;

public class Test {
	public static void main(String []args){
		Shape [] a=new Shape[3];
        a[0]=new Reck(1,2);
        a[1]=new Circle(2);
        a[2]=new Square(2);
        for (int i = 0; i < a.length; i++) {
        	System.out.println("周长="+a[i].getC());
        	System.out.println("面积="+a[i].getS());
		}
	}

}
