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
// session 에서 session_id 라는 key 값으로 값을 꺼내 
// alert id님 안녕
String id = (String)session.getAttribute("session_id");
String name = (String)session.getAttribute("session_name");
if(id != null) {
%>
<script>
alert("<%= name%>님 안녕하세요.");
</script>
	<p>
		<%= name %>님<br>
		<input type="button" value="로그아웃" onclick="location.href='logout_db.jsp'">
	</p>
<%} else { %>
	<script>
		alert("로그인 후 이용해 주세요");
		location.href = "login_view.jsp";
	</script>
<%} %>
</body>
</html>