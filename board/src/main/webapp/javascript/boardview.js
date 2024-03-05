/**
 * 
 */

function addreply() {
	// 밸리데이션 체크
	const replyForm = document.replyForm;
	const username = replyForm.username;
	const password = replyForm.password;
	const replycontent = replyForm.replycontent;
	// 아이디 빈값 체크
	if(username.value.trim() == "" ) {
		alert("이름을 입력하세요");
		username.focus();
		return false;
	}
	// 비밀번호 빈값 체크
	if(password.value.trim() == "" ) {
		alert("비밀번호를 입력하세요");
		password.focus();
		return false;
	}
	// 댓글 빈값 체크
	if(replycontent.value.trim() == "" ) {
		alert("내용을 입력하세요");
		replycontent.focus();
		return false;
	}
	
	replyForm.submit()
}