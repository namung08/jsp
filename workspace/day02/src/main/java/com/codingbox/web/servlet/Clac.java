package com.codingbox.web.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Clac extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, 
			HttpServletResponse arg1) throws ServletException, IOException {
		String xStr = arg0.getParameter("x");
		String yStr = arg0.getParameter("y");
		String op = arg0.getParameter("operator");
		
		int x = 0;
		int y = 0;
		int result = 0;
		
		if( !xStr.equals("") ) {
			x = Integer.parseInt(xStr);
		}
		if( !yStr.equals("") ) {
			 y = Integer.parseInt(yStr);
		}
		
		if( op.equals("덧셈") ) {
			result = x + y;
		} else {
			result = x - y;
		}
				
		arg1.getWriter().printf("resutl is %d\n", result);
	}
}











