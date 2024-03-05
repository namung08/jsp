package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.ReplyDAO;
import com.codingbox.web.dto.ReplyDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddReplyAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		ReplyDAO rdao = new ReplyDAO();
		ReplyDTO rdto = new ReplyDTO();
		
		rdto.setUsername(req.getParameter("username"));
		System.out.println(req.getParameter("username"));
		rdto.setPassword(req.getParameter("password"));
		System.out.println(req.getParameter("password"));
		rdto.setReplycontents(req.getParameter("replycontent"));
		System.out.println(req.getParameter("replycontent"));
		System.out.println(req.getParameter("boardnum"));
		rdto.setBoardnum(Integer.parseInt(req.getParameter("boardnum")));
		if(rdao.insertReply(rdto)) {
			forward.setPath(req.getContextPath() + "/board/BoardView.bo");
			forward.setRedirect(false);
		}
		return forward;
	}

}
