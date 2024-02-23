<%@page import="com.codingbox.web.dao.MemberDAO"%>
<%@page import="com.codingbox.web.dto.MemberDTO"%>
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
	MemberDAO mdao = new MemberDAO();
	if( mdao.login(userid, userpw)) {	// 로그인 성공
%>
<script>location.href="main_view.jsp"</script>
<% } else {								// 로그인 실패 %>							
<script>alert("아이디 혹은 비밀번호가 틀립니다.");
location.href="login_view.jsp";
</script>	
<% }%>
</body>
</html>