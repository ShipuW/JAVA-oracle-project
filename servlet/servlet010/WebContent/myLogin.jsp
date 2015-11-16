<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<script type="text/javascript">
    
    	function validate()
    	{
    		//var username = document.getElementById("username1");
    		//var password = document.getElementById("password1");
    		//var repassword = document.getElementById("repassword1");
    		
    		var username = document.getElementsByName("username")[0];
    		var password = document.getElementsByName("password")[0];
    		var repassword = document.getElementsByName("repassword")[0];
    		
    		if(username.value.length == 0)
    		{
				alert("请输入用户 名!");
				
				return false;
    		}
   
    		if(password.value.length < 6 || password.value.length > 10)
    		{
    			alert("密码长度不正确");
    			
    			return false;
    		}
    		
    		if(repassword.value.length < 6 || repassword.value.length > 10)
    		{
    			alert("重复密码长度不正确");
    			
    			return false;
    		}
    		
    		if(password.value != repassword.value)
    		{
    			alert("二次输入的密码不相同");
    			
    			return false;
    		}
    		
    		return true;
    	}
    
    
    </script>

</head>

<body>


	<form action="ValidateServlet" method="post">

		username: <input type="text" name="username" id="username1"><br>
		password: <input type="password" name="password" id="password1"><br>
		re-password: <input type="password" name="repassword" id="repassword1"><br>

		<input type="submit" value="submit" onclick="return validate();">

	</form>























</body>
</html>
