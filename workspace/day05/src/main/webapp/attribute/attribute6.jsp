<%@page import="com.codingbox.web.vo.User"%>
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
<%
	// request 객체에서 users 키로 당된 value값을 꺼낸 후
	User[] users = (User[])request.getAttribute("users");
	// for문을 통해서 객체배열 출력
	for(int i=0; i<users.length; i++) {
		out.println(users[i].userid);
		out.println(users[i].username);
		out.println(users[i].age+"<br>");
	}
%>
</body>
</html>