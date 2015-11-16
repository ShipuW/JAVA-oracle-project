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
public class AjaxTextServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		process(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost");
		process(request, response);
	}
	private void process(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// ***********ȡ�ÿͻ��˷�������ֵ
		String v1 = request.getParameter("v1");
		String v2 = request.getParameter("v2");
		String v3 = String.valueOf(Integer.valueOf(v1) + Integer.valueOf(v2));

		// �������������
		PrintWriter out = response.getWriter();
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		//System.out.println("�������˱�����");
		/*
		 * // ��������������� response.setHeader("pragma", "no-cache");
		 * response.setHeader("cache-control", "no-cache");
		 */
		// ��ͻ��������Ϣ
		// out.println("Hello World");
		out.println(v3);
		out.flush();
	}
	
}
