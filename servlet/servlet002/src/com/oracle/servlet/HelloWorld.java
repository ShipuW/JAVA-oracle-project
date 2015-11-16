package com.oracle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 我的第一个servlet项目
 * 
 * @author Mountainpeople
 * 
 */
public class HelloWorld extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 设置响应的类型
		response.setContentType("text/html");
		// 设置响应的编码
		response.setCharacterEncoding("UTF-8");
		// 创建输出流对象
		PrintWriter out = response.getWriter();
		// 输出前台显示的代码
		out.println("<html>");
		out.println("<head><title>我的第一个servlet项目</title></head>");
		out.println("<body>");
		out.println("<h1>HelloWorld</h1>");
		out.println(new Date().toLocaleString());
		out.println("</body>");
		out.println("</html>");
		//清空缓存
		out.flush();
	}
}
