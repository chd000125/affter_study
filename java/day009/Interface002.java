package com.company.day009;
/*
						   Object
		  					 ↑
						   Board(exec)
	↑				↑				↑				↑
 BoardInsert   BoardSelect		BoardUpdate		BoardDelete
 	(exec)		(exec)				(exec)			(exec)
*/
interface Board { public void exec();}
class BoardInsert implements Board { @Override public void exec() { System.out.println("글쓰기");} }
class BoardSelect implements Board { @Override public void exec() { System.out.println("글선택");} }
class BoardUpdate implements Board { @Override public void exec() { System.out.println("글수정");} }
class BoardDelete implements Board { @Override public void exec() { System.out.println("글삭제");} }

public class Interface002 {
	public static void main(String[] args) {
		Board board = null; // new 못함		하나의 타입으로 여러개의 객체관리.
		board = new BoardInsert(); board.exec();
		board = new BoardSelect(); board.exec();
		board = new BoardUpdate(); board.exec();
		board = new BoardDelete(); board.exec();
	
	}
}
/*
 	
*/
