package com.oracle.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.bean.User;

public class UserAction extends ActionSupport{
	private List<User> user;
	
	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}



	@Override
	public String execute() throws Exception {
		for (User u : user) {
			System.out.println(u.getPassword());
			System.out.println(u.getUsername());
		}
		return SUCCESS;
		
	}
	
}
