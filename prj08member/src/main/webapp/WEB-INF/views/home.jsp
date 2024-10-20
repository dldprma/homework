<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>홈페이지</h1>

    <%
        String x = (String)session.getAttribute("abc");
        out.write("<h2>" + x + "님 환영합니다 !</h2>");
    %>

    <a href="/app08/member/join/view">회원가입</a>
    <br>
    <a href="/app08/member/login/view">로그인</a>
</body>
</html>