package com.oracle.servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.bean.User;

public class QueryServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// �õ�session�ж��Ƿ����
		HttpSession session = req.getSession();
		if (null == session.getAttribute("user")) {
			resp.sendRedirect("session/login.jsp");
			return;
		}
	}
}
