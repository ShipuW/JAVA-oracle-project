package cqupt.java.four;

public class Test {

	/**
	 * ���Գ���
	 * @param args
	 */
	public static void main(String[] args) {
		//����Rectangle
		Rectangle re = new Rectangle(20,10);
		double s = re.GetArea();
		double c = re.GetPerim();
		System.out.println("���������"+s);
		System.out.println("�����ܳ���"+c);
		//����Square
		Square sq = new Square(30);
		System.out.println("�����������"+sq.GetArea());
		System.out.println("�������ܳ���"+sq.GetPerim());
		//����Circle
		Circle cir = new Circle(20);
		System.out.println("�����������"+cir.GetArea());
		System.out.println("�������ܳ���"+cir.GetPerim());
	}

}
