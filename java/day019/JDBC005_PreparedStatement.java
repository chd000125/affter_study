package com.company.day019;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC005_PreparedStatement {
	public static void main(String[] args) {
		//1. Oracle 드라이버연동
				//2. DriverManager.getConnection();  
				// import  - ctrl + shift + o
				Connection conn = null;
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott" , pw = "tiger";
				
				String sql1 = "select * from emp  where  ename='"+ "SCOTT" +"'";  //Statement (sql 구문)
				    //PreparedStatement
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
				
				// 3 PreparedStatement
				PreparedStatement pstmt = null;
				ResultSet rset2 = null;
				String sql2 = "select * from emp  where  ename=?";
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url,user,pw);
					
					pstmt = conn.prepareStatement(sql2);
					pstmt.setInt(1, 7788);
					pstmt.setString(2, "SCOTT");
					
					rset2 = pstmt.executeQuery();
					while(rset2.next()) {
						System.out.println(rset2.getInt("empno")+ "\t" + rset2.getString("ename"));
					}
			
				} catch (Exception e) {
					e.printStackTrace();
				}		finally {
					if(rset2 != null) {try { rset2.close(); } catch (SQLException e) { e.printStackTrace(); }}
					if(pstmt != null) {try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
					if(conn != null) {try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
				}
				
				
				
				
				
				
	}
}
// emp 테이블에서 ename = 'SCOTT' 정보 출력
/*
 



*/
