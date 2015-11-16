<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-responsive.min.css" rel="stylesheet">
<link href="css/site.css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="css/QQShop.css">
<script type="text/javascript" src="js/jquery-1.5.2.js"></script>
<script type="text/javascript" src="js/QQShop.js"></script>

<title>学生管理系统</title>
<script type="text/javascript">
	$(function() {
		$("#name").blur(function() {
			var name = $.trim($("#name").val());
			if ($("#name").val() == "") {
				$("#lname").text("姓名不能为空");
				return false;
			} else if (!/[\u4e00-\u9fa5]/.test(name)) {
				$("#lname").text("请输入中文格式");
				return false;
			} else {
				$("#lname").text("");
				return true;
			}
		});
	});
	//在提交前进行检查
	function check() {
		var name = $.trim($("#name").val());
		if ($("#name").val() == "") {
			$("#lname").text("姓名不能为空");
			return false;
		} else if (!/[\u4e00-\u9fa5]/.test(name)) {
			$("#lname").text("请输入中文格式");
			return false;
		} 
		return true;
	}

	
</script>
</head>
<body>

	<div class="container">
		<div class="navbar">
			<div class="navbar-inner">
				<div class="container">
					<div class="brand">学生管理系统</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span3">
				<div class="well" style="padding: 8px 0;">
					<ul class="nav nav-list">
						<li class="nav-header">功能</li>
						<li class="divider"></li>
						<li><a href="index.jsp"><i class="icon-check"></i>添加学生信息</a></li>
						<li class="active"><a href="search.jsp"><i
								class="icon-check"></i>查询学生信息</a></li>
						<li><a href="modify.jsp"><i class="icon-check"></i>修改学生信息</a></li>
						<li><a href="deleteStu.jsp"><i class="icon-check"></i>删除学生信息</a></li>
						<li class="divider"></li>
					</ul>
				</div>
			</div>
			<div class="span9">
				<form action="selectAction" id="edit-profile"
					class="form-horizontal" method="post">
					<div class="control-group">
						<label class="control-label" for="input01">请输入学生姓名</label>
						<div class="controls">
							<input style="width: 100px;" type="text" name="name" id="name" />&nbsp;&nbsp;
							<button type="submit" class="btn btn-primary"onclick="return check()">确定</button>
							<button class="btn" type="reset">取消</button>
						</div>
						<div class="controls">
							<label style="color: red" id="lname"></label>
						</div>
					</div>

				</form>
				<fieldset>
					<legend>学生信息</legend>
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>学校</th>
								<th>学院</th>
								<th>专业</th>
								<th>班级</th>
								<th>姓名</th>
								<th>学号</th>
							</tr>
						</thead>
						<tbody>
							<s:iterator value="list" id="stu">
								<tr>
									<td><s:property value="#stu.university" /></td>
									<td><s:property value="#stu.department" /></td>
									<td><s:property value="#stu.major" /></td>
									<td><s:property value="#stu.clas" /></td>
									<td><s:property value="#stu.name" /></td>
									<td><s:property value="#stu.id" /></td>
								</tr>
							</s:iterator>
						</tbody>
					</table>
				</fieldset>
				<div class="control-group">
					<%
						if (session.getAttribute("searchMsg") != null) {
							out.print("<lable style='color:red'>"
									+ session.getAttribute("searchMsg") + "</lable><br>");
							session.setAttribute("searchMsg", null);
						}
					%>
				</div>
			</div>
		</div>
	</div>

</body>
</html>