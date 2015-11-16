<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 判断员工信息是否为空 -->
	<s:if test="#request.employee==null || #request.employee.size()==0">
		没有员工信息
	</s:if>
	<s:else>
		<table cellpadding="10" cellspacing="0" border="2">
			<tr>
				<td>员工编号</td>
				<td>员工姓名</td>
				<td>email</td>
				<td>生日</td>
				<td>注册时间</td>
				<td>所在部门</td>
			</tr>
			<s:iterator value="#request.employee">
				<tr>
					<td>${id}</td>
					<td>${lastName}</td>
					<td>${email}</td>
					<td>${birth}</td>
					<td>${createTime}</td>
					<td>${dept.deptName}</td>
				</tr>
			</s:iterator>
		</table>
	</s:else>

</body>
</html>