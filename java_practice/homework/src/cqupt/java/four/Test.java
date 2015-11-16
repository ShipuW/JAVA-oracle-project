package cqupt.java.four;

public class Test {

	/**
	 * 测试程序
	 * @param args
	 */
	public static void main(String[] args) {
		//测试Rectangle
		Rectangle re = new Rectangle(20,10);
		double s = re.GetArea();
		double c = re.GetPerim();
		System.out.println("矩形面积："+s);
		System.out.println("矩形周长："+c);
		//测试Square
		Square sq = new Square(30);
		System.out.println("正方形面积："+sq.GetArea());
		System.out.println("正方形周长："+sq.GetPerim());
		//测试Circle
		Circle cir = new Circle(20);
		System.out.println("长方形面积："+cir.GetArea());
		System.out.println("长方形周长："+cir.GetPerim());
	}

}
