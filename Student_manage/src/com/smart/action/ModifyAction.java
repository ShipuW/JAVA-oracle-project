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
			// �޸ĳɹ�
			session.setAttribute("modifyMsg","�޸ĳɹ���");
			System.out.println("�޸ĳɹ���");
			return SUCCESS;
		} else {
			// �޸�ʧ��
			session.setAttribute("modifyMsg","�޸�ʧ��,�������޸ģ�");
			System.out.println("�޸�ʧ�ܣ�");
			return INPUT;
		}
	}
	
}
