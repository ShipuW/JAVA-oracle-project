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
			// ��ӳɹ�
			session.setAttribute("regMsg","��ӳɹ�,���ٴ���ӣ�");
			System.out.println("��ӳɹ���");
			return SUCCESS;
		} else {
			// ���ʧ��
			session.setAttribute("regMsg","���ʧ��,��������ӣ�");
			System.out.println("���ʧ�ܣ�");
			return INPUT;
		}

	}
	
}
