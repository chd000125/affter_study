package com.company.project;

import java.util.ArrayList;
import java.util.List;

class MVC_using{
	//1. 멤버 변수
	
	//2. model
	List<Info> list =  new ArrayList<Info>();
	//3. view
	View_intro intro;
	View_crud crud;
	
	//4.controller
	InfoProcess controller;
	InfoProcess [] process; // Info Create, Read, Update, Delete
	
	//5.멤버함수
	//6. intro
	public void step1() {}
	
	//7. crud
	public void step2() {}
	
	
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