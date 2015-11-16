<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if (application.getAttribute("counter") == null)
			application.setAttribute("counter", "1");
		else {
			String strnum = null;
			strnum = application.getAttribute("counter").toString();
			int icount = 0;
			icount = Integer.valueOf(strnum).intValue();
			icount++;
			application.setAttribute("counter", Integer.toString(icount));
		}
	%>
	您是第<%=application.getAttribute("counter")%>位访问者！

</body>
</html>