package com.cqupt.list;

public class Student{
	private int age;
	private String name;
	private String id;
	private String sex;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int age,String name){
		super();
		this.age=age;
		this.name=name;
	}
	public Student(){
		super();
	}
	public String toString(){
		return "姓名:"+this.name+"  学号:"+this.id+"  年龄:"+this.age+"  性别:"+this.sex;
	}
}
