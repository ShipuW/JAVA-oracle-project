<%@page import="com.oracle.mountain.BookBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session的简单使用</title>
</head>
<body>
<% 
	BookBean book  = (BookBean)session.getAttribute("bookBean");
	if(book==null){
		out.println("在session中没有找到该键");
		book = new BookBean();
		book.setName("测试");
		session.setAttribute("bookBean",book);
	}else{
		out.println(book.getName());
	}
%>
</body>
</html>