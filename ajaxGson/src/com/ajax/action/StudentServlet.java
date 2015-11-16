package com.ajax.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajax.biz.StudentBiz;
import com.ajax.entity.Student;
import com.google.gson.Gson;

public class StudentServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//ȡ��ǰ̨ѧ���ı��
		String stuId = req.getParameter("stuId");
		//����biz��Ķ���������ѧ������
		StudentBiz biz = new StudentBiz();
		Student stu = new Student();
		//��ѧ���������ֵ
		stu = biz.quryById(stuId);
		//��ѧ������ת��ΪGson
		Gson gson = new Gson();
		String str = gson.toJson(stu);
		System.out.println(str);
		//�ύ��ǰ̨ҳ��
		PrintWriter out = resp.getWriter();
		out.println(str);
		out.flush();
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
