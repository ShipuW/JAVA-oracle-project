package com.smart.entity;

public class Student {
	private String province;// ʡ��

	private String university;// ѧУ
	private String department;// ѧԺ��ϵ
	private String major;// רҵ
	private String clas;// �༶
	private String name;// ѧ������
	private String id;// ѧ��
	private int del;//ɾ�����
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
