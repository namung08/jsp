package com.codeingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/cnt")
public class MyServlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		arg1.setCharacterEncoding("UTF-8");
	    arg1.setContentType("text/html; charset=utf-8");
		// TODO Auto-generated method stub
	    // request에 담겨져 있는 내용을 가져오기
	    // 아래 코드는 cnt 파라미터 키값의 value 값을 가져온다.
	    // 하지만 arg0.getParameter("cnt")의 값이 string 타입이므로 int 타입으로 치환
//	    int cnt = Integer.parseInt(arg0.getParameter("cnt"));
//	    ->
	    int cnt = 0;
	    // 벨리데이션 처리
	    String paraCnt = arg0.getParameter("cnt");
	    PrintWriter out = arg1.getWriter();
	    if(paraCnt != null && paraCnt.equals("")) {
	    	cnt = Integer.parseInt(paraCnt);
	    }
	    // 안녕 servlet 출력
//	    out.print("안녕 servlet"+arg0);
	    for(int i=0;i<cnt;i++) {
	    	out.print((i+1)+" : 안녕 servlet<br>");
	    }
		
	}
}
