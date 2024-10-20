<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="/hw01/lotto2" method="post">
        <p>수동 로또 구매</p>
        <input type="number" name="manual1" placeholder="로또 번호 입력">
        <br>
        <input type="number" name="manual2" placeholder="로또 번호 입력">
        <br>
        <input type="number" name="manual3" placeholder="로또 번호 입력">
        <br>
        <input type="number" name="manual4" placeholder="로또 번호 입력">
        <br>
        <input type="number" name="manual5" placeholder="로또 번호 입력">
        <br>
        <input type="number" name="manual6" placeholder="로또 번호 입력">
        <br>
        <input type="submit" value="로또당첨보러가기">
    </form>
</body>
</html>