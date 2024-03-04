/*
 * UserFrontController 서블릿은 확장자가 ".us"로 끝나는 URL에 대한 요청을 처리합니다.
 * 각 요청에 따라 적절한 Action 클래스의 execute 메서드를 호출하고,
 * 그 결과에 따라 페이지 이동 방식을 결정하여 이동합니다.
 */
package com.codingbox.web.servlet;

import java.io.IOException;

import com.codingbox.web.action.ActionForward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.bo")
public class BoardFrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        ActionForward forward = null;
        
        switch (requestURI) {
		case "/board/BoardWrite.bo": 
			forward = new ActionForward(true, "/board/boardwrite.jsp");
			break;
		case "/board/BoardList.bo": 
			forward = new BoardListAction().execute(req, resp);
			break;
		}
        
        
        // 페이지 이동에 대한 일괄 처리
        if (forward != null) {
            if (forward.isRedirect()) { // Redirect 방식
                resp.sendRedirect(forward.getPath());
            } else { // Forward 방식
                req.getRequestDispatcher(forward.getPath()).forward(req, resp);
            }
        }
    }
}