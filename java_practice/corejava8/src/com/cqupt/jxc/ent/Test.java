package com.cqupt.jxc.ent;

public class Test {
	public static void main(String[] args) {
	Animal []a=new Animal [2];
	a[0]=new Cat();
	a[1]=new Dog();
	for (int i = 0; i < a.length; i++) {
		a[i].print();
		System.out.println("---------------------");
	}
	}
}

