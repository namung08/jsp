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
	    PrintWriter out = arg1.getWriter();
	    out.print("안녕 servlet");
		
	}
}
