/**
 * 사용자 등록 양식의 유효성 검사 함수입니다.
 * 빈 필드, 길이 제약, 비밀번호 일치 여부를 확인합니다.
 * 유효하지 않은 입력에 대한 적절한 경고를 표시합니다.
 * 모든 유효성 검사를 통과하면 양식을 제출합니다.
 */
function sendit() {
    // 빈 필드 확인 -> 경고 표시
    // 길이 확인 -> 아이디: 최소 5자 이상 16자 미만, 비밀번호: 최소 8자 이상
    // 비밀번호 일치 확인
    // 제출();

    // 양식 요소 가져오기
    let joinForm = document.joinForm;
    let userid = joinForm.userid;
    let userpw = joinForm.userpw;
    let userpwre = joinForm.userpw_re;
    let username = joinForm.username;
    let usergender = joinForm.usergender;
    let userphone = joinForm.userphone;

    // 사용자 아이디 유효성 검사
    if (userid.value == "") {
        alert("아이디를 입력해주세요.");
        userid.focus();
        return false;
    }
    if (userid.value.length < 5 || userid.value.length >= 16) {
        alert("아이디를 5자 이상 16자 미만으로 입력해주세요.");
        userid.focus();
        return false;
    }

    // 비밀번호 유효성 검사
    if (userpw.value == "") {
        alert("비밀번호를 입력해주세요.");
        userpw.focus();
        return false;
    }
    if (userpw.value.length < 8) {
        alert("비밀번호를 최소 8자 이상 입력해주세요.");
        userpw.focus();
        return false;
    }

    // 비밀번호 확인 유효성 검사
    if (userpwre.value == "") {
        alert("비밀번호를 다시 한 번 입력해주세요.");
        userpwre.focus();
        return false;
    }
    if (userpw.value != userpwre.value) {
        alert("비밀번호가 일치하지 않습니다.");
        userpwre.focus();
        return false;
    }

    // 이름 유효성 검사
    if (username.value == "") {
        alert("이름을 입력해주세요.");
        username.focus();
        return false;
    }

    // 성별 유효성 검사
    if (!usergender.checked) {
        alert("성별을 선택해주세요.");
        usergender[0].focus(); // 가정: 첫 번째 라디오 버튼이 남성에 해당
        return false;
    }

    // 전화번호 유효성 검사
    if (userphone.value == "") {
        alert("전화번호를 입력해주세요.");
        userphone.focus();
        return false;
    }

    // 모든 유효성 검사를 통과하면 양식 제출
    joinForm.submit();
}
