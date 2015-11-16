<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>begin.jsp</title>
<script type="text/javascript">
	function validate() {
		var num = document.getElementsByName("number")[0];

		if (num.value.length < 1) {
			alert("输入不能为空！");

			num.focus();

			return false;
		}

		for ( var i = 0; i < num.value.length; i++) {
			var param = "0123456789";

			if (param.indexOf(num.value.charAt(i)) == -1) {
				alert("输入必须为数字");

				num.focus();

				return false;
			}
		}

		if (parseInt(num.value) < 5 || parseInt(num.value) > 15) {
			num.value = 10;
		}

		return true;
	}
</script>
</head>
<body>
	<form action="end.jsp" name="form1" method="post"
		onsubmit="return validate();">
		请输入数字 （5——15）<input type="text" name="number"><br> <input
			type="submit" value="submit">
	</form>
</body>
</html>