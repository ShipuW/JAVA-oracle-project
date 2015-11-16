package com.smart.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.DefaultActionSupport;

import com.smart.dao.StudentDao;
import com.smart.entity.Student;

public class ModifyAction extends DefaultActionSupport {
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
		if (dao.modStuInfo(stu)==1) {
			// 修改成功
			session.setAttribute("modifyMsg","修改成功！");
			System.out.println("修改成功！");
			return SUCCESS;
		} else {
			// 修改失败
			session.setAttribute("modifyMsg","修改失败,请重新修改！");
			System.out.println("修改失败！");
			return INPUT;
		}
	}
	
}
