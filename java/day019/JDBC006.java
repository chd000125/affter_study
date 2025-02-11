package com.company.day019;

public class JDBC006 {
	public static void main(String[] args) {
		//1. Oracle 드라이버연동
				//2. DriverManager.getConnection();  
				// import  - ctrl + shift + o
				Connection conn = null;
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott" , pw = "tiger";
				
				String sql1 = "select * from emp  where  ename='"+ "SCOTT" +"'";  //Statement (sql 구문)
				String sql2 = "select * from emp  where  ename=?";     //PreparedStatement
				//3 Statement
				Statement stmt = null;  ResultSet rset = null;  // 결과표 (표)
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, user, pw);
					System.out.println("1. db 연동성공! ");
					
					stmt = conn.createStatement(); // sql구문
					rset = stmt.executeQuery(sql1);//4표- 5줄 - 6칸  
					while(rset.next()){ System.out.println(rset.getInt("empno") + "\t" + rset.getString("ename")); }
				
				} catch (Exception e) { e.printStackTrace();
				} finally {
					if(rset!=null) { try { rset.close(); } catch (SQLException e) { e.printStackTrace(); } }
					if(stmt!=null) { try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
					if(conn!=null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
				}
	}
}
