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
			<input type="date" name="userbirth">
			<input type="button" value="확인" onclick="sendit();">
		</fieldset>
	</form>
	<script>
		function sendit() {
			// validation check
			let joinForm = document.getElementById("joinForm");
			let nameTag = joinForm.username;
			let birthTag = joinForm.userbirth;
			
			// 이름항목 값 확인
			if(nameTag.value == ""){
				alert("이름을 입력하세요");
				nameTag.focus();
				return false;
			}

			// 생일항목 값 확인
			if(birthTag.value == ""){
				alert("생일을 입력하세요");
				birthTag.focus();
				return false;
			}
			
			// object_ok.jsp로 submit
			joinForm.submit();
		}
		
		// validation check
		
		// 이름항목, 생일항목 값 확인
		// var username = document.joinForm.username.value;
		// var userbirth = document.joinForm.userbirth.value;
		
		// if(username === "" || userbirth === ""){
		// 	alert("이름과 생일을 입력하세요");
	// 	}
		
		// object_ok.jsp로 submit
	// 	document.joinForm.submit();
	
	</script>
</body>
</html>