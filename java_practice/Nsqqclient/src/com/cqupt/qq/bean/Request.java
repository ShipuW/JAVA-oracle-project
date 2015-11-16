package com.cqupt.qq.bean;

import java.io.Serializable;

/**
 * 请求对象
 * @author Administrator
 *
 */
public class Request  implements Serializable{
	private static final long serialVersionUID =1L;
	private User user;
	private User toUser;
	private String requestServerName; //请求类型
	public Request() {
		super();
	}
	public Request(User user, User toUser, String requestServerName) {
		super();
		this.user = user;
		this.toUser = toUser;
		this.requestServerName = requestServerName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User getToUser() {
		return toUser;
	}
	public void setToUser(User toUser) {
		this.toUser = toUser;
	}
	public String getRequestServerName() {
		return requestServerName;
	}
	public void setRequestServerName(String requestServerName) {
		this.requestServerName = requestServerName;
	}
		
}
