package com.codingbox.web.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.codingbox.web.dto.BoardDTO;
import com.codingbox.web.mybatis.SqlMapConfig;

public class BoardDAO {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlSession;

	public BoardDAO() {
		sqlSession = factory.openSession(true);
	}

	public List<BoardDTO> getBoardList(int startRow, int endRow) {
		HashMap<String, Integer> datas = new HashMap<>();
		datas.put("startRow", startRow);
		datas.put("endRow", endRow);
		List<BoardDTO> boardList = sqlSession.selectList("Board.getBoardList",datas);
		return boardList;
	}

	public int getBoardCnt() {
		return sqlSession.selectOne("Board.getBoardCnt");
	}
}