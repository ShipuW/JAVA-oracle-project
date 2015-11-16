package com.cqupt.jxc.ent;

public class Circle extends Shape{
	public Circle(){
		System.out.println("------Circle¿‡-----");
	}
	public double getS() {
		return S;
	}
	public Circle(double r) {
		this.S = 3.14*r*r;
		this.C = 2*3.14*r;
	}
	public double getC() {
		return C;
	}
}
