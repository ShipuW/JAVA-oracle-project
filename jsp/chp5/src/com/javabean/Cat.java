package com.javabean;

import java.io.Serializable;

public class Cat implements Serializable {
	/**
	 * 重写无参的构造方法
	 */
	public Cat() {
		
	}
	// 私有的属性
	private String name;
	private int age;
	/**
	 * 设置猫的名字是可读
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置猫的名字是可写
	 * 
	 * @return
	 */
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
