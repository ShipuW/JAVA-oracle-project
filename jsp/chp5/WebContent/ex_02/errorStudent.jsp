<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>错误信息页面</title>
</head>
<body>
	<!-- 使用javabean得到我们的Action -->
	<jsp:useBean id="act" class="com.javabean.Action" scope="request" />
	<table>
		<tr>
			<td>操作</td>
			<td><jsp:getProperty property="action" name="act"/></td>
		</tr>
		<tr>
			<td>错误信息</td>
			<td><%=exception.toString()%></td>
		</tr>
		<tr>
			<td colspan="2"><a href='<jsp:getProperty property="resource" name="act"/>'>再来一次</a></td>
		</tr>
	</table>
</body>
</html>