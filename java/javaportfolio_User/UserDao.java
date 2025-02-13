
package com.company.javaportfolio_User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// 1. 클래스는 부품객체
// 2. 상태(멤버변수)/행위(멤버함수)
public class UserDao {
	//상태(멤버변수)
	public static Connection  conn;

	//행위(멤버함수)
	//1. db연동
	public Connection  getConnection() {
		//Class.forName
		//DriverManager.getConnection()
		String url="jdbc:oracle:thin:@localhost:1521:xe" , 
			   user="scott", pw="tiger";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) { e.printStackTrace(); }
		
		return conn;
	}
	
	//2. insert  
	public int       insert(UserInfo user){ 
		PreparedStatement pstmt = null; 
		String sql = "insert into userinfo  (no, name, email) values (seq_userinfo.nextval ,?, ?)";
		int result=-1;
		try {
			pstmt = conn.prepareStatement(sql);//3. sql 구문준비
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			//4. 실행
			result = pstmt.executeUpdate();  // insert, update, delete는 실행했는지 줄[수]
		} catch (SQLException e) { e.printStackTrace();
		} finally {
			if(pstmt != null) {  try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn  != null) {  try {  conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}  
		return result;    
	}    //5, 6
	
	//3. readAll
	public ArrayList<UserInfo> readAll(){ 
		PreparedStatement pstmt = null;  ResultSet rset = null;
		String sql = "select * from userinfo";
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		
		try {
			pstmt = conn.prepareStatement(sql); //#3 pstmt- sql 구문 
			rset  = pstmt.executeQuery(); //4표
			while(rset.next()) { //5줄
				list.add(
					new UserInfo( rset.getInt("no") , rset.getString("name") , rset.getString("email") ,rset.getString("udate")) 
						);        //6 칸
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		}finally {
			if(rset !=null) { try { rset.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(pstmt!=null) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn !=null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
		
		return list; 
	}  
	
	
	//4. read
	public UserInfo  read( int no ){ 
		PreparedStatement pstmt = null;  ResultSet rset = null;
		String sql = "select * from userinfo where no=?";    //###
		UserInfo result=null; //###
		try {
			pstmt = conn.prepareStatement(sql); //#3 pstmt- sql 구문 
			pstmt.setInt(1, no) ;  //##
			rset  = pstmt.executeQuery(); //4표
			while(rset.next()) { //5줄
				result = new UserInfo( rset.getInt("no") , rset.getString("name") , rset.getString("email") ,rset.getString("udate")); //##
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		}finally {
			if(rset !=null) { try { rset.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(pstmt!=null) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn !=null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
		
		return result; //##
	
	}  
	
	
	//5. update
	
	
	
	public int       update( UserInfo user ){  
		PreparedStatement pstmt = null; 
		String sql = "update  userinfo  set email=?  where  no=?";  //####
		int result=-1;
		try {
			pstmt = conn.prepareStatement(sql);//3. sql 구문준비
			pstmt.setString(1, user.getEmail());  //####
			pstmt.setInt(   2, user.getNo());     //####
			//4. 실행
			result = pstmt.executeUpdate();  // insert, update, delete는 실행했는지 줄[수]
		} catch (SQLException e) { e.printStackTrace();
		} finally {
			if(pstmt != null) {  try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn  != null) {  try {  conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}  
		return result;   
	}
	//6. delete	
	public int       delete( int no ){  
		PreparedStatement pstmt = null; 
		String sql = "delete from userinfo  where  no=?";   //##
		int result=-1;
		try {
			pstmt = conn.prepareStatement(sql);//3. sql 구문준비
			pstmt.setInt(1, no) ;  //##
			//4. 실행
			result = pstmt.executeUpdate();  // insert, update, delete는 실행했는지 줄[수]
		} catch (SQLException e) { e.printStackTrace();
		} finally {
			if(pstmt != null) {  try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn  != null) {  try {  conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}  
		return result;   
	} 
	
	///////////////////////////////////////////
	public static void main(String[] args) {
		// test순서
		UserDao dao = new UserDao();   
		
		//insert  
		dao.getConnection();    
		UserInfo user = new UserInfo();   user.setName("aaa");   user.setEmail("aaa@gmail.com");
		if( dao.insert(user) > 0 ) { System.out.println("유저추가");}
		
		//readAll  
		dao.getConnection();
		System.out.println(  dao.readAll()  );
		
		//read
		dao.getConnection();
		System.out.println(dao.read(4)); 
		
		//update 
		dao.getConnection();    
		UserInfo user2 = new UserInfo();   user2.setNo(4);   user2.setEmail("abc@gmail.com");
		if( dao.update(user2) > 0 ) { System.out.println("유저수정");}
		
		//delete	
		dao.getConnection();
		if( dao.delete(4) > 0 ) { System.out.println("유저삭제");}
	}
}

/*
1-2. crud (insert, select, delete, update)     
** 유저삽입
	insert into userinfo  (no, name, email) values (seq_userinfo.nextval , 'aaa', 'aaa@gmail.com')
	insert into userinfo  (no, name, email) values (seq_userinfo.nextval , 'bbb', 'bbb@gmail.com')

	public 리턴값  메서드명(파라미터)
	public int    insert(UserInfo user){    }   ##

** 유저전체검색 / 해당번호가 2번인 유저검색   
	select * from userinfo;
	select * from userinfo  where no=2;

	public 리턴값  메서드명(파라미터)
	public ArrayList<UserInfo> readAll(){}   ##
	public UserInfo  read( int no ){}  ##
	
	
** 해당번호가 2번인 유저 email 수정 abc@gmail.com   
	update  userinfo  set email='abc@gmail.com'  where  no=2;

	public 리턴값  메서드명(파라미터)
	public int    update( UserInfo user ){    }   ##

** 해당유저가 2번인 유저 삭제   
	delete from userinfo  where  no=2;
	
	public 리턴값  메서드명(파라미터)
	public int    delete( int no ){   }  ##
*/
