/**
 * 测试方法重载
 * 方法重载
 * 		：方法名相同  参数不同（个数不同  类型不同  顺序不同）
 * @author Administrator
 *
 */
public class PrintTools {

	public void print(int a) {
		System.out.println("a=" + a);
	}

	public void print(int a,int b) {
		System.out.println("a=" + a);
	}
	public void print(long a) {
		System.out.println("a=" + a);

	}
	public void print(boolean a) {

		System.out.println("a=" + a);
	}

	public void print(char a) {

		System.out.println("a=" + a);
	}

	public void print(String a) {

		System.out.println("a=" + a);
	}

}
