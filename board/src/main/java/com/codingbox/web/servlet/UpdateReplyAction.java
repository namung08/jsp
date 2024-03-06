package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.ReplyDAO;
import com.codingbox.web.dto.ReplyDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		ReplyDAO rdao = new ReplyDAO();
		ReplyDTO rdto = new ReplyDTO();
		rdto.setReplynum(Integer.parseInt(req.getParameter("replynum")));
		System.out.println(rdto.getReplynum());
		rdto.setReplycontents(req.getParameter("reply"+rdto.getReplynum()));
		System.out.println(rdto.getReplycontents());
		int boardnum = Integer.parseInt(req.getParameter("boardnum"));
		if (rdao.updateReply(rdto)) {
			System.out.println("성공?");
			forward.setPath(req.getContextPath() + "/board/BoardView.bo?boardnum="+boardnum);
			forward.setRedirect(false);
		}
		return forward;
	}

}
