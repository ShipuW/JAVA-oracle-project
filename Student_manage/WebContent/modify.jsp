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
	function isext() {
		jQuery.ajax({
			url : "isIdExt",
			type : "post",
			dataType : "text",
			data : {
				"id" : $("#id").val()
			},
			success : function(data) {
				if (data == 1) {
					$("#lid").text("学号存在,可以修改学生信息");
					return true;
				} else {
					$("#lid").text("可以不存在,请重新输入!");
					return false;
				}
			}
		});
	}
	$(function() {
		$("#university").blur(function() {
			var university = $.trim($("#university").val());
			if ($("#university").val() == "") {
				$("#luniversity").text("学校不能为空");
				return false;
			} else if (!/[\u4e00-\u9fa5]/.test(university)) {
				$("#luniversity").text("请输入中文格式");
				return false;
			} else {
				$("#luniversity").text("");
				return true;
			}
		});
		$("#department").blur(function() {
			var department = $.trim($("#department").val());
			if ($("#department").val() == "") {
				$("#ldepartment").text("学院不能为空");
				return false;
			} else if (!/[\u4e00-\u9fa5]/.test(department)) {
				$("#ldepartment").text("请输入中文格式");
				return false;
			} else {
				$("#ldepartment").text("");
				return true;
			}
		});
		$("#major").blur(function() {
			var major = $.trim($("#major").val());
			if ($("#major").val() == "") {
				$("#lmajor").text("专业不能为空");
				return false;
			} else if (!/[\u4e00-\u9fa5]/.test(major)) {
				$("#lmajor").text("请输入中文格式");
				return false;
			} else {
				$("#lmajor").text("");
				return true;
			}
		});
		$("#class").blur(function() {
			var clas = $.trim($("#class").val());
			if ($("#class").val() == "") {
				$("#lclass").text("班级不能为空");
				return false;
			} else if (!/^[0-9]*$/.test(clas)) {
				$("#lclass").text("请输入数字格式");
				return false;
			} else {
				$("#lclass").text("");
				return true;
			}
		});
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
		$("#id").blur(function() {
			var id = $.trim($("#id").val());
			if ($("#id").val() == "") {
				$("#lid").text("学号不能为空");
				return false;
			} else if (!/^[0-9]*$/.test(id)) {
				$("#lid").text("请输入数字格式");
				return false;
			} else {
				return isext();
				$("#lid").text("");
				return true;
			}
		});

	});
	//在提交前进行检查
	function check() {
		var university = $.trim($("#university").val());
		if ($("#university").val() == "") {
			$("#luniversity").text("学校不能为空");
			return false;
		} else if (!/[\u4e00-\u9fa5]/.test(university)) {
			$("#luniversity").text("请输入中文格式");
			return false;
		} 
		var department = $.trim($("#department").val());
		if ($("#department").val() == "") {
			$("#ldepartment").text("学院不能为空");
			return false;
		} else if (!/[\u4e00-\u9fa5]/.test(department)) {
			$("#ldepartment").text("请输入中文格式");
			return false;
		} 
		var major = $.trim($("#major").val());
		if ($("#major").val() == "") {
			$("#lmajor").text("专业不能为空");
			return false;
		} else if (!/[\u4e00-\u9fa5]/.test(major)) {
			$("#lmajor").text("请输入中文格式");
			return false;
		} 
		var clas = $.trim($("#class").val());
		if ($("#class").val() == "") {
			$("#lclass").text("班级不能为空");
			return false;
		} else if (!/^[0-9]*$/.test(clas)) {
			$("#lclass").text("请输入数字格式");
			return false;
		} 
		var name = $.trim($("#name").val());
		if ($("#name").val() == "") {
			$("#lname").text("姓名不能为空");
			return false;
		} else if (!/[\u4e00-\u9fa5]/.test(name)) {
			$("#lname").text("请输入中文格式");
			return false;
		} 
		var id = $.trim($("#id").val());
		if ($("#id").val() == "") {
			$("#lid").text("学号不能为空");
			return false;
		} else if (!/^[0-9]*$/.test(id)) {
			$("#lid").text("请输入数字格式");
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
						<li><a href="search.jsp"><i class="icon-check"></i>查询学生信息</a></li>
						<li class="active"><a href="modify.jsp"><i
								class="icon-check"></i>修改学生信息</a></li>
						<li><a href="deleteStu.jsp"><i class="icon-check"></i>删除学生信息</a></li>
						<li class="divider"></li>
					</ul>
				</div>
			</div>
			<div class="span9">
				<form class="form-horizontal">
					<div class="control-group">
						<label class="control-label" for="input01">请输入学生学号</label>
						<div class="controls">
							<input style="width: 100px;" type="text" name="id" id="id" /> <label
								style="color: red" id="lid"></label>
						</div>
					</div>
				</form>
				<form action="modifyAction" id="edit-profile"
					class="form-horizontal" method="post">
					<fieldset>
						<legend>修改学生信息</legend>
						<table style="table-layout: fixed;" width="95%">
							<tr>
								<td align="center" width="15"><label>学校</label></td>
								<td align="center" width="15"><label>学院</label></td>
								<td align="center" width="15"><label>专业</label></td>
								<td align="center" width="15"><label>班级</label></td>
								<td align="center" width="15"><label>姓名</label></td>
							</tr>
							<tr>
								<td><input style="width: *;" type="text" id="university"
									name="stu.university" /></td>
								<td><input style="width: *;" type="text" id="department"
									name="stu.department" /></td>
								<td><input style="width: *;" type="text" id="major"
									name="stu.major" /></td>
								<td><input style="width: *;" type="text" id="class"
									name="stu.clas" /></td>
								<td><input style="width: *;" type="text" id="name"
									name="stu.name" /></td>
							</tr>
							<tr>
								<td><label style="color: red" id="luniversity"></label></td>
								<td><label style="color: red" id="ldepartment"></label></td>
								<td><label style="color: red" id="lmajor"></label></td>
								<td><label style="color: red" id="lclass"></label></td>
								<td><label style="color: red" id="lname"></label></td>
							</tr>
						</table>
						<div class="form-actions">
							<button type="submit" class="btn btn-primary" onclick="return check()">修改</button>
							<button class="btn" type="reset">取消</button>
						</div>
					</fieldset>
				</form>
				<div class="control-group">
					<%
						if (session.getAttribute("modifyMsg") != null) {
							out.print("<lable style='color:red'>"
									+ session.getAttribute("modifyMsg") + "</lable><br>");
							session.setAttribute("modifyMsg", null);
						}
					%>
				</div>
			</div>
		</div>
	</div>

</body>
</html>