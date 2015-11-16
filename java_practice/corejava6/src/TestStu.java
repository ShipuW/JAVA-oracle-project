/**
 * 
 * @author Administrator
 *
 */
public class TestStu {

	public static void main(String[] args) {
	/*	Student zhangsan;
		
		//基于模板 创建一个对象 名为zhangsan 
		zhangsan= new Student();
		
		//通过对象调用成员变量 为自身存储数据
		zhangsan.name = "zeng";
		zhangsan.tel = "15086";
		//zhangsan.age = 100;
		
		//通过对象调用方法  完成功能
		zhangsan.sayHello();
		
		//通过对象调用方法  完成功能
		int sum = zhangsan.add(1, 1);
		System.out.println("sum="+sum);
		System.out.println(zhangsan.age);
		System.out.println(zhangsan.sex);*/
		
		//测试构造方法   创建对象调用构造方法  
		Student tom = new Student();
		System.out.println("tom="+tom.sum);
		
		Student jack = new Student(250);
		
		Student leo = new Student(100, "leo", "15086987");
		
		System.out.println(jack.sum);
		System.out.println(leo.tel);
		
		
		
	}

}
