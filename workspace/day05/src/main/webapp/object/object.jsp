<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>페이지 이동</h3>
	<form action="object_ok.jsp" name="joinForm">
		<fieldset>
			<legend>개인정보</legend>
			<input type="text" name="username">
			<input type="text" name="userbirth">
			<input type="submit" value="확인" onclick="sendit()">
		</fieldset>
	</form>
</body>
</html>
<script>
	function sendit() {
		// validation check
		// 이름항목에 값이 있는지
		
		// 생일항목에 값이 있는지
		// object_ok.jsp로 submit
	}
</script>