<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通过ajax实现注册</title>
<script type="text/javascript">
	var xmlHttpRequest = null;

	function ajaxSubmit(){
		if(window.ActionXObjetc){
			xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
		}else if(window.XMLHttpRequest){
			xmlHttpRequest = new XMLHttpRequest();
		}
		if(null != xmlHttpRequest){
			xmlHttpRequest.open("POST","/MyJavaScript/ajaxservlet",true);
			xmlHttpRequest.onreadystatechange = function(){
				//alert(xmlHttpRequest.readyState);
				if(xmlHttpRequest.readyState == 4){
					if(xmlHttpRequest.status == 200){
						var responseText = xmlHttpRequest.responseText;
						document.getElementById("div1").innerHTML = responseText;
					}
				}
			}
			var username = document.getElementsByName("username")[0].value;
			var password = document.getElementsByName("password")[0].value;
			//alert(username);
			xmlHttpRequest.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
			xmlHttpRequest.send("username="+username+"&password="+password);
		}
	}
</script>
</head>
<body>
	用户名：<input type="text" name="username"><br>
	密码：<input type="password" name="password"><br>		
	<input type="button" value="get content from server" onclick="ajaxSubmit();"><br>
	<div id="div1"></div>
</body>
</html>