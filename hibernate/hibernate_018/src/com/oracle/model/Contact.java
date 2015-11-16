package com.oracle.model;

/**
 * 联系方式
 * 
 * @author Administrator
 * 
 */
public class Contact {
	private String method;
	private String address;
	private String student_id;

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
