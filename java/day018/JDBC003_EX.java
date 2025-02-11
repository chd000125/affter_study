package com.company.day018;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC003_EX {
	public static void main(String[] args) {
		//1. 드라이버 연동
		//2. 연결 객체
		//3. sql 사용
		//4. 표
		//5. 줄
		//6. 칸
		
		String ODriver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "SCOTT",pass = "TIGER";
		
		Connection conn = null; Statement stmt = null; ResultSet rset = null;
		
		try {
			Class.forName(ODriver);
			conn = DriverManager.getConnection(url,user,pass);
			if(conn != null) {System.out.println("db연동성공");}
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from dept");
			while(rset.next()) {//5줄
				//6칸
				System.out.println(rset.getInt("deptno") + "\t" + rset.getString("dname") + "\t" + rset.getString("loc"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (rset != null) {try { rset.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if (conn != null) {try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if (stmt != null) {try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		
	}
}
