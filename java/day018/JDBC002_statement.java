package com.company.day018;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC002_statement {
	public static void main(String[] args) {
		//1. 드라이버 연동 Class.forName()
		//2. DriverManager.getConnection(url, id, pass)
		Connection conn = null; Statement stmt = null; ResultSet rset = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "SCOTT";
		String pass = "TIGER";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ->
			conn = DriverManager.getConnection(url, user, pass); // <- 
			if(conn != null) {System.out.println("연동성공");}
			
			stmt = conn.createStatement(); // 3. db연동시 conn Statement 구문사용
			rset = stmt.executeQuery("select * from emp"); // 4. 표(#)-줄-칸
			while (rset.next()) {
				int empno = rset.getInt("empno"); // 칸
				String ename = rset.getString("ename");
				String job = rset.getString("job");
				System.out.println(empno + "\t" + ename + "\t" + job);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally { if(conn !=null) {try { conn.close();} catch (SQLException e) { e.printStackTrace(); }}
					if ( stmt != null) {try { stmt.close(); } catch (SQLException e) {  e.printStackTrace(); }}
					if (rset != null) {try { rset.close(); } catch (SQLException e) {  e.printStackTrace(); }}
		}
	}
}
/*
Q1.  dept 테이블 구조확인 (SQL)
	desc dept;
Q2.  dept 전체데이터 확인 (SQL)
	select * from dept;
Q3.  dept 테이블에서 deptno, dname만검색 (SQL)
 	select deptno, dname from dept;
Q4.  JDBC003_EX.java dept전체데이터 불러오기(eclipse)
		Statement stmt = null;
		ResultSet rset = null;
		stmt = conn.createStatement();
		rset = stmt.executeQuery("select * from dept");
Q5.  JDBC004_EX.java dept 테이블에서 deptno, dname만검색 불러오기 (eclipse) 
		int deptno = rset.getInt("deptno");
		String dname = rset.getString("dname");
*/