/**
 * 
 */
 function sendit() {
	 // 빈값체크 -> alert
	 // 길이체크 -> 아이디 5이상16미만, 비밀번호 8자리 이상
	 // 비밀번호 확인 일치 체크
	 // submit();
	 let joinForm = document.joinForm;
	 
	 
	 let userid = joinForm.userid;
	 let userpw = joinForm.userpw;
	 let userpwre = joinForm.userpw_re;
	 let username = joinForm.username;
	 let usergender = joinForm.usergender;
	 let userphone = joinForm.userphone;
	 if(userid.value == "") {
		 alert("아이디를 입력하세요");
		 userid.focus();
		 return false;
	 }
	 if(userid.value.length <5 || userid.value.length >=16) {
		 alert("아이디를 5자리 이상 16자리 미만으로 입력해주세요");
		 userid.focus();
		 return false;
	 }
	 if(userpw.value == "") {
		 alert("비밀번호를 입력하세요");
		 userpw.focus();
		 return false;
	 }
	 if(userpw.value.length <8) {
		 alert("비밀번호를 8자리 이상 입력해주세요");
		 userpw.focus();
		 return false;
	 }
	 if(userpwre.value == "") {
		 alert("비밀번호 확인을 입력하세요");
		 userpwre.focus();
		 return false;
	 }
	 if(userpw.value != userpwre.value) {
		 alert("비밀번호가 일치하지 않습니다.");
		 userpwre.focus();
		 return false;
	 }
	 if(username.value == "") {
		 alert("이름을 입력하세요");
		 username.focus();
		 return false;
	 }
	 if(usergender.checked) {
		 alert("성별을 선택하세요");
		 usergender.focus();
		 return false;
	 }
	 if(userphone.value == "") {
		 alert("전화번호를 입력하세요");
		 userphone.focus();
		 return false;
	 }
	 foinFrom.submit();
 
 }