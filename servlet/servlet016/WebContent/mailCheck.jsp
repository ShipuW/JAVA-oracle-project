<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 1显示邮件信息  2保存session-->
	<%
		String username = request.getParameter("username");
		session.setAttribute("username", username);
	%>
	<a href="mailLogin.jsp">转回到登陆</a>
	<a href="mialLogout.jsp">注销</a>
	
	<p>
		用户<%=username %>您 好
		你有1000封邮件
	</p>
</body>
</html>