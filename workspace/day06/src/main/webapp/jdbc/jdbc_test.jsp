<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	Connection conn = null;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "jsp";
	String pass = "jsp";
	
	Class.forName(driver);
	System.out.println("jdbc Driver 로딩 성공");
	
	conn = DriverManager.getConnection(url, user, pass);
	System.out.println("오라클 연결 성공");
%>
</body>
</html>