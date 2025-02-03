package com.company.project;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class InfoUpdate implements InfoProcess {
	@Override
	public void exec(ArrayList<Info> users) {
		System.out.println("3. 수정기능입니다.");
		Scanner scanner = new Scanner(System.in);
		//1. 사용자에게 수정할 번호를 입력받고
		//2. 수정할이메일입력받기                add / get/size/remove / contains
		System.out.print("수정할 유저번호입력 > ");   int find = scanner.nextInt();   //get 0부터시작
		System.out.print("수정할 유저이메일입력 > ");  String email = scanner.next(); 
		users.get( find-1 ).setEmail(   email  );
	}

	@Override
	public void exec(ArrayList<Info> users, View_crud crud) {
		//1. 수정할 유저번호 입력
		int no = Integer.parseInt(JOptionPane.showInputDialog("수정할 유저번호를 입력하세요."));
		int find = -1;
		for (int i = 0; i < users.size(); i++) {
			Info temp = users.get(i);
			if (temp.getNo() == no) {find = i; break;}
		}
		if (find == -1) {
			JOptionPane.showMessageDialog(null, "번호를 확인해 주세요."); return;
		}
		//2. 수정할 유저 이메일 입력받기
		String email = JOptionPane.showInputDialog("수정할 이메일을 입력해 주세요 > ");
		//3. ArrayList 수정
		users.get(find).setEmail(email);
		//4. view 갱신
		
	}
}// end class