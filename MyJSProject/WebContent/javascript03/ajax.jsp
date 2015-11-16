<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通过ajax实现helloWorld</title>
<script type="text/javascript">
	//声明一个空对象以接收XMLHttpRequest对象
	var xmlHttpRequest = null;
	//创建函数
	function ajaxSubmit(){
		//alert(window.ActiveXObject);
		//判断window.ActiveXObject对象是否为空
		//IE浏览器
		if(window.ActiveXObject){
			//创建xmlHttpRequest			
			xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");	
			//如果windows下有XMLHttpRequest子对象存在则进入
			//除IE外其它浏览器实现
		}else if(window.XMLHttpRequest){
			xmlHttpRequest = new XMLHttpRequest();		 
		}  
		//判断向服务器发送请求
		if(null != xmlHttpRequest ){
			
			xmlHttpRequest.open("GET","ajaxServlet?v1="+v1+"&v2="+v2,true);
					
		}
	}
		

</script>
</head>
<body>
	<input type="text" id="v1">
	<input type="text" id="v2">
	<input type="button" value="get content from server" onclick="ajaxSubmit();">
	<div id="div1"></div>
</body>
</html>