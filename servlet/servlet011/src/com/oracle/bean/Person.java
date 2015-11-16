package com.oracle.bean;

public class Person {
	public Person() {

	}

	private String name = "oracle";
	private int age;
	private String address = "ÖĞ¹úÖØÇì";

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
