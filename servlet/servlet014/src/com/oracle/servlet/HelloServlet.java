package com.oracle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	// �����Ա���������û� ��
	//private String username;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ����ǰ�δ��ݹ�����ֵ
		//this.username = request.getParameter("username");
		String username = request.getParameter("username");
		//�õ���ǰ�̵߳�����
		System.out.println(Thread.currentThread());
		// ���к�̨ҵ����
		try {
			Thread.sleep(10000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		//request.setAttribute("username", this.username);
		request.setAttribute("username", username);
		// ��ת
		request.getRequestDispatcher("hello.jsp").forward(request, response);
	}
}
