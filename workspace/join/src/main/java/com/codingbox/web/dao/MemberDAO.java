package com.codingbox.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.codingbox.web.dto.MemberDTO;

public class MemberDAO {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	
	//회원가입
	public boolean join(MemberDTO mDto) {
		boolean result = false;
		String sql = "INSERT INTO TBL_MEMBER VALUES (?,?,?,?,?)";
		
		
		return result;
	}
}
