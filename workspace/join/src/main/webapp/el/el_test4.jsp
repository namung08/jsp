<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="el_test4.jsp">
		<%
		ArrayList<String> arList = new ArrayList<>();
		arList.add("Hello");
		arList.add("JSP");
		arList.add("EL");
		arList.add("JSTL");
		pageContext.setAttribute("list", arList);
		%>
		아이디: ${param.id}<br> 패스워드: ${param.pw}<br>
		${list}
	</form>
</body>
</html>