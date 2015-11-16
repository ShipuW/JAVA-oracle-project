<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>使用javaBean存值</title>
</head>
<body>
	<jsp:useBean id="useBean"class="com.oracle.mountain.BookBean"scope="session"></jsp:useBean>
	<jsp:setProperty property="name" name="useBean"value=“英语”/>
	<jsp:setProperty property="price" name="useBean"value="108"/>
	<jsp:setProperty property="recommend" name="useBean"value="true"/>
	<a herf="jspB.jsp">jspB.jsp</a>	
	
</body>
</html>