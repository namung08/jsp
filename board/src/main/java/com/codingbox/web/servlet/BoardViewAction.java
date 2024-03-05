package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.BoardDAO;
import com.codingbox.web.dto.BoardDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		BoardDAO bdao = new BoardDAO();
		BoardDTO bdto = new BoardDTO();
		// request param, boardnum
		int boardnum = Integer.parseInt(req.getParameter("boardnum"));
		// boardreadcount증가 메소드
		bdao.boardreadCountPlus(boardnum);
		// 뷰로 넘어 갈때 또한 조회수를 늘리기 위하면 boardreadCountPlus를 먼저 선언
		System.out.println(boardnum);
		bdto = bdao.getDetail(boardnum);
		
		// dao, getDtail(boardnum); return BoardDTO;
		req.setAttribute("boardtitle", bdto.getBoardtitle());
		req.setAttribute("boardreadcount", bdto.getBoardreadcount());
		req.setAttribute("username", bdto.getUsername());
		req.setAttribute("boardcontents", bdto.getBoardcontents());

		// 조회 성공 시 : /board/boardview.jsp
		forward.setRedirect(false);
		forward.setPath(req.getContextPath() + "/board/boardview.jsp");
		return forward;
	}

}
