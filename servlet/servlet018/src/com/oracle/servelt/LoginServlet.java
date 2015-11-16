package com.oracle.servelt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.bean.User;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String author = request.getParameter("author");
		System.out.println(username);
		User user = new User();
		// 得到session
		HttpSession session = request.getSession();
		// 用户权限1。普通用户
		// 2。管理人员
		if ("1".equals(author)) {
			// 登陆的是普通用户
			if ("oracle".equals(username) && "123".equals(password)) {
				// 将用户 信息保存到session中
				user.setUsername(username);
				user.setPassword(password);
				user.setAuthor(author);
				// 将user对象保存到session中
				// 设置
				session.setAttribute("user", user);
				// 请求转发到登陆页面
				RequestDispatcher rdr = request
						.getRequestDispatcher("filter/index.jsp");
				rdr.forward(request, response);
			} else {
				// 用户登陆错误
				request.setAttribute("username", username);
				request.setAttribute("password", password);
				request.setAttribute("author", author);
				// 请求转发到登陆页面
				RequestDispatcher rdr = request
						.getRequestDispatcher("filter/login.jsp");
				rdr.forward(request, response);
			}
		} else if ("2".equals(author)) {
			// 登陆的是系统管理员
			if ("oracle".equals(username) && "oracle".equals(password)) {
				// 将用户 信息保存到session中
				user.setUsername(username);
				user.setPassword(password);
				user.setAuthor(author);
				// 将user对象保存到session中
				// 设置
				session.setAttribute("user", user);
				// 请求转发到登陆页面
				RequestDispatcher rdr = request
						.getRequestDispatcher("filter/index.jsp");
				rdr.forward(request, response);
			} else {
				// 用户登陆错误
				request.setAttribute("username", username);
				request.setAttribute("password", password);
				request.setAttribute("author", author);
				// 请求转发到登陆页面
				RequestDispatcher rdr = request
						.getRequestDispatcher("filter/login.jsp");
				rdr.forward(request, response);
			}
		} else {
			// 用户登陆错误
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			request.setAttribute("author", author);
			// 请求转发到登陆页面
			RequestDispatcher rdr = request
					.getRequestDispatcher("filter/login.jsp");
			rdr.forward(request, response);
		}
	}
}
