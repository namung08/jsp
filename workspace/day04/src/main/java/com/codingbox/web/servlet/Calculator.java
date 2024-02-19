package com.codingbox.web.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class Calculator extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// method를 비교
		// 대문자로 작성 (GET/POST)
		if(arg0.getMethod().equals("GET")) {
			System.out.println("GET 요청입니다.");
		} else if(arg0.getMethod().equals("POST")) {
			System.out.println("POST 요청입니다.");
		}
	}

}
