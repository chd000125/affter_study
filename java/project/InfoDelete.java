package com.company.project;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class InfoDelete implements InfoProcess {
	@Override
	public void exec(ArrayList<Info> users) {
		System.out.println("4. 삭제기능입니다.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 유저번호입력 > ");   int find = scanner.nextInt();
		// add / get/size/remove / contains
		//users.remove(find-1);  // upgrade!   
		Info finduser = null;     // 삭제번호와  사용자의번호가 같으면     객체담기
		for( Info u  : users) {  if(  find == u.getNo() ) {  finduser = u; break; } } 
		users.remove(finduser);  // 그 객체 삭제해주세요
	}

	@Override
	public void exec(ArrayList<Info> users, View_crud crud) {
		// 1. 삭제번호 입력받아서
		int no = Integer.parseInt(JOptionPane.showInputDialog("삭제할 유저 번호를 입력하세요 > "));
		// 2. 해당번호가 맞다면
		// crud.model.removeRow(0);
		int find = -1;
		for ( int i = 0; i < users.size(); i++) {
			Info temp = users.get(i);
			if ( temp.getNo() == no) { find = i; break; }  //찾았다면 나오기
		}
		if (find == -1) {
			JOptionPane.showMessageDialog(null, "번호를 확인해주세요.");
		} else {crud.model.removeRow(find);}
	}
}// end class