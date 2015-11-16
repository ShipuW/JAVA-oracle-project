package cqupt.java.four;

public class Circle extends Shape {
	private double r;

	public Circle(double r) {
		super(r);
		this.r = r;
	}
	@Override
	public double GetArea() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}

	@Override
	public double GetPerim() {
		// TODO Auto-generated method stub
		return 2*3.14*r;
	}
	
	
	

}
