package com.codingbox.web.servelt;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.UserDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserLoginOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		UserDAO udao = new UserDAO();
		ActionForward forward = new ActionForward();
		
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		
		forward.setRedirect(true);	// redirect
		if( udao.login(userid, userpw) ) {
			forward.setPath("/app/main/mainview.jsp");
		} else {
			forward.setPath("/app/user/loginview.jsp?flag=false");
		}
		
		return forward;
	}

}






