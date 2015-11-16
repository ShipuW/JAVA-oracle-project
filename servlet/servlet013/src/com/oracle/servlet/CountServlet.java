package com.oracle.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 得到ServletContext对象
		ServletContext context = req.getSession().getServletContext();
		if (null == context.getAttribute("count")) {
			context.setAttribute("count", 1);
		} else {
			int count = (int) context.getAttribute("count");
			context.setAttribute("count", count + 1);
		}
		req.getRequestDispatcher("count.jsp").forward(req, resp);
	}
}
