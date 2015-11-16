<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="errorStudent.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改学生信息</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	%>
	<!-- 把操作信息和学生信息添加到JavaBean中 -->
	<!-- 创建javabean action -->
	<jsp:useBean id="act" class="com.javabean.Action" scope="request" />
	<!-- 赋值 -->
	<jsp:setProperty property="*" name="act" />
	<!-- 创建javabean 学生 -->
	<jsp:useBean id="stu" class="com.javabean.Student" scope="session" />
	<!-- 赋值 -->
	<jsp:setProperty property="*" name="stu" />
	<!-- 跳转 -->
	<jsp:forward page="modifyStudent.jsp"></jsp:forward>
</body>
</html>