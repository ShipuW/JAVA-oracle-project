<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- 导入JavaBean包 -->
<%@ page import="com.oracle.bean.Person"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 创建JavaBean -->
	<jsp:useBean id="person" class="com.oracle.bean.Person" scope="session">
	</jsp:useBean>
	<!-- 从JavaBean中取值 -->
	<jsp:getProperty property="name" name="person" />
	<jsp:getProperty property="age" name="person" />
	<jsp:getProperty property="address" name="person" /><br>
	<!-- 设置JavaBean中的值 -->
	<jsp:setProperty property="name" name="person" value="OracleTest"/>
	<jsp:getProperty property="name" name="person" /><br>
	
	<!-- 通过脚本创建和取值 -->
	<%
		Person ps=new Person();
		out.println(ps.getName());
	%>
	<br>
	动态赋值
	<!-- 通过param动态为JavaBean赋值 -->
	<jsp:setProperty property="age" name="person" param="helloword"/>
	<jsp:getProperty property="age" name="person"/>
	
	
</body>
</html>