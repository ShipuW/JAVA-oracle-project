package com.cqupt.getclass;

import java.util.List;

class Student{
	int age;
	String name;
	Student(String name,int age){
		this.age=age;
		this.name=name;
	}
}
class Test{
	public static void main(String[] args) {
		Student s1=new Student("suns",20);
		Student s2=new Student("suns",20);
		System.out.println(s1.equals(s2));
	}
}


