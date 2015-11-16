package com.ajax.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajax.biz.StudentBiz;
import com.ajax.entity.Student;
import com.google.gson.Gson;

public class StudentAllServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		//得到所有的学生信息
		List<Student> list = new StudentBiz().quryAll();
		//Gson转换
		Gson gson = new Gson();
		String str = gson.toJson(list);
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
