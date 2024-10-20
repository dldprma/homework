<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>과연 당첨인가?</h1>
	
	
	<% 
		List<String> lottoNumbers = (List<String>)request.getAttribute("lottoNumbers");
		String cnt = (String)request.getAttribute("matchCount");
		String result = (String)request.getAttribute("result");
		out.write("<h2>로또 번호 : " + lottoNumbers +"</h2>");
		out.write("<h3>맞힌 개수 : "+ cnt +"</h3>");
		out.write("<h2>"+ result +"</h2>");
	%>
</body>
</html>