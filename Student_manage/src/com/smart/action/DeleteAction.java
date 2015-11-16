package com.smart.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.DefaultActionSupport;

import com.smart.dao.StudentDao;
import com.smart.entity.Student;

public class DeleteAction extends DefaultActionSupport{
	private String name;
	private String id;
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
		HttpSession session = ServletActionContext.getRequest().getSession();
		StudentDao dao = new StudentDao();
		Student stu = new Student();
		stu.setName(name);
		stu.setId(id);
		if (dao.deleStuInfo(stu)==1) {
			// É¾³ý³É¹¦
			session.setAttribute("deleMsg","É¾³ý³É¹¦£¡");
			System.out.println("É¾³ý³É¹¦£¡");
			return SUCCESS;
		} else {
			// É¾³ýÊ§°Ü
			session.setAttribute("deleMsg","É¾³ýÊ§°Ü,ÇëÖØÐÂÊäÈë£¡");
			System.out.println("É¾³ýÊ§°Ü£¡");
			return INPUT;
		}
		
	}
	
}
