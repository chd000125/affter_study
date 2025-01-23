package com.company.project;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class   View_crud{
	////////////// 멤버변수
	//0. 전체틀
	JFrame frame; 
	//1. JTable
	String [] column;       Object[][] rowData;  // 각칸들 / 줄-레코드 -줄단위데이터
	DefaultTableModel model; // 데이터를 동적 추가, 삭제
	JScrollPane  scroll;    JTable table;  // scroll( 넘쳤을때 처리) /  table(표)
	//2. 버튼영역
	JPanel panel;    JButton[] button;   
	
	///////////// 생성자
	public View_crud() { 
		frame  = new JFrame("USERINFO");
		
		panel  = new JPanel();
		button = new JButton[] {
		   new JButton("ADD"), new JButton("UPDATE"), new JButton("DELETE"), new JButton("CLOSE") 
		};
		
		column  = new String[] {"NO","EMAIL"}; // 각칸
		rowData = new Object[][] {};  // 줄단위 데이터
		model   = new DefaultTableModel(rowData , column); // 동적데이터처리  
		table   = new JTable(model);
		scroll  = new JScrollPane(table);
	}
	
	///////////// 멤버함수
	public void show() {
		//Q1. frame  - BorderLayout 이용
		frame.setLayout(new BorderLayout());   // ctrl + shift + o
		//Q2. scroll   BorderLayout.CENTER 배치
		frame.add(scroll , BorderLayout.CENTER );
		//Q3. panel    BorderLayout.SOUTH  배치
		frame.add(panel  , BorderLayout.SOUTH );
		
		//Q4. 버튼 4개 부착
		for(int i=0; i<button.length; i++) {   panel.add(button[i]);   }
		//Q6. setSize   400,300
		frame.setSize(400,300);
		//Q7. setVisible true
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
