package cqupt.java.four;

public abstract class Shape {
	//有参构造方法
	public Shape(double r){
		
	}
	public Shape(double x,double y){
	
	}
	//抽象方法，计算对象面积
	public abstract double GetArea();
	//抽象方法，计算对象周长
	public abstract double GetPerim();
}
