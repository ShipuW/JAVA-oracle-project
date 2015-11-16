package com.javabean;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;// 学生的名字
	private int age;// 学生的年龄

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
