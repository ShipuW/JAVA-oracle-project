<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
</head>
<body>
	<%=basePath%>
	<%
		String author = (String) request.getAttribute("author");
	%>
	<form action="/servlet018/loginServlet" method="post">
		username:<input type="text" name="username"
			value="<%=(null == request.getAttribute("username")) ? " "
					: request.getAttribute("username")%> "><br>
		password:<input type="password" name="password"><br>
		用户权限: <select name="author">
			<option value="1" <%="1".equals(author) ? "selected" : " "%>>普通用户</option>
			<option value="2" <%="2".equals(author) ? "selected" : " "%>>管理员</option>
		</select> <br> <input type="submit" value="提交">
	</form>
</body>
</html>