<%@ page language="java" import="com.oracle.bean.UserBean"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="userBean" class="com.oracle.bean.UserBean"
		scope="application" />
	<jsp:setProperty property="username" name="userBean" value="oracle" />
	<jsp:setProperty property="password" name="userBean" value="oracle" />
</body>
</html>