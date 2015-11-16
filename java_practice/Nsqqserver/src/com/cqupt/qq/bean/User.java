package com.cqupt.qq.bean;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID =1L;
	private int uqq;
	private String uname;
	private String tel;
	private String pass;
	public User() {
		super();
	}
	public User(int uid,String uname, String tel, String pass) {
		super();
		this.uqq = uid;
		this.uname = uname;
		this.tel = tel;
		this.pass = pass;
	}
	public int getUid() {
		return uqq;
	}
	public void setUid(int uid) {
		this.uqq = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.uname+"("+this.uqq+")";
	}
	
}
	

/*
public class User implements Serializable {
	private static final long serialVersionUID =1L;
	private int uqq;
	private String uname;
	private String pass;
	private String tel;
	
	public User() {
		super();
	}
	public User(int uqq, String uname, String pass, String tel) {
		super();
		this.uqq = uqq;
		this.uname = uname;
		this.pass = pass;
		this.tel = tel;
	}
	public int getUqq() {
		return uqq;
	}
	public void setUqq(int uqq) {
		this.uqq = uqq;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
*/