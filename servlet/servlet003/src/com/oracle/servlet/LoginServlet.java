package com.oracle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现用户 的登陆
 * 
 * @author Mountainpeople
 * 
 */
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		/*
		 * request.setCharacterEncoding("UTF-8");
		 * response.setContentType("text/html"); // 设置请求的编码
		 * response.setCharacterEncoding("UTF-8");
		 * 
		 * // 得到用户 名和密码 String username = request.getParameter("username");
		 * String password = request.getParameter("password"); // 得到输出流对象
		 * PrintWriter out = response.getWriter(); out.println("<html>");
		 * out.println("<head><title>用户 名和密码</title></head>");
		 * out.println("<body>"); out.println("用户 名：" + username);
		 * out.println("密码：" + password); out.println("</body>");
		 * out.println("</html>");
		 * out.flush();
		 */
		login(request, response);
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		login(request, response);
	}

	private void login(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		// 设置请求的编码
		response.setCharacterEncoding("UTF-8");
		// 得到用户 名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// 得到输出流对象
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>用户 名和密码</title></head>");
		out.println("<body>");
		out.println("用户 名：" + username);
		out.println("密码：" + password);
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}
}
