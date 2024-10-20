<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Error</h1>

	<!-- forwarding -->
	<!-- <%
		String x = (String)request.getAttribute("abc");
		out.write("<h2>"+ x + "</h2>");
	%> -->
	<!-- redirect -->
	<%
		String y = (String)session.getAttribute("abc");
		out.write("<h2>"+ y + "</h2>");
	%>
</body>
</html>