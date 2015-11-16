<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<title>通过ajax实现helloworld</title>
</head>
<script type="text/javascript">
	//声明一个空对象以接收XMLHttpRequest对象
	var xmlHttpRequest = null;
	//创建函数
	function ajaxSubmit() {
		//alert(window.ActiveXObject)
		//判断window.ActiveXObject对象是否为空
		//IE浏览器
		if (window.ActiveXObject) {
			//创建xmlHttpRequest
			xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
			//如果windows下有XMLHttpRequest子对象存在则进入
			//除IE外的其他浏览器实现
		} else if (window.XMLHttpRequest) {
			xmlHttpRequest = new XMLHttpRequest();
		}
		//判断的向服务器发送请求
		if (null != xmlHttpRequest) {
			//**********取得文本框的值
			var v1 = document.getElementById("value1").value;
			var v2 = document.getElementById("value2").value;

			//1.method向服务器端发送请求的方法
			//2.url请求的资源
			//3.async是true(异步)或者false(同步)
			//4.username用户 名
			//5.password密码 (4-5不般不需要)
			//**************对过get方式
			//xmlHttpRequest.open("GET","ajaxTextServlet?v1=" + v1 + "&v2=" + v2, true);
			//以post方式提交
			xmlHttpRequest.open("POST","ajaxTextServlet", true);
			//引用某个事件处理器
			//ajaxCallback函数的引用
			//onreadystatechange状态改变会调用函数
			//关联好ajax的回调函数
			xmlHttpRequest.onreadystatechange = ajaxCallback;
			//向服务器端发送数据
			//1.null如果以GET方式发送请求设置为null***********
			//xmlHttpRequest.send(null);
			//如果以POST请求体方式我们需要设置请求头
			
			xmlHttpRequest.setRequestHeader("Content-Type", "application/x-www-form-urlencoded")
			//以POST方式发送请求，请求体的行式
			xmlHttpRequest.send("v1="+v1+"&v2="+v2);
		}
	}
	//创建回调函数
	function ajaxCallback() {
		//alert("ajaxCallback");
		//完整收到服务器响应
		if (xmlHttpRequest.readyState == 4) {
			//服务器没有抛出异常
			if (xmlHttpRequest.status == 200) {
				//得到服务器端回传的数据
				var responseText = xmlHttpRequest.responseText;
				document.getElementById("div1").innerHTML = responseText;
			}
		}
	}
</script>
<body>
	<input type="button" value="get content from server"
		onclick="ajaxSubmit();">
	<br>
	<input type="text" name="value1" id="value1">
	<br>
	<input type="text" name="value2" id="value2">
	<div id="div1"></div>
</body>
</html>