package com.oracle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 用户注册
 */
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		register(request, response);
	}

	private void register(HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException,
			IOException {
		request.setCharacterEncoding("UTF-8");
		// 得到用户 名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String newpassword = request.getParameter("newpassword");
		String result = "";
		if (password.equals(newpassword) && username != null) {
			result += "success";
		}
		if (!password.equals(newpassword)) {
			result += "password != repassword";
		}
		response.setContentType("text/html");
		// 设置请求的编码
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>registration result</title></head>");
		out.println("<body><h1>" + result + "</h1></body></html>");
		out.flush();
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		register(request, response);
	}

}
