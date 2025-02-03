package com.company.project;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class InfoCreate implements InfoProcess {
	@Override public void exec(ArrayList<Info> users) {
		System.out.println("1. 등록기능입니다.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("이메일입력 > ");
		users.add( new Info(scanner.next()) );
		//list.add(  new Info("aaa@gmail.com") );
		//System.out.println("............. 확인 >" + users);
	}// end exec

	@Override
	public void exec(ArrayList<Info> users, View_crud crud) {
		//1. 알림창으로 입력받기
		String email = JOptionPane.showInputDialog("이메일을 입력해주세요 > ");
		//2. ArrayList에 데이터 채우기
		users.add(new Info(email));
		//3. crud 화면 갱신
		Object[] data = {Info.cnt , email};
		crud.model.addRow(data);
	}// end exec
}// end class