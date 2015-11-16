<%@page import="com.oracle.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
<%
	User user=(User)session.getAttribute("user");
	if(null==user){
		response.sendRedirect("login.jsp");
		return;
	}
%>
	<a href="/servlet017/queryServlet">查询</a>
	<%
		if (((User) session.getAttribute("user")).getAuthor().equals("2")) {
	%>
	<a href="/servlet017/updateServlet">更新</a>
	<%
		}
	%>

</body>
</html>