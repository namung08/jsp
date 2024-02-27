<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
	ArrayList<String> arList = new ArrayList<>();
	arList.add("hello");
	arList.add("jsp");
	arList.add("el");
	arList.add("jstl");
	pageContext.setAttribute("list",arList);
%>

<body>
	id : ${id } <br>
	pw : ${pw }	<br>
	id : ${param.id } <br>
	pw : ${param.pw }	<br>
	list : ${list }	<br>
</body>
</html>