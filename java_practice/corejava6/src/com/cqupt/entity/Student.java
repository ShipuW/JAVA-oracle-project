package com.cqupt.entity;

public class Student {
	int age=20;

	public Student(int age) {
		this();
		//this 代表对象自身  创建谁 代表谁
		this.age = age;
	}
	public Student() {
		System.out.println("无参构造方法");
	}

	//实例方法  
	public void print(int age)
	{	//输出的是实例变量或成员变量  this.age代表堆上面的age
		System.out.println(this.age);
	}
	

}
