package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.BoardDAO;
import com.codingbox.web.dto.BoardDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardWriteOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		// dao 객체 생성
		BoardDAO bdao = new BoardDAO();
		// dto 객체 생성
		BoardDTO bdto = new BoardDTO();
		// request 파라미터 값 get DTO 담기
		bdto.setBoardtitle(req.getParameter("boardtitle"));
		bdto.setUsername(req.getParameter("username"));
		bdto.setBoardcontents(req.getParameter("boardcontents"));
		// dao insertBoard(dto)
		if(bdao.insertBoard(bdto)) {
			// 성공시 -> /board/BoardWrite.bo
			forward.setPath(req.getContextPath() + "/board/BoardWrite.bo");
		} else {
			System.out.println("추가 실패");
		}
		// true시 파라미터값을 저장 안함
		// false시 파라미터 값을 저장
		forward.setRedirect(true);
		return forward;
	}
}
