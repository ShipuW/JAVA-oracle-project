package com.smart.action;

import java.io.PrintWriter;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.DefaultActionSupport;

import com.smart.dao.StudentDao;

public class IsIdExt extends DefaultActionSupport{
	private String clas;
	private String name;
	private String id;

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		//0--²»´æÔÚ£¬1--´æÔÚ
		int ext = new StudentDao().isIdExist(clas,name,id);
		PrintWriter writer = ServletActionContext.getResponse().getWriter();
		writer.write(new Integer(ext).toString());
		writer.flush();
		writer.close();
		return null;
	}
	
}
