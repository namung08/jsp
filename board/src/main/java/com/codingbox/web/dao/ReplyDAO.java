package com.codingbox.web.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.codingbox.web.dto.ReplyDTO;
import com.codingbox.web.mybatis.SqlMapConfig;

public class ReplyDAO {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlSession;

	public ReplyDAO() {
		sqlSession = factory.openSession(true);
	}

	public boolean insertReply(ReplyDTO rdto) {
		boolean result = false;
		if (sqlSession.insert("Reply.insertReply", rdto) == 1) {
			result = true;
		}
		return result;
	}
	public List<ReplyDTO> getReply(int boardnum) {
		List<ReplyDTO> result = null;
		result = sqlSession.selectList("Reply.getReply", boardnum);
		return result;
	}
	
	public boolean updateReply(ReplyDTO rdto) {
		boolean result = false;
		System.out.println(result);
		System.out.println(rdto.getReplynum());
		System.out.println(rdto.getReplycontents());
		if(sqlSession.update("Reply.updateReply",rdto) > 0) {
			System.out.println(result);
			result = true;
		}
		return result;
	}

	public boolean deleteReply(int replynum) {
		boolean result = false;
		System.out.println(replynum);
		
		if(sqlSession.delete("Reply.deleteReply", replynum) == 1) {
			System.out.println("삭제 성공");
			result = true;
		}
		
		return result;
	}
}
