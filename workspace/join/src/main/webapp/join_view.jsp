<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join view</title>
</head>
<body>
	<form action="" method="post" name="joinForm">
		<p id="text">사용할 수 있는 아이디입니다.</p>
		<p>
			<label>아이디 <input type="text" name="userid">
			</label> <input type="button" value="중복확인" onclick="">
		</p>
		<p>
			<label>비밀번호 <input type="password" name="userpw">
			</label>
		</p>
		<p>
			<label>비밀번호 확인 <input type="password" name="userpw_re">
			</label> <input type="button" value="중복확인" onclick="">
		</p>
		<p>
			<label>이름 <input type="text" name="username">
			</label>
		</p>
		<p>
			성별 <br>
			<label> 남자<input type="radio" name="usergender"value="M" checked></label>
			<label> 여자<input type="radio" name="usergender" value="W"></label>
		</p>
		<p>
			<label>핸드폰번호 <input type="text" name="userphone">
			</label>
		</p>
		<p>우편번호</p>
		<p>주소</p>
		<p>상세주소</p>
		<p>
		참고항목
		</p>
		<p>
		<input type="button" value="가입완료" onclick="sendit()">
		</p>
	</form>
</body>
<script src="user.js"></script>


</html>