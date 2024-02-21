##  oracle 연결
```jap
Connection conn = null; // Connection 객체를 초기화
// 데이터베이스 연결을 위한 드라이버, URL, 사용자 이름, 암호 설정
String driver = "oracle.jdbc.driver.OracleDriver"; // Oracle JDBC 드라이버 클래스
String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 데이터베이스 연결 URL
String user = "jsp"; // 데이터베이스 사용자 이름
String pass = "jsp"; // 데이터베이스 암호
PreparedStatement pstm = conn.prepareStatement(sql); // SQL 문을 실행하기 위한 준비된 문 생성
ResultSet rs = pstm.executeQuery(); // 쿼리를 실행하고 결과를 ResultSet에 저장
```