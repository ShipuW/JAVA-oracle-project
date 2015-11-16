package com.ajax.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajax.biz.CountBiz;
import com.ajax.entity.Count;
import com.google.gson.Gson;

/**
 * 用于我们前台调用的servlet，两个数字相加
 * 
 * @author 朱帅
 *
 */
public class CountServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//得到前台的参数
		int count1 = Integer.parseInt(req.getParameter("count1"));
		int count2 = Integer.parseInt(req.getParameter("count2"));
		//调用biz层进行两个数字的相加
		//创建CountBiz对象
		CountBiz biz = new CountBiz();
		//创建一个实体类对象，赋值
		Count count = new Count();
		count.setNum1(count1);
		count.setNum2(count2);
		//定义一个变量用于接收biz层中相加的方法
		int i = biz.addBiz(count);
		//转换为Gson
		Gson gson = new Gson();
		String str = gson.toJson(i);
		System.out.println(str);
		//返回给我们的前台
		PrintWriter out = resp.getWriter();
		//输出到前台
		out.println(str);
		//清空
		out.flush();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
