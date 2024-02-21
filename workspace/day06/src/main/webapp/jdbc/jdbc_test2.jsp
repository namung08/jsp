<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Connection conn = null;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "jsp";
	String pass = "jsp";
	Class.forName(driver);
	conn = DriverManager.getConnection(url, user, pass);
	
	String sql = "SELECT sysdate FROM dual";
	// dbeaver 에서의 쿼리문 날리는 명령어
	PreparedStatement pstm = conn.prepareStatement(sql);
	
	// 쿼리를 실행하고 결과를 ResultSet에 저장
	ResultSet rs = pstm.executeQuery();
	
	if(rs.next()) { // ResultSet에 다음 행이 있으면
		out.print(rs.getDate(1)); // 첫 번째 열의 날짜 값을 출력
		// 결과 실행 당일 날짜만 나오면 됨
	}
	// 객체 반납 re, pstm, conn을 닫아줘야함 객체 생성 순서의 역방향으로 닫아줘야함
	rs.close();
	pstm.close();
	conn.close();
%>
</body>
</html>