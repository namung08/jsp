package com.codeingbox.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/hi")
public class HiServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html; charset=utf-8");
		// 벨리데이션 처리	    
	    PrintWriter out = arg1.getWriter();
	    int cnt = 100;
	    String paramCnt = arg0.getParameter("cnt");
	    if(paramCnt != null && !paramCnt.equals("")) {
	       cnt = Integer.parseInt(paramCnt);
	    }

	    // 안녕 servlet 출력
//	    out.print("안녕 servlet"+arg0);
	    for(int i=0;i<cnt;i++) {
	    	out.print((i+1)+"번째 : 안녕 servlet<br>");
	    }
	}
}
