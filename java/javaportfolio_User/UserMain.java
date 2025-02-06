package com.company.javaportfolio_User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//1. 클래스는 부품객체
//2. 멤버변수 / 멤버함수
//3. 조립(합성) - 생성자 new
//				USerMain
//		◆				◆						◆
//  <<Model>>    	<<View>>     		  <<Controller>>
// List<UserInfo>	UserView_intro		  controller
//					UserView_crud		  [] process

public class UserMain {
	//model
	ArrayList<UserInfo> users;
	
	//view
	UserView_intro intro;
	UserView_crud crud;
	
	//controller
	UserProcess controller;
	UserProcess [] process;
	
	///// 생성자
	public UserMain() { 
		users = new ArrayList<>();
		intro = new UserView_intro(); intro.show();
		crud = new UserView_crud();
		process = new UserProcess[] { new UserCreate(),new UserUpdate(),new UserDelete(),new UserRead(), };
		}
	///// 행위 - 기능 - 멤버함수
	public void intro() {
		intro.btns[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//1. 현재창 끄고
				intro.frame.dispose();
				//2. crud창 열기
				crud.show();
				member();
			}//end Override method
		});// end ActionListener
	}//end intro
	public void member() {
		crud.button[0].addActionListener(new ActionListener() { // 등록
			@Override
			public void actionPerformed(ActionEvent e) {
				controller = process[0]; controller.exec(users, crud); // 처리하고 -> 해당view
			}// end Override
		}); //end ActionListener
		crud.button[1].addActionListener(new ActionListener() { // 수정
			@Override
			public void actionPerformed(ActionEvent e) {
				controller = process[1]; controller.exec(users, crud); // 처리하고 -> 해당view
			}// end Override
		}); //end ActionListener
		crud.button[2].addActionListener(new ActionListener() { // 삭제
			@Override
			public void actionPerformed(ActionEvent e) {
				controller = process[2]; controller.exec(users, crud); // 처리하고 -> 해당view
			}// end Override
		}); //end ActionListener
		crud.button[3].addActionListener(new ActionListener() { // 종료
			@Override
			public void actionPerformed(ActionEvent e) {
				crud.frame.dispose();
			}// end Override
		}); //end ActionListener
	}//end member
	
	// public 
	public static void main(String[] args) {
		new UserMain().intro();
	}

	
}
