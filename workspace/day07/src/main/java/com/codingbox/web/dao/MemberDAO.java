package com.codingbox.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import com.codingbox.web.dbconnection.DBConnection;
import com.codingbox.web.dto.MemberDTO;

public class MemberDAO {
   Connection conn;
   PreparedStatement pstm;
   ResultSet rs;
   
   // age찾기
   public int getAge(String name) {
      int age = 0;
      //db처리
      try {
         conn = DBConnection.getConnection();
         String sql = "SELECT * FROM MEMBER WHERE name=?";
         pstm = conn.prepareStatement(sql);
         pstm.setString(1, name);
         rs = pstm.executeQuery();
         
         if(rs.next()) {
            age = rs.getInt("age");
         }
      }catch (SQLException e) {
         e.printStackTrace();
         System.out.println("SQL 예외 발생");
      }catch (Exception e) {
         e.printStackTrace();
         System.out.println("예외 발생");
      }
      return age;
   }

   // 전체 검색
   public ArrayList<MemberDTO> selectAll(){
      String sql = "SELECT * FROM MEMBER";
      ArrayList<MemberDTO> result = new ArrayList<MemberDTO>();
      try {
         conn = DBConnection.getConnection();
         pstm = conn.prepareStatement(sql);
         rs = pstm.executeQuery();
         while(rs.next()) {
        	 
         }
      }catch (SQLException e) {
         e.printStackTrace();
         System.out.println("SQL 예외 발생");
      }catch (Exception e) {
         e.printStackTrace();
         System.out.println("예외 발생");
      }
      
      return null;
   }



}
