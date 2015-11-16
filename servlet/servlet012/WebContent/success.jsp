<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<title>My JSP 'loginSuccess.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<body>
	用户名：<%=request.getAttribute("username")%><br> 密码：<%=request.getAttribute("password")%>
	<br> 性别：<%=request.getAttribute("gender")%>
	<br> 兴趣：<%
		String[] interest = (String[]) request.getAttribute("interest");
		for (String str : interest) {
	%>
	<%=str%>
	&nbsp;&nbsp;

	<%
		}
	%>

	<br> 地址：<%=request.getAttribute("address")%><br> 说明：<%=request.getAttribute("comment")%>
</body>
</html>
