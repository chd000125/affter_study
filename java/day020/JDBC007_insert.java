package com.company.day020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC007_insert {
	public static void main(String[] args) {
		//1. Driver 로드
		//2. connection 객체
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "SCOTT", pw = "TIGER";
		Connection conn = null;
		PreparedStatement pstmt = null; ResultSet rset = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("driver 연동성공");
			//3. pstmt 사용 ( 표 executeQuery : select / 몇 줄 실행 여부 executeUpdate : insert, update, delete )
			pstmt = conn.prepareStatement("insert into fruit (fno, fname, fdate) values (seq_fruit.nextval, ?, sysdate)");
			pstmt.setString(1, "banana");
			int result = pstmt.executeUpdate();
			if (result > 0) { System.out.println("insert 완료!"); }
		} catch (Exception e) {
			e.printStackTrace();
		}finally { if (rset != null) {try { rset.close(); } catch (SQLException e) {  e.printStackTrace(); }}
   		           if (pstmt != null){try { pstmt.close();} catch (SQLException e) {  e.printStackTrace(); }}
   		           if (conn != null) {try { conn.close(); } catch (SQLException e) {  e.printStackTrace(); }}
		}
	}
}
/*
	1. scott / tiger 계정확인
	2. dml : insert(create) fruit 테이블에 sequence 이용해서 데이터 삽입
	insert into fruit (fno, fname, fdate) vlaues (seq_fruit.nextval, 'apple', sysdate);
	3. dml : select(read) fruit 테이블에 전체 데이서 출력 / fno가 5번인 데이터 출력
	select * from fruit where fno = 5;
	4. dml : update(update) fno가 5번인 데이터 fname을 melon 으로 수정
	update fruit set fname = 'melon' where fno =5;
	5. dml : delete(delete) fno가 5번인 데이터 삭제
	delete from fruit where fno = 5;
*/