package com.cqupt.entity;

public class TestStudent {

	public static void main(String[] args) {
		//��������
		Student zhangsan = new Student();
		System.out.println(zhangsan.age);
		//�������͵ı��� ���� ѧ������
		Student lisi;
		//��list ��zhangsan ָ��ͬһ���ڴ�ռ�
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
