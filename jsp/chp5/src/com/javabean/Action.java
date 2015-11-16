package com.javabean;

import java.io.Serializable;

public class Action implements Serializable{
	private String action;//操作的名称
	private String resource;//操作的资源
	public Action() {
		super();
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	
}
