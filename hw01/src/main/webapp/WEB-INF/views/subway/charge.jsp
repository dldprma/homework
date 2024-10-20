<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>요금 확인</h1>
	<%
		String age = (String)request.getAttribute("age");
		String charge = (String)request.getAttribute("charge");
		
		out.write("<h3> 나이 : "+ age +"</h3>");
		out.write("<h3> 요금 : "+ charge +"</h3>");
	%>
</body>
</html>