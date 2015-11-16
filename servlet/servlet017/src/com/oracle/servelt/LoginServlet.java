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
		User user = new User();
		// �õ�session
		HttpSession session = request.getSession();
		// �û�Ȩ��1����ͨ�û�
		// 2��������Ա
		if ("1".equals(author)) {
			// ��½������ͨ�û�
			if ("oracle".equals(username) && "123".equals(password)) {
				// ���û� ��Ϣ���浽session��
				user.setUsername(username);
				user.setPassword(password);
				user.setAuthor(author);
				// ��user���󱣴浽session��
				// ����
				session.setAttribute("user", user);
				/*
				request.setAttribute("user", "user");
				response.sendRedirect("index.jps");
				ͨ��request����ֵʱ������д��һ��ҳ�档��ʱ������û�а취ȡ����ֵ
				�������ͨ�����ǵ�����ת������ʱ����ȡ��request�����е�ֵ 
				*/
				// ����ת������½ҳ��
				RequestDispatcher rdr = request
						.getRequestDispatcher("session/index.jsp");
				
				rdr.forward(request, response);
			} else {
				// �û���½����
				request.setAttribute("username", username);
				request.setAttribute("password", password);
				request.setAttribute("author", author);
				// ����ת������½ҳ��
				RequestDispatcher rdr = request
						.getRequestDispatcher("session/login.jsp");
				rdr.forward(request, response);
			}
		} else if ("2".equals(author)) {
			// ��½����ϵͳ����Ա
			if ("oracle".equals(username) && "oracle".equals(password)) {
				// ���û� ��Ϣ���浽session��
				user.setUsername(username);
				user.setPassword(password);
				user.setAuthor(author);
				// ��user���󱣴浽session��
				// ����
				session.setAttribute("user", user);
				// ����ת������½ҳ��
				RequestDispatcher rdr = request
						.getRequestDispatcher("session/index.jsp");
				rdr.forward(request, response);
			} else {
				// �û���½����
				request.setAttribute("username", username);
				request.setAttribute("password", password);
				request.setAttribute("author", author);
				// ����ת������½ҳ��
				RequestDispatcher rdr = request
						.getRequestDispatcher("session/login.jsp");
				rdr.forward(request, response);
			}
		} else {
			// �û���½����
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			request.setAttribute("author", author);
			// ����ת������½ҳ��
			RequestDispatcher rdr = request
					.getRequestDispatcher("session/login.jsp");
			rdr.forward(request, response);
		}
	}
}
