<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
	%>
	<%
		Enumeration e = request.getParameterNames();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	
		String []values=request.getParameterValues("cbx_01");
		for(String value:values){
			System.out.println(value);
		}
	%>
	<%
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	%>
	用户 名：<%=username%><br> 密码：<%=password%><br>
</body>
</html>