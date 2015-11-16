package cqupt.java.four;

public class Rectangle extends Shape{
	private double x;
	private double y;
	
	public Rectangle(double x,double y){
		//调用父类构造方法
		super(x,y);
		this.x = x;
		this.y = y;
	}
	@Override 
	//计算矩形面积
	public double GetArea() {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	//计算矩形周长
	public double GetPerim() {
		// TODO Auto-generated method stub
		return (x+y)*2;
	}
	
	
}
