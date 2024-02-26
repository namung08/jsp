/**
 * 
 */

// 페이지가 로드 됬을 때
window.onload = function() {
	/* 
	data2.json의 데이터를 읽어 와서
	실시간 검색어엔 1 키워드로 독감
	2초뒤에 ,검색어 2 ...
	검색어 5...
	다시 1번으로 롤백
	 */
	let xhr = new XMLHttpRequest();
	// open(전달방식, URL주소, 동기여부(비동기:true,기본값, 동기:false));
	xhr.open("GET", "data2.json", true);
	xhr.send();
	xhr.onreadystatechange = function() {
		// 성공일때
		if (xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
			//alert(xhr.responseText);
			let obj = JSON.parse(xhr.responseText);

			//alert(obj.search_word[0].rank);
			let i = 0;
			let a = 0;
			document.getElementById("th1").innerHTML = obj.search_word[i].rank;
			document.getElementById("th2").innerHTML = obj.search_word[i].name;
			const inteval = setInterval(
				function() {
					document.getElementById("th1").innerHTML = obj.search_word[i].rank;
					document.getElementById("th2").innerHTML = obj.search_word[i].name;
					i++;
					a++;
					if (obj.search_word.length == i) {
						i = 0;
					}
					/*if(a >50) {
						alert(a);
						clearInterval(inteval);
					}*/
				}, 100);
			setTimeout(function() {
				// clearInterval(인터벌); 해당 인터벌을 삭제
				clearInterval(inteval);
			},2000)
		}

	}
}

