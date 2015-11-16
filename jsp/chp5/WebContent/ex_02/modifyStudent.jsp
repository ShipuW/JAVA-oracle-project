<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生的详细以及修改</title>
</head>
<body>
	<jsp:useBean id="stu" class="com.javabean.Student" scope="session"/>
		<form action="updateStudent.jsp" method="post">
			<!-- 一个用于Action操作 另一个学生信息的 -->
			<input type="hidden" name="action" value="modify"/> 
			<input type="hidden" name="resource" value="modifyStudent.jsp"/>
			学生的姓名：<input type="text" name="name" value='<jsp:getProperty property="name" name="stu"/>'/>
			学生的年龄：<input type="text" name="age" value='<jsp:getProperty property="age" name="stu"/>'/>
				<input type="submit" value="修改学生信息">
		</form>
	
	
</body>
</html>