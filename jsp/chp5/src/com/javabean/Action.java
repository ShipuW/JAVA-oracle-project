package com.javabean;

import java.io.Serializable;

public class Action implements Serializable{
	private String action;//����������
	private String resource;//��������Դ
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
