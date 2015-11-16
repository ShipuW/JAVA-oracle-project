package com.oracle.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String repassword = req.getParameter("repassword");

		List<String> list = new ArrayList<String>();

		if (null == username || "".equals(username)) {
			list.add("�û� ������Ϊ��!");
		}
		if (password == null || password.length() < 6 || password.length() > 10) {
			list.add("����Ϊ�ջ��߳��Ȳ���6��10λ֮���");
		}
		if (repassword == null || repassword.length() < 6
				|| repassword.length() > 10) {
			list.add("�ظ�����Ϊ�ջ��߳��Ȳ���6��10λ֮��");
		}
		if (password != null && repassword != null
				&& !password.equals(repassword)) {
			list.add("������������벻һ��");
		}

		if (list.isEmpty()) {
			req.setAttribute("username", username);
			req.setAttribute("password", password);

			req.getRequestDispatcher("success.jsp").forward(req, resp);
		} else {
			req.setAttribute("error", list);

			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}