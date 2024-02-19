<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	http://localhost:8080/first.jsp?cnt=3
	cnt가 null 이거나 "" 값이면 100 고정
-->
	<%
		String cntStr = request.getParameter("cnt");
		int cnt = 100;
		if(cntStr != null && !cntStr.equals("")) {
			cnt = Integer.parseInt(cntStr);
		}
		
		for(int i=0;i<cnt;i++){
	%>
		안녕하세요 servlet!!!<br>
	<%	
		}
	%>
</body>
</html>