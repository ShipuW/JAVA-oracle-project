package cqupt.java.four3;
//此类必须在dos命令下用 
public abstract class ComputeTime {
	public static void main(String[] args) {
		System.out.println("交通工具："+args[0]);
		System.out.println("参数A"+args[1]);
		System.out.println("参数B"+args[2]);
		System.out.println("参数C"+args[3]);
		
		double A = Double.valueOf(args[1]);
		double B = Double.valueOf(args[2]);
		double C = Double.valueOf(args[3]);
		try {
			//获取类对象
			Class c = Class.forName("cqupt.java.four3"+args[0]);
			//类对象实例化
			Vehicle ve = (Vehicle)c.newInstance();
			System.out.println("速度："+ve.getV(A, B, C)+"km/h");
			System.out.println("时间："+1000/ve.getV(A, B, C)+"h");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
