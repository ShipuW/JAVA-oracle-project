package com.cqupt.qq.bean;

import java.io.Serializable;

/**
 * 用户信息
 * @author Administrator
 *
 */
public class User implements Serializable {
	private static final long serialVersionUID =1L;
	private int uqq;
	private String uname;
	private String pass;
	private String tel;
	
	public User() {
		super();
	}
	public User( String uname, String pass, String tel) {
		super();

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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.uname+"("+this.uqq+")";
	}
	
	
	
}
