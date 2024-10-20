<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>지하철 요금 안내</h1>

    <form action="/hw01/subway" method="post">
        <span>나이 : </span>
        <input type="number" name="age" placeholder="나이를 입력하세요">
        <input type="submit" value="요금 확인">
    </form>
</body>
</html>