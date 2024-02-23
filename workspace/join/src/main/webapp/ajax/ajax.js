/**
 * 
 */
function send1() {
	let xhr = new XMLHttpRequest();
	// get 방식으로 통식, 2번 쨰 파라미터로 깜빡임 없이 갔다온다.
	// open(전달방식, url주소, 동기여부(비동기(기본값):true,동기:false))
	xhr.open("get","request_ajax.jsp?userid=admin&userpw=1234");
	xhr.send();
	xhr.onreadystatechange = function() {
		// 통신 성공
		/// if안의 값은 ajax가 성공할 때의 조건임
		if(xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
			document.getElementById("result").innerHTML = xhr.responseText;
			//alert(xhr.responseText);
		}
	}
}
function send2() {
	let xhr = new XMLHttpRequest();
	xhr.open("post","request_ajax.jsp",true);
	xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	xhr.send("userid=postadmin&userpw=post1234");
	xhr.onreadystatechange = function() {
		// 통신 성공
		/// if안의 값은 ajax가 성공할 때의 조건임
		if(xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
			document.getElementById("result").innerHTML = xhr.responseText;
			//alert(xhr.responseText);
		}
	}
}