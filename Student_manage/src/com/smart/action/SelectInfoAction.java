package com.smart.action;

import java.util.List;

import javax.servlet.http.HttpSession;


import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.DefaultActionSupport;

import com.smart.dao.StudentDao;
import com.smart.entity.Student;

public class SelectInfoAction extends DefaultActionSupport{
	private String name;
	private List<Student> list;	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		Student stu = new Student();
		StudentDao studao = new StudentDao();
		stu.setName(name);
		list = studao.seleStuInfo(stu);
		if(list.isEmpty()){
			session.setAttribute("searchMsg", "没有这个学生。");
		}
		return SUCCESS;
	}
	
}
