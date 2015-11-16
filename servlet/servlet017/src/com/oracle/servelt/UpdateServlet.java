package com.oracle.servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.bean.User;

public class UpdateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 得到session判断是否存在
		HttpSession session = req.getSession();
		if (null == session.getAttribute("user")) {
			resp.sendRedirect("session/login.jsp");
		}
		User user = (User) session.getAttribute("user");
		if ("1".equals(user.getAuthor())) {
			//普通用户
			System.out.println("失败");
		} else {
			//管理员
			System.out.println("成功");
		}
	}
}
