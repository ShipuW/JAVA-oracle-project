package com.oracle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �������˷���helloword���ͻ���
 * 
 * @author Mountainpeople
 * 
 */
public class AjaxServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// �������������
		PrintWriter out = response.getWriter();
		/*
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		System.out.println("�������˱�����");
		/*
		// ���������������
		response.setHeader("pragma", "no-cache");
		response.setHeader("cache-control", "no-cache");
		*/
		// ��ͻ��������Ϣ
		out.println("Hello World");
		out.flush();
	}
}
