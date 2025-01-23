package com.company.day011_using_Thread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class View_intro{
	JFrame frame;
	JButton button;
	////  생성자  ////
	public View_intro() {
		this.frame 	= new JFrame("FRAME");
		this.button = new JButton("WELLCOME");		
	}
	//// 멤버함수 ////
	public void show() {		
		frame	.add			(button);
		frame	.setSize		(300,200);
		frame	.setVisible		(true);
		button	.setBackground	(Color.blue);
		button	.setForeground	(Color.white);
		button	.setFont		(new Font(Font.SANS_SERIF, Font.BOLD, 25));
		frame	.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
}// View_intro
class View_crud {
		JFrame frame;
		//1. JTable
		JScrollPane scroll; JTable table; // scroll (넘침 방지) / table (표)
		String[] column; Object[][] rowData; //각 칸들 / 줄-레코드  - 줄단위 데이터
		DefaultTableModel model; // 데이터를 동적 추가, 삭제
		//2. 버튼 영역
		JPanel panel;		JButton [] button;
		
		////  생성자  ////
		public View_crud() {
			frame = new JFrame("USERINFO");
			panel = new JPanel();
			button = new JButton[] { new JButton("ADD"), new JButton("UPDATE"), new JButton("DELETE"), new JButton("CLOSE")};
			//frame 짜기
			column = new String[] {"NO","EMAIL"}; // 테이블에 들어갈 데이터 양식
			rowData = new Object[][] {}; 			// 테이블에 들어갈 데이터 공간 확보 
			model = new DefaultTableModel(rowData, column); // 데이터모델
			table = new JTable(model); // 테이블 데이터 동적 관리
			scroll = new JScrollPane(table); // 테이블에 스크롤 추가
		}
		//// 멤버함수 ////
		public void show() {
			frame.setLayout(new BorderLayout());
			frame.add(scroll, BorderLayout.CENTER);
			frame.add(panel, BorderLayout.SOUTH);
			for (int i = 0; i < button.length; i++ ) {panel.add(button[i]);}
			frame.setSize(400, 300);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}// show
	} // class View_crud
	



public class GUI004 {
	public static void main(String[] args) {
		//new View_intro().show();
		//new View_crud().show();
		
		View_crud crud = new View_crud();
		//1. 데이터 추가 - add
		Object[] data = {1, "AAA@gmail.com"};
		crud.model.addRow( data ); //네트워크 통신시 vector 사용
		
		
		//2. 데이터 삭제
		crud.model.removeRow(0);
		
		crud.show();
	}	
}
