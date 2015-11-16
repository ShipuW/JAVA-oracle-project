package com.cqupt.jxc.ent;

public class Square extends Reck{
	public Square(){
	}
	public Square(double a){
		this.S=a*a;
		this.C=4*a;
	}
	public double getS() {
		return S;
	}
	public double getC() {
		return C;
	}
}
