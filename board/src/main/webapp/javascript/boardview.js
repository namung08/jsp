/**
 * 
 */

function addreply() {
	// 밸리데이션 체크
	const replyForm = document.replyForm;
	const username = replyForm.username;
	const password = replyForm.password;
	const replycontents = replyForm.replycontents;
	// 아이디 빈값 체크
	if (username.value.trim() == "") {
		alert("이름을 입력하세요");
		username.focus();
		return false;
	}
	// 비밀번호 빈값 체크
	if (password.value.trim() == "") {
		alert("비밀번호를 입력하세요");
		password.focus();
		return false;
	}
	// 댓글 빈값 체크
	if (replycontents.value.trim() == "") {
		alert("내용을 입력하세요");
		replycontents.focus();
		return false;
	}

	replyForm.submit();
}

function updateReadonly(num) {
	console.log('updateReadonly(' + num + ') 호출');
	document.getElementById('reply' + num).readOnly = false;
}
// <a>수정</a> 태그를 클릭시 실행할 메서드

function updateReply(replynum, password) {
	let pw = prompt("댓글 비밀번호를 입력하세요");
	if (pw == password) {
		document.replyForm.action = "/board/BoardReplyUpdate.bo?replynum=" + replynum;
		replyForm.submit();
		console.log(true);
	} else {
		alert("비밀번호를 확인해주세요");
		//return false;
	}
}

function deleteReply(password, replynum) {
	let pw = prompt("댓글 비밀번호를 입력하세요");
	if (pw == password) {
		document.replyForm.action = "/board/DeleteReplyAction.bo?replynum=" + replynum;
		console.log("액션 교체 실행");
		replyForm.submit();
		
	} else {
		alert("비밀번호가 다릅니다.");
	}
}
















