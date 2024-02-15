# jsp

// web.xml에 복잡한 고드륵 안 적기 위한 서블랫
@WebServlet("/cnt")

// 한글을 출력하기 위한 코드
    arg1.setCharacterEncoding("UTF-8");
    arg1.setContentType("text/html; charset=utf-8");

// out 생성
PrintWriter out = arg1.getWriter();
