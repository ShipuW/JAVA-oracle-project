package com.cqupt.qq.bean;

import java.io.Serializable;

public class Request implements Serializable{
	private static final long serialVersionUID =1L;
	private User user;
	private User touser;
	private String requestServerName;//请求的类型
	public Request() {
		super();
	}
	public Request(User user, User touser, String requestServerName) {
		super();
		this.user = user;
		this.touser = touser;
		this.requestServerName = requestServerName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User getTouser() {
		return touser;
	}
	public void setTouser(User touser) {
		this.touser = touser;
	}
	public String getRequestServerName() {
		return requestServerName;
	}
	public void setRequestServerName(String requestServerName) {
		this.requestServerName = requestServerName;
	}
	

}

