##  oracle 연결
```jap
Connection conn = null;
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "jsp";
String pass = "jsp";
Class.forName(driver);
conn = DriverManager.getConnection(url, user, pass);
```