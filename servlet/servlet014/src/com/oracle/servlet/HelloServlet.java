package com.oracle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	// 定义成员变量接收用户 名
	//private String username;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 接收前参传递过来的值
		//this.username = request.getParameter("username");
		String username = request.getParameter("username");
		//得到当前线程的名字
		System.out.println(Thread.currentThread());
		// 进行后台业务处理
		try {
			Thread.sleep(10000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		//request.setAttribute("username", this.username);
		request.setAttribute("username", username);
		// 跳转
		request.getRequestDispatcher("hello.jsp").forward(request, response);
	}
}
