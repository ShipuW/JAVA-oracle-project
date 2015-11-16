package com.oracle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ʵ���û� �ĵ�½
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
		 * response.setContentType("text/html"); // ��������ı���
		 * response.setCharacterEncoding("UTF-8");
		 * 
		 * // �õ��û� �������� String username = request.getParameter("username");
		 * String password = request.getParameter("password"); // �õ����������
		 * PrintWriter out = response.getWriter(); out.println("<html>");
		 * out.println("<head><title>�û� ��������</title></head>");
		 * out.println("<body>"); out.println("�û� ����" + username);
		 * out.println("���룺" + password); out.println("</body>");
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
		// ��������ı���
		response.setCharacterEncoding("UTF-8");
		// �õ��û� ��������
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// �õ����������
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>�û� ��������</title></head>");
		out.println("<body>");
		out.println("�û� ����" + username);
		out.println("���룺" + password);
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}
}
