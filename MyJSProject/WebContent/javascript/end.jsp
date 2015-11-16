<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var value =
<%=request.getParameter("number")%>
	;
	alert(value);
	function checkAll() {
		var s = document.getElementsByName("check");
		var m = document.getElementsByName("all")[0];

		if (m.checked) {
			for (var i = 0; i < s.length; i++) {
				s[i].checked = true;
			}
		} else {
			for (var i = 0; i < s.length; i++) {
				s[i].checked = false;
			}
		}
	}

	function turn() {
		with (document) {
			var m = getElementById("change");
			var n = getElementById("table");

			if (m.value == "收缩") {
				n.style.display = "none";
				m.value = "展开";
			} else {
				n.style.display = "block";
				m.value = "收缩";
			}
		}
	}
</script>
</head>

<body>

	<table border="1" align="center" width="60%">

		<tr>
			<td><input type="checkbox" name="all" onclick="checkAll();">全选
			</td>

			<td><input type="button" value="收缩" id="change"
				onclick="turn();"></td>

		</tr>

	</table>

	<%
		int number = Integer.parseInt(request.getParameter("number"));
	%>

	<table border="1" align="center" width="60%" id="table">

		<%
			for (int i = 1; i <= number; i++) {
		%>

		<tr>
			<td><input type="checkbox" name="check"></td>

			<td><%=i%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>