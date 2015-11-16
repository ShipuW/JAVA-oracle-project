<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="post.jsp">
		<p align="center">用户登录
		<p align="center">
			用户名：<input type="text" name="User" size="20">&nbsp;&nbsp;&nbsp;&nbsp;
			密码：<input type="password" name="pwd" size="20"><br> <br>
			浏览器类型: <input type="radio" name="radio" value="ie" checked>IE
			&nbsp;&nbsp; <input type="radio" name="radio" value="ns">Netscape
			<br> 资料选项： <input type="checkbox" name="check1" value="ON"
				checked>标题 <input type="checkbox" name="check2" value="ON">详细
			<input type="hidden" name="hidden" value="transPara">
		</p>
		<p align="center">
			<input type="submit" value=" 提交"> <input type="reset"
				value="全部重写">
		</p>
	</form>
</body>
</html>