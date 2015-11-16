package com.oracle.mountain;

public class Cat {
	public Cat(){
		
	}
	private String name;
	private int age;
	private String clor;
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
	public String getClor() {
		return clor;
	}
	public void setClor(String clor) {
		this.clor = clor;
	}
	public String toString(){
		return this.getName()+this.getAge()+this.getClor();
	}
}
