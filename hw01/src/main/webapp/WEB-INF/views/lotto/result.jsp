<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또 결과</title>
</head>
<body>
	<h1>로또 결과</h1>

	<%
		// 여러 세트의 로또 번호를 가져옴
		List<List<String>> allLottoNumbers = (List<List<String>>) request.getAttribute("allLottoNumbers");

		if (allLottoNumbers == null) {
			out.write("<h3>로또 번호를 찾을 수 없습니다!</h3>");
		} else {
			int setCount = 1;
			// 각 세트를 반복하며 출력
			for(List<String> lottoNumbers : allLottoNumbers) {
				out.write("<h2>Set " + setCount + ":</h2>");
				setCount++;
				for(String number : lottoNumbers){
					out.write("<h4>Lotto Number: " + number + "</h4>");
				}
				out.write("<hr/>");  // 각 세트 사이에 구분선
			}
		}
	%>
</body>
</html>
