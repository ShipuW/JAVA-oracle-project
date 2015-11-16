package com.oracle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {
	private int count1;
	private int count2;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 创建cookie
		Cookie cookie = new Cookie("cookieName" + count1++, "cookieValue"
				+ count2++);
		//设置cookie最大数
		cookie.setMaxAge(1);
		// 添加到response响应对象中去
		resp.addCookie(cookie);
		// 从request请求对象中得到cookie对象
		Cookie[] cookies = req.getCookies();
		if (null == cookies) {
			return;
		}
		for (Cookie c : cookies) {
			System.out.println("cookie name: " + c.getName());
			System.out.println("cookie value: " + c.getValue());
		}
	}
}
