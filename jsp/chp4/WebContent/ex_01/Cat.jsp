<%@page import="com.oracle.mountain.Cat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.oracle.mountain.TestCat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有猫的信息</title>
</head>
<body>
	<%!
		TestCat test = new TestCat();
		List<Cat> list = new ArrayList<Cat>();
	%>
	<%
		list = test.getAll();
		for(int i=0;i<list.size();i++){
			out.println(list.get(i));
			out.println("<br>");
		}
	%>
	<%
		for(int i=0;i<list.size();i++){
			Cat cat = new Cat();
			cat = list.get(i);%>
			<table border="1" >
				<tr>
					<td><%=cat.getName()%></td>
					<td><%=cat.getAge()%></td>
					<td><%=cat.getClor()%></td>
			</tr>
			</table>
	<%}%>
</body>
</html>