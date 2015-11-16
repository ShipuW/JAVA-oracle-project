<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jquery-1.11.1.js"></script>
<title>studentAll</title>
<script type="text/javascript">
	//创建jQuery
	$(function(){
		//注册button事件
		$("#btn").click(function(){
			$.ajax({
				url:"studentAllServlet",
				type:"post",
				dataType:"json",
				data:{},
				success:function(data){
					var stulist = data;
					var html = "<table border='1'><tr><td>学生Id</td><td>学生姓名</td><td>学生年龄</td></tr>";
					//输出所有的学生信息  把gson取出的值添加到表格中
					for(var i=0;i<stulist.length;i++){
						//取出值并添加到表格中
						var stu = stulist[i];
						var id = stu.stuId;
						var name = stu.name;
						var age = stu.age;
						//添加到表格中
						html+="<tr><td>"+id+"</td><td>"+name+"</td><td>"+age+"</td></tr>";
					}
					html+="</table>";
					//移除table标签
					$("#tbody table:eq(0)").remove();
					$("#tbody").append(html);
				}
			});	
		});
	});
</script>
</head>
<body id="tbody">
	<input type="button" id="btn" value="查询所有的学生信息">
</body>
</html>