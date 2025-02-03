package com.company.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

//1. 클래스는 부품객체
//2. 멤벼변수 / 멤버함수
//3. MVC_using 조립
/*  합성 관계(composition) - 생성자 new
          MVC_using
   model     view     controller      
    ◆       ◆        ◆
List<Info>  View_intro    controller
          View_crud     [] process
*/
class MVC_using{
	//1. 멤버 변수
	
	//2. model
	ArrayList<Info> list =  new ArrayList<Info>();

	//3. view
	View_intro intro;
	View_crud crud;
	
	//4.controller
	InfoProcess controller;
	InfoProcess [] process; // Info Create, Read, Update, Delete

	public MVC_using() {
		list = new ArrayList<>();
		intro = new View_intro(); intro.show();
		crud = new View_crud();
		process = new InfoProcess[] {
			new InfoCreate(), new InfoUpdate(), new InfoDelete(), 	new InfoRead(),
		};
	}
	//5.멤버함수
	
	//6. intro
	public void step1() {
		intro.button.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				intro.frame.dispose(); // 화면 꺼지고
				crud.show();	// crud 창 열리고
				step2();
			} //end actionPerformed
		});//end addActionListener
	}//end step1
	
	//7. crud
	public void step2() {
		String []msg = new String[] {"추가기능 입니다.","수정기능 입니다.","삭제기능 입니다."};
		/*
		for (int i = 0; i < msg.length; i++ ) {
		crud.button[i].addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, msg[i]);
				controller = process[1];
				controller.exec(list);
			}
		});
		}*/
		crud.button[0].addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, msg[0]);
				controller = process[0];
				controller.exec(list,crud);
			}
		});
		crud.button[1].addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, msg[1]);
				controller = process[1];
				controller.exec(list,crud);
			}
		});
		crud.button[2].addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, msg[2]);
				controller = process[2];
				controller.exec(list,crud);
			}
		});
		crud.button[3].addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				crud.frame.disable();
			}
		});
	}// end step2
}

public class Test004_mvc {
	public static void main(String[] args) {
		new MVC_using().step1();
	}// end main
}// end class
/*	부품들 모으기
	1. Test001_model.java	> Info 분리, List<Info> list = new ArrayList<Info>();
	2. Test002_controller.java > interface 1개 class 4개
	
	<<interface>> InfoProcess (  void exec(ArrayList<Info> users)
	
	InfoCreate	InfoRead	InfoUpdate	InfoDelete
	3. Test003_view.java	> View_intro, View_crud
*/