<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>count</title>
<script type="text/javascript" src="jquery-1.11.1.js"></script>
<script type="text/javascript">
	$(function() {
		//注册按键事件
		$("#btn").click(function() {
			//url:提交的URL
			//type:method,提交的方法get post
			//dataType:返回的数据类型，"html" "json"
			//data:提交的数据{}
			//success:callback 回调函数
			$.ajax({
				url : "ajaxServlet",
				type : "POST",
				dataType : "html",
				data : {
					//键的引号可加可不加
					"count1" : $("#count1").val(),
					"count2" : $("#count2").val()
				},
				success : function(data) {
					$("#result").val(data);
				}
			});
		});
		f
	});
</script>
</head>
<body>
	第一个数字：
	<input type="text" id="count1">
	<br> 第二个数字：
	<input type="text" id="count2">
	<br> 计算的结果：
	<input type="text" id="result">
	<br>
	<input type="button" value="计算" id="btn">
</body>
</html>