package cqupt.java.four3;
//���������dos�������� 
public abstract class ComputeTime {
	public static void main(String[] args) {
		System.out.println("��ͨ���ߣ�"+args[0]);
		System.out.println("����A"+args[1]);
		System.out.println("����B"+args[2]);
		System.out.println("����C"+args[3]);
		
		double A = Double.valueOf(args[1]);
		double B = Double.valueOf(args[2]);
		double C = Double.valueOf(args[3]);
		try {
			//��ȡ�����
			Class c = Class.forName("cqupt.java.four3"+args[0]);
			//�����ʵ����
			Vehicle ve = (Vehicle)c.newInstance();
			System.out.println("�ٶȣ�"+ve.getV(A, B, C)+"km/h");
			System.out.println("ʱ�䣺"+1000/ve.getV(A, B, C)+"h");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
