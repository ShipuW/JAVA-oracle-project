package com.oralce.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.register(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.register(req, resp);
	}

	protected void register(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		System.out.println(gender);
		String[] interest = req.getParameterValues("interest");
	
		String address = req.getParameter("address");

		//address = new String(address.getBytes("iso-8859-1"), "UTF-8");

		System.out.println(req);

		String comment = req.getParameter("comment");

		List<String> list = new ArrayList<String>();

		if (null == username || "".equals(username)) {
			list.add("用户名不能为空！");
		} else if (username.length() < 4) {
			list.add("用户名过短！");
		} else if (username.length() > 10) {
			list.add("用户名过长！");
		}

		if (null == password || "".equals(password)) {
			list.add("密码不能为空！");
		} else if (password.length() < 4) {
			list.add("密码过短！");
		} else if (password.length() > 10) {
			list.add("密码过长!");
		}
		if (null == gender) {
			list.add("性别没有选择!");
		}

		if (null == interest) {
			list.add("兴趣至少选择一个！");
		} else if (interest.length > 3) {
			list.add("兴趣最多选择三个！");
		}
		if (null == comment || "".equals(comment)) {
			list.add("说明没有填写！");
		}

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");

		if (list.isEmpty()) {
			req.setAttribute("username", username);
			req.setAttribute("password", password);
			req.setAttribute("gender", gender);
			req.setAttribute("interest", interest);
			req.setAttribute("address", address);
			req.setAttribute("comment", comment);

			req.getRequestDispatcher("success.jsp").forward(req, resp);
			//如果使用重定向req.getAttribute("username");还能取到值不
			//resp.sendRedirect("success.jsp");
		} else {
			req.setAttribute("error", list);

			req.getRequestDispatcher("failure.jsp").forward(req, resp);
		}
	}

}
