package com.cqupt.entity;

public class Student {
	int age=20;

	public Student(int age) {
		this();
		//this �����������  ����˭ ����˭
		this.age = age;
	}
	public Student() {
		System.out.println("�޲ι��췽��");
	}

	//ʵ������  
	public void print(int age)
	{	//�������ʵ���������Ա����  this.age����������age
		System.out.println(this.age);
	}
	

}
