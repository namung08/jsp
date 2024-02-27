<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join View</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

#container {
	width: 400px;
	margin: 50px auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
	text-align: center;
}

label {
	display: block;
	margin-bottom: 10px;
}

input[type="text"], input[type="password"], input[type="button"], input[type="radio"]
	{
	width: 100%;
	padding: 10px;
	margin-bottom: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-sizing: border-box;
}

input[type="button"] {
	background-color: #007bff;
	color: #fff;
	border: none;
	cursor: pointer;
}

input[type="button"]:hover {
	background-color: #0056b3;
}

#text {
	color: green;
}
</style>
</head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<body>
	<div id="container">
		<h1>Join Form</h1>
		<form action="join_db.jsp" method="post" name="joinForm">
			<p id="text" style="visibility: hidden">사용할 수 있는 아이디입니다.</p>
			<p>
				<label>아이디 <input type="text" name="userid"></label> <input
					type="button" value="중복확인"
					onclick="checkId3(joinForm.userid.value)">
			</p>
			<p>
				<label>비밀번호 <input type="password" name="userpw"></label>
			</p>
			<p>
				<label>비밀번호 확인 <input type="password" name="userpw_re"></label>
				<input type="button" value="중복확인" onclick="">
			</p>
			<p>
				<label>이름 <input type="text" name="username"></label>
			</p>
			<p>
				성별 <br>
				<label> 남자<input type="radio" name="usergender"value="M" checked></label>
				<label> 여자<input type="radio" name="usergender" value="W"></label>
			</p>
			<p>
				<label>핸드폰번호 <input type="text" name="userphone"></label>
			</p>
			<input type="text" name="zipcode" id="zipcode" placeholder="우편번호">
			<input type="button" onclick="DaumPostcode()"value="우편번호 찾기"><br>
			<input type="text" name="addr" id="addr" placeholder="주소"><br>
			<input type="text" name="addrdetail" id="addrdetail" placeholder="상세주소">
			<input type="text" name="addrdetc" id="addrdetc" placeholder="참고항목">
			<p>
				<input type="button" value="가입완료" onclick="sendit()">
			</p>
		</form>
	</div>
</body>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="user.js"></script>

</html>
