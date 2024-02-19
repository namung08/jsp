<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String ansStr = request.getParameter("ans");
	int ans=0;
	if(ansStr != null && !ansStr.equals("")) {
		ans = Integer.parseInt(ansStr);
	}
%>
<h1>응답결과</h1>
<p>
	<% if(ans==300){ %>
		정답입니다.
	<%} else { %>
		정답이 아닙니다.
	<%} %>
</p>
</body>
</html>