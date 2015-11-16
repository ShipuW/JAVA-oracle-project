package com.oracle.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("²âÊÔ");
		return SUCCESS;
	}
	@Override
	public void validate() {
		if(null == username || !username.equals("oracle")){
			System.out.println("ÓÃ»§Ãû´íÎó");
			this.addActionError("ÓÃ»§Ãû´íÎó");
			this.addFieldError("username", "username null");
		}
		if(null == password || !password.equals("oracle")){
			System.out.println("ÃÜÂë´íÎó");
			this.addActionError("ÃÜÂë´íÎó");
		}
		this.getFieldErrors().clear();
		this.getActionErrors().clear();
		this.clearActionErrors();
		this.clearFieldErrors();
	}
	
	
}
