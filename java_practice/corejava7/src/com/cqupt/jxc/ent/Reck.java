package com.cqupt.jxc.ent;

public class Reck extends Shape{
	public Reck(){
	}
	public Reck(double a,double b) {
		this.S = a*b;
		this.C = a+b+a+b;
	}
	public double getC() {
		return C;
	}
	public double getS() {
		return S;
	}
}
