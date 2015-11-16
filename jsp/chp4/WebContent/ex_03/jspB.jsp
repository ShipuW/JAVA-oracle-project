<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="useBean" class="com.oracle.mountain.BookBean" scope="session"/>
		<%out.println(useBean.getName());
		%>
		<br>
		<%out.println(useBean.getPrice());
		if(useBean.isRecommend()){
			%><br>推荐<br>
			
		<%}
	%>
	<%=useBean.getName() %>
	<%=useBean.getPrice() %>
</body>
</html>