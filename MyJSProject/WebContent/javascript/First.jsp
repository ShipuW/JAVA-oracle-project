<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>全选和反选</title>
<script type="text/javascript">
	function checkAll(){
		var s = document.getElementsByName("check");
		var m = document.getElementsByName("all")[0];
		if(m.checked){
			for(var i =0;i<s.length;i++){
				s[i].checked=true;
			}
		}else{
			for(var i=0;i<s.length;i++){
				s[i].checked=false;
			}
		}	
	}
	
	function checkNone(){
		var s = document.getElementsByName("check");
		for(var i=0;i<s.length;i++){
			if(s[i].checked){
				s[i].checked=false;
			}else{
				s[i].checked=true;				
			}
		}
	}
</script>

</head>
<body>
	<table border="1" align="center" width="60%">
		<tr>
			<td>
				<input type="checkbox" name="all" onclick="checkAll();">全选
			</td>
			<td>	
				<input type="checkbox" name="none" onclick="checkNone();">反选
			</td>
			<%
				for(int i =1;i<=9;i++){
					
			%>	
		</tr>
		<tr>
			<td>
				<input type="checkbox" name="check">
			</td>	
			<td>
				<%=i%>
			</td>
		</tr>
			<%
				}			
			%>
	</table>
</body>
</html>