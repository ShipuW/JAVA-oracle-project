package com.oracle.ssh.entity;

import java.util.Date;
/**
 * 员工实体类，javaBean
 * 
 * @author Mountain 
 * 创建时间：2014年11月8日 9：12
 * 修改时间：
 * 修改的内容：
 * 
 */
public class Employee {
	private int id;
	private String lastName;
	private String email;
	private Date birth;
	private Date createTime;
	private Department dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}

}
