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
