<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		public void test(){
		
	}
	%>
	你好,今天是
	<%
		Date today = new Date();
	%>
	<%=today.getDate()%>号， 星期<%=today.getDay()%>
	<!-- dfdsfsda -->
	<%--
		date
	--%>
</body>
</html>