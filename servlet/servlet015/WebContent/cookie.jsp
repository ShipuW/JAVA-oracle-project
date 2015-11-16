<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!int count1 = 0;
	int count2 = 0;%>
	<%
		Cookie cookie = new Cookie("cookieName" + count1++, "cookieValue"
				+ count2++);
		cookie.setMaxAge(15);
		response.addCookie(cookie);
	%>

	<%
		Cookie[] cookies = request.getCookies();
		if(null==cookies){
			return;
		}
		for(Cookie c:cookies){
	%>
	<p>
		<b>cookie name:</b><%=c.getName() %><br>
		<b>cookie value:<%=c.getValue() %></b>
	</p>
	<%
		}
	%>
</body>
</html>