package com.codingbox.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.codingbox.web.dbconnection.DBConnection;
import com.codingbox.web.dto.MemberDTO;

public class MemberDAO {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	
	// 회원가입 메서드
    public boolean join(MemberDTO mDto) {
        boolean result = false;
        String sql = "INSERT INTO TBL_MEMBER VALUES (?,?,?,?,?)";
        
        try {
            // DB 연결
            conn = DBConnection.getConnection();
            pstm = conn.prepareStatement(sql);
            // 매개변수로 받은 DTO의 정보로 쿼리 작성
            pstm.setString(1, mDto.getUserid());
            pstm.setString(2, mDto.getUserpw());
            pstm.setString(3, mDto.getUsername());
            pstm.setString(4, mDto.getUsergender());
            pstm.setString(5, mDto.getUserphone());
            // 쿼리 실행
            pstm.executeUpdate();
            // 쿼리 실행 결과에 따라 결과값 설정
            if(pstm.executeUpdate() != 0) { // 성공
                result = true;
            } else { // 실패
                result = false;
            }
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL 예외 발생");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("SQL 예외 발생");
		}
		
		return result;
	}
}
