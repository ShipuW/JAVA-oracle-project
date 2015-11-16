package com.smart.action;


import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.smart.dao.StudentDao;
import com.smart.entity.Student;

public class InsertAction extends ActionSupport {
	private Student stu;


	public Student getStu() {
		return stu;
	}


	public void setStu(Student stu) {
		this.stu = stu;
	}

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		StudentDao dao = new StudentDao();
		if (dao.insertStuInfo(stu)) {
			// 添加成功
			session.setAttribute("regMsg","添加成功,请再次添加！");
			System.out.println("添加成功！");
			return SUCCESS;
		} else {
			// 添加失败
			session.setAttribute("regMsg","添加失败,请重新添加！");
			System.out.println("添加失败！");
			return INPUT;
		}

	}
	
}
