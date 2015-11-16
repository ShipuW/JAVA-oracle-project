/**
 * 
 * @author Administrator
 * 
 */
public class Student {
	// 属性 也叫 成员变量 实例变量    创建对象的时候 自动初始化 int 初始化为0
	int sum;
	int age;
	String name;
	String tel;
	char sex = 'm';
	//构造方法  1.和类名相同 2.没有返回值   如果没有显示提供构造方法  系统自动提供一个无参的构造方法
	//如果显示指定了构造方法   系统不在提供无参构造方法
	public Student(){
		System.out.println("构造方法");
	}
	//构造方法重载    
	public Student(int xh)
	{
		sum= xh;
	}
	//构造方法重载
	public  Student(int xh,String xm,String dh)
	{
		
		sum=xh;
		name=xm;
		tel=dh;
	}

	// 成员方法 实例方法
	public void sayHello() {
		System.out.println("hello");
	}

	// 成员方法 实例方法  必须通过对象调用的
	public int add(int a, int b) {
		return a + b;
	}

	// 成员方法
	public void showAge() {
		int age = 990;
		System.out.print(age);
	}

	// 成员方法
	public void showAge2() {
		System.out.print(age);
	}

}
