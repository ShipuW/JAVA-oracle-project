package com.javabean;

import java.io.Serializable;

public class Cat implements Serializable {
	/**
	 * ��д�޲εĹ��췽��
	 */
	public Cat() {
		
	}
	// ˽�е�����
	private String name;
	private int age;
	/**
	 * ����è�������ǿɶ�
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * ����è�������ǿ�д
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
