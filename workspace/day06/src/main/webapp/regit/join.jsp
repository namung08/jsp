<%@page import="com.codingbox.web.dto.UserDTO"%>
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
String userid = request.getParameter("userid");
String userpw = request.getParameter("userpw");
String username = request.getParameter("username");
String userphone = request.getParameter("userphone"); 

UserDTO udto = new UserDTO();
udto.setUserid(userid);
udto.setUsername(username);
udto.setUserphone(userphone);
udto.setUserpw(userpw);
%>
</body>
</html>