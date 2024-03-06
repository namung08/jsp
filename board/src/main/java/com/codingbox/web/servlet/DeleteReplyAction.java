package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.ReplyDAO;
import com.codingbox.web.dto.ReplyDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteReplyAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		ReplyDAO rdao = new ReplyDAO();
		int replynum = Integer.parseInt(req.getParameter("replynum"));
		int boardnum = Integer.parseInt(req.getParameter("boardnum"));
		System.out.println("replynum : " + replynum);
		System.out.println("boardnum : " + boardnum);
		if(rdao.deleteReply(replynum)) {
			System.out.println("페이지 이동!");
			forward.setPath(req.getContextPath() + "/board/BoardView.bo?boardnum=" + boardnum);
			forward.setRedirect(false);
		}
		return forward;
	}

}
