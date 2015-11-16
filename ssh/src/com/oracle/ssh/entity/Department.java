package com.oracle.ssh.entity;

/**
 * 员工部门实体类，javaBean
 * 
 * @author Mountain 
 * 创建时间：2014年11月8日 9：00
 * 修改时间：
 * 修改的内容：
 * 
 */
public class Department {
	// 部门ID
	private int id;
	// 部门名称
	private String deptName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
