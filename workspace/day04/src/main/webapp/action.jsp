<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
	String username = request.getParameter("user_name");
	String result = null;
	username = username.trim();
	if(username != null || !username.equals("")) {
		result = username;
	}
	if(username == null){
		result = "이름이 없습니다.";
	}
	if(username.equals("")) {
		result = "이름을 입력하세요";
	}
	
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>"<%=result %>"</h2>
</body>
</html>