package cqupt.java.four;

public class Rectangle extends Shape{
	private double x;
	private double y;
	
	public Rectangle(double x,double y){
		//���ø��๹�췽��
		super(x,y);
		this.x = x;
		this.y = y;
	}
	@Override 
	//����������
	public double GetArea() {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	//��������ܳ�
	public double GetPerim() {
		// TODO Auto-generated method stub
		return (x+y)*2;
	}
	
	
}
