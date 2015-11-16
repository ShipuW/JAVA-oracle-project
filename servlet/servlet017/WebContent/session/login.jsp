<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登陆</title>
</head>
<body>
	<%
		String author = (String) request.getAttribute("author");
	%>

	<form action="/servlet017/loginServlet" method="post">
		username:<input type="text" name="username"
			value="<%=(null == request.getAttribute("username")) ? " "
					: request.getAttribute("username")%> "><br>
		password:<input type="password" name="password"><br>
		用户权限: <select name="author">
			
			<option value="1" <%="1".equals(author) ? "selected" : " "%>>普通用户</option>
			<!-- <option selected="selected">选择</option> -->
			<option value="2" <%="2".equals(author) ? "selected" : " "%>>管理员</option>
		</select> <br> <input type="submit" value="提交">
	</form>
</body>
</html>