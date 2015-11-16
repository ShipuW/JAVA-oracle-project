package com.cqupt.entity;

public class TestStudent {

	public static void main(String[] args) {
		//创建对象
		Student zhangsan = new Student();
		System.out.println(zhangsan.age);
		//引用类型的变量 属于 学生类型
		Student lisi;
		//让list 和zhangsan 指向同一块内存空间
		lisi= zhangsan;
		
		lisi.age = 250;
		System.out.println(zhangsan.age);
		System.out.println("********************");
		m2(lisi);
		System.out.println(lisi.age);//?
		System.out.println(zhangsan.age);//?
		System.out.println("----------2--------------");
		
		Student wangwu = new Student(110);
		wangwu.print(123);
		
		
	}
	public static void m2(Student stu)
	{
		stu.age++;
	}

}
