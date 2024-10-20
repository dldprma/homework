<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>로또 번호 추첨기</h1>

    <form action="/hw01/lotto" method="post">
        <span>자동 로또 구매 </span>
        <input type="number" name="auto" placeholder="구매 개수를 입력해주세요.">
        <input type="submit" value="로또번호보러가기">
    </form>
</body>
</html>