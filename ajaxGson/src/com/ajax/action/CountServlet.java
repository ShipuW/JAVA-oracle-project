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
 * ��������ǰ̨���õ�servlet�������������
 * 
 * @author ��˧
 *
 */
public class CountServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//�õ�ǰ̨�Ĳ���
		int count1 = Integer.parseInt(req.getParameter("count1"));
		int count2 = Integer.parseInt(req.getParameter("count2"));
		//����biz������������ֵ����
		//����CountBiz����
		CountBiz biz = new CountBiz();
		//����һ��ʵ������󣬸�ֵ
		Count count = new Count();
		count.setNum1(count1);
		count.setNum2(count2);
		//����һ���������ڽ���biz������ӵķ���
		int i = biz.addBiz(count);
		//ת��ΪGson
		Gson gson = new Gson();
		String str = gson.toJson(i);
		System.out.println(str);
		//���ظ����ǵ�ǰ̨
		PrintWriter out = resp.getWriter();
		//�����ǰ̨
		out.println(str);
		//���
		out.flush();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
