<%@page import="java.util.ArrayList"%>
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
<jsp:useBean id="mdao" class="com.codingbox.web.dao.MemberDAO"></jsp:useBean>
<body>
<%
	String userid = request.getParameter("userid");
	String userpw = request.getParameter("userpw");
	String username = mdao.getname(userid);
	if( mdao.login(userid, userpw)) {	// 로그인 성공
		// 로그인을 성공한 사람에 한해 session 에다가 id를 저장
		// key session_id, value : id 저장
		session.setAttribute("session_id", userid);
		session.setAttribute("session_name", username);
%>
<script>location.href="main_view.jsp"</script>
<% } else {								// 로그인 실패 %>							
<script>
alert("아이디 혹은 비밀번호가 틀립니다.");
location.href="login_view.jsp";
</script>	
<% }%>
</body>
</html>