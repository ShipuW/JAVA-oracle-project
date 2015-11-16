package com.oracle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �����һ��servlet����extendsHttpServlet
 * 
 * @author Mountainpeople
 * 
 */
public class ServiceServlet extends HttpServlet {
	/**
	 * ��д�����service����������ǰ̨ȡ���û���������
	 */
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username:" + username + "password:" + password);
		System.out.println("service");
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("doGet()");
		System.out.println("username:" + username + "password:" + password);
	}
}
