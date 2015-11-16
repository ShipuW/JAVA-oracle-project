package com.oracle.action;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.bean.User;

public class UserAction extends ActionSupport{
	private User username;

	public User getUsername() {
		return username;
	}

	public void setUsername(User username) {
		this.username = username;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(username.getUsername()+":"+username.getPassword());
		return SUCCESS;
	}
	

}
