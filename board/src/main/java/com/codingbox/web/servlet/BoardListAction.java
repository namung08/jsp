package com.codingbox.web.servlet;

import com.codingbox.web.action.Action;
import com.codingbox.web.action.ActionForward;
import com.codingbox.web.dao.BoardDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		ActionForward forward = new ActionForward();
		// dao 객체 생성, getBoardList(), dbselect
		BoardDAO bdao = new BoardDAO();
		int totalCnt = bdao.getBoardCnt();
		
		// 현재 페이지 번호를 요청 파라미터에서 가져옵니다.
		String temp = req.getParameter("page");
		int page = 0;
		// 요청 파라미터에서 페이지 번호가 없으면 1로 설정, 있으면 해당 번호로 설정합니다.
		page = temp == null ? 1 : Integer.parseInt(temp);

		// 아래 주석 처리된 코드는 위의 삼항 연산자 코드와 동일한 로직을 수행하는 더 긴 형태입니다.
		// if(temp == null) {
//		     page = 1;
		// } else {
//		     page = Integer.parseInt(temp);
		// }

		// 한 페이지에 보여줄 항목의 수를 설정합니다.
		int pageSize = 10;
		// 현재 페이지의 마지막 행 번호를 계산합니다. 예: 1 페이지면 10, 4 페이지면 40
		int endRow = page * 10; 
		// 현재 페이지의 시작 행 번호를 계산합니다. 예: 1 페이지면 1, 4 페이지면 31
		int startRow = endRow - 9;

		// 페이징 처리를 위한 시작 페이지와 끝 페이지 번호를 계산합니다.
		int startPage = (page-1)/pageSize * pageSize+1;
		int endPage = startPage + pageSize - 1;
		// 전체 페이지 수를 계산합니다. 전체 항목 수를 페이지 크기로 나누어 올림 처리합니다.
		int totalPage = (totalCnt-1)/pageSize +1;

		// 계산된 끝 페이지 번호가 실제 전체 페이지 수보다 클 경우, 끝 페이지 번호를 전체 페이지 수로 조정합니다.
		endPage = endPage > totalPage ? totalPage : endPage;

		
		// 요기까지가 총 10 페이지를 만들기 위한 
		
		// boardList라는 key 값에 bdao.getBoardList()에 나온 값을 담는다.
		req.setAttribute("boardList", bdao.getBoardList(startRow,endRow));
		
		// 게시판 전체 글의 갯수를 cnt
		req.setAttribute("totalCnt", totalCnt);
		
		// 페이징 처리 변수를 넘겨주기
		req.setAttribute("totalPage", totalPage);
		req.setAttribute("nowPage", page);
		req.setAttribute("startPage", startPage);
		req.setAttribute("endPage", endPage);
		
		
		
		// forward 방식으로 페이지 이동 -> boardlist.jsp
		forward.setRedirect(false);
		forward.setPath(req.getContextPath()+"/board/boardlist.jsp");
		return forward;
	}

}
