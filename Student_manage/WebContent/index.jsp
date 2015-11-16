<%@page import="com.sun.xml.internal.txw2.Document"%>
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
<script type="text/javascript" src="js/area_choose.js" charset="utf-8"></script>
<script type="text/javascript" src="js/min.js" charset="utf-8"></script>

<title>学生管理系统</title>
<script type="text/javascript">
	$(document).ready(function() {
		$.areainit();
	});
	function isext() {
		jQuery.ajax({
			url : "isIdExt",
			type : "post",
			dataType : "text",
			data : {
				"clas":$("#class").val(),
				"name":$("#name").val(),
				"id" : $("#id").val()
			},
			async: false,
			success : function(data) {
				if (data == 1) {
					$("#lid").text("该学生已经存在,不能重复添加");
					document.getElementById("StuIsExist").value = false;
				} else {
					$("#lid").text("可以添加");
					document.getElementById("StuIsExist").value = true;
				}
			}
		});
	}

	$(function() {
		$("#prov").blur(function() {
			if ($("#prov").val() == 0) {
				$("#lprovince").text("请选择省份");
				return false;
			} else {
				$("#lprovince").text("");
				return true;
			}
		});
		$("#univ").blur(function() {
			if ($("#prov").val() == 0) {
				$("#lprovince").text("请选择省份");
				return false;
			} else if ($("#univ").val() == 0) {
				$("#luniversity").text("请选择学校");
				return false;
			} else {
				$("#luniversity").text("");
				return true;
			}
		});
		$("#depa").blur(function() {
			if ($("#prov").val() == 0) {
				$("#lprovince").text("请选择省份");
				return false;
			} else if ($("#univ").val() == 0) {
				$("#luniversity").text("请选择学校");
				return false;
			} else if ($("#depa").val() == 0) {
				$("#ldepartment").text("请选择学院");
				return false;
			} else {
				$("#ldepartment").text("");
				return true;
			}
		});
		$("#majo").blur(function() {
			if ($("#prov").val() == 0) {
				$("#lprovince").text("请选择省份");
				return false;
			} else if ($("#univ").val() == 0) {
				$("#luniversity").text("请选择学校");
				return false;
			} else if ($("#depa").val() == 0) {
				$("#ldepartment").text("请选择学院");
				return false;
			} else if ($("#majo").val() == 0) {
				$("#lmajor").text("请选择专业");
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
				$("#lclass").text("请输入正确格式");
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
				isext();
				return document.getElementById("StuIsExist").value;
				$("#lid").text("");
				return true;
			}
		});

	});
	//在提交前进行检查
	function check() {
		if ($("#prov").val() == 0) {
			$("#lprovince").text("请选择省份");
			return false;
		}
		if ($("#univ").val() == 0) {
			$("#luniversity").text("请选择学校");
			return false;
		}
		if ($("#depa").val() == 0) {
			$("#ldepartment").text("请选择学院");
			return false;
		} 
		if ($("#majo").val() == 0) {
			$("#lmajor").text("请选择专业");
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
		}else{
			isext();
			//不能这样判断：if($("#StuIsExist").val())，因为貌似$("#StuIsExist").val()的返回值默认是var型，不是boolean型
			if($("#StuIsExist").val() == true){ 
				return true;
			}else{
				return false;
			}
		}
	}
	//提交表单前，option中value的值转换为对应文本值
	function change() {
		var option = document.getElementById("prov").options;
		for ( var i = 1; i < option.length; i++) {
			option[i].value = option[i].text;
		}
		var option1 = document.getElementById("univ").options;
		for ( var i = 1; i < option1.length; i++) {
			option1[i].value = option1[i].text;
		}
		var option2 = document.getElementById("depa").options;
		for ( var i = 1; i < option2.length; i++) {
			option2[i].value = option2[i].text;
		}
		var option3 = document.getElementById("majo").options;
		for ( var i = 1; i < option3.length; i++) {
			option3[i].value = option3[i].text;
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
						<li class="active"><a href="index.jsp"><i
								class="icon-check"></i>添加学生信息</a></li>
						<li><a href="search.jsp"><i class="icon-check"></i>查询学生信息</a></li>
						<li><a href="modify.jsp"><i class="icon-check"></i>修改学生信息</a></li>
						<li><a href="deleteStu.jsp"><i class="icon-check"></i>删除学生信息</a></li>
						<li class="divider"></li>
					</ul>
				</div>
			</div>
			<div class="span9">
				<form action="insertAction" id="edit-profile"
					class="form-horizontal" method="post" onsubmit="return change();">
					<fieldset>
						<legend>添加学生信息</legend>
						<div class="control-group">
							省份<select id='prov' name="stu.province"></select> 学校<select
								id='univ' name="stu.university"></select>
						</div>
						<div class="control-group">
							学院<select id='depa' name="stu.department"></select> 专业<select
								id='majo' name="stu.major"></select>
						</div>

						<div class="control-group">
							班级<input type="text" id="class" name="stu.clas" /><label
								style="color: red" id="lclass"></label>
						</div>
						<div class="control-group">
							姓名<input type="text" id="name" name="stu.name" /><label
								style="color: red" id="lname"></label>
						</div>
						<div class="control-group">
							学号<input type="text" id="id" name="stu.id" /><label
								style="color: red" id="lid"></label>
						</div>
						<label style="color: red" id="lprovince"></label> <label
							style="color: red" id="luniversity"></label> <label
							style="color: red" id="ldepartment"></label> <label
							style="color: red" id="lmajor"></label>

						<div class="form-actions">
							<button type="submit" class="btn btn-primary"
								onclick="return check();">保存</button>
							<button class="btn" type="reset">取消</button>
						</div>
					</fieldset>
				</form>
				<div class="control-group">
					<%
						if (session.getAttribute("regMsg") != null) {
							out.print("<lable style='color:red'>"
									+ session.getAttribute("regMsg") + "</lable><br>");
							session.setAttribute("regMsg", null);
						}
					%>
					<input type="hidden" id="StuIsExist">
				</div>
			</div>
		</div>
	</div>
</body>
</html>