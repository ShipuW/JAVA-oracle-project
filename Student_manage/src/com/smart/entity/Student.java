package com.smart.entity;

public class Student {
	private String province;// 省份

	private String university;// 学校
	private String department;// 学院或系
	private String major;// 专业
	private String clas;// 班级
	private String name;// 学生姓名
	private String id;// 学号
	private int del;//删除标记
	public String getProvince() {
		return province;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
