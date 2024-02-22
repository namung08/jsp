# jsp

## web.xml에 복잡한 고드륵 안 적기 위한 서블랫
```java
@WebServlet("/cnt")
```

## 한글을 출력하기 위한 코드
```java
arg1.setCharacterEncoding("UTF-8");
arg1.setContentType("text/html; charset=utf-8");
```

## out 생성
```java
PrintWriter out = arg1.getWriter();
```

## 파라미터에 담겨져 있는 value 값을 가져오기
```java
arg0.getParameter("파라미터");
```
 - 이렇게 가져온 값은 String타입이다.

## 가져온 값 integer로 만들기
```java
int cnd = Integer.parseInt(arg0.getParameter("파라미터"));
```
### collection of errors
1. 
1-1. 문제
 정상입력 localhost:8080/주소?key=value
 - 파라미터를 가져와야 할 때
 ```java
 int cnd = Integer.parseInt(arg0.getParameter("파라미터"));
 ```
 - 주소에서 key 값 입력 X -> localhost:8080/주소
  -> 5XX Error : Cannot parse null string(Integer.parseInt이 부분이서 오류 발생) -> null은 Integer로 바꿀 수 없음.
 - 주소에서 key 값 입력 O, value 값 입력 X
  -> 5XX Error : For input string: "" -> key 값이 없음
1-2. 해결
    ```java
    // 벨리데이션 처리
	    int cnt = 100;
        String paramCnt = arg0.getParameter("cnt");
        if(paramCnt != null && !paramCnt.equals("")) {
            cnt = Integer.parseInt(paramCnt);
      }

    ```

## jsp 한글 인코딩 코드
```jsp
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
```
## jsp에서 파라미터 값 가져오는 법
```java
String key = request.getParameter("파라미터");
```
  - 파라미터에서 가져오는 값은 무조건 String 값이다.
  - 파라미터에서 가져온 값이 null인지 equals을 사용하여 "" 값인지 확인을 한다
```java
if(key != null && !key.equals("")) {
		key2 = Integer.parseInt(key);
	}
```

## java에서 method에 따른 명령어 실행
```java
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                        throws ServletException, IOException {
		// 실행 코드...
}
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
                        throws ServletException, IOException {
		// 실행 코드...
}
```

## 위 코드에서 코드를 짧게 만들기
```java
protected void doProcess(HttpServletRequest request, HttpServletResponse response)
                          throws IOException {
		// 실행 코드
}
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                        throws ServletException, IOException {
		doProcess(req, resp);
}
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
                        throws ServletException, IOException {
		doProcess(req, resp);
}
```
## 코드를 만들고 서버를 실행 시 html만 다운로드가 되는 경우가 발생함
 - 해결방법
 > 해당 서버와 워크스페이스를 모두 날리고 다시 만들기 web.xml은 복붙을 하는 것이 아닌 무조건 워크스페이스를 만들 때 같이 만들어지도록 하기
 
## 프로퍼티 자동 세팅
```jsp
<jsp:setProperty property="*" name="member"/>
<!-- 앞에서 전달된 name 속성과 필드의 이름이 같으면 value가 자동으로 세팅 -->
```