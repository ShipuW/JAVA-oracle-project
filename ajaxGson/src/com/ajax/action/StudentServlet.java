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
		//取得前台学生的编号
		String stuId = req.getParameter("stuId");
		//创建biz层的对象完成添加学生对象
		StudentBiz biz = new StudentBiz();
		Student stu = new Student();
		//给学生对象添加值
		stu = biz.quryById(stuId);
		//把学生对象转换为Gson
		Gson gson = new Gson();
		String str = gson.toJson(stu);
		System.out.println(str);
		//提交到前台页面
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
