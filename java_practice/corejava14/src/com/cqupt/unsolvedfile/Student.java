package com.cqupt.unsolvedfile;

import java.io.Serializable;

public class Student implements Serializable{
	int sid;
	String name;
	transient  int age;
	char sex;
	
	
	public Student() {
		super();
	}
	public Student(int sid, String name, int age, char sex) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + "]";
	}
	
}
