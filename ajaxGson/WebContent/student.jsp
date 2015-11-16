<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jquery-1.11.1.js"></script>
<title>student</title>
<script type="text/javascript">
	$(function() {
		//注册button事件
		$("#btn").click(function() {
			$.ajax({
				url : "studentServlet",
				type : "POST",
				dataType : "json",
				data : {
					stuId : $("#sId").val()
				},
				success : function(data) {
					//var stu = {"name":"test for java","stuId":"test","age":10}
					var stu = data;
					//取得学生编码、姓名、年龄
					var id = stu.stuId;
					var name = stu.name;
					var age = stu.age;
					//把这些信息添加到文本框中
					$("#stuId").val(id);
					$("#name").val(name);
					$("#age").val(age);
				}
			});
		});
	});
</script>
</head>
<body>
	<input type="text" id="sId">
	<input type="button" id="btn" value="根据ID查询学生信息">
	<br> 学生ID：
	<input type="text" id="stuId">
	<br> 学生姓名：
	<input type="text" id="name">
	<br> 学生年龄：
	<input type="text" id="age">
	<br>
</body>
</html>