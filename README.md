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
```java
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
```