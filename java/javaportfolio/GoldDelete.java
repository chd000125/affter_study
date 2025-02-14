package com.company.javaportfolio;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class GoldDelete implements GoldProcess {

	@Override
	public void exec(ArrayList<GoldUser> users) {
		//1. 아이디 비밀번호 인증 확인하기
		String dd_id = "", dd_pw = "", delete = "";
		int no = -1;
		int cnt = 0;
		//1. 아이디 비번 입력받기 2. 아이디 비번 찾기 3. 삭제할건지 여부 묻기 4-1. 삭제 4-2. 메뉴로 나가기 5. 삭제 완료 메세지 띄우기
		//1. 아이디 비번 입력받기
		dd_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
		dd_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
		Iterator<GoldUser> iter = users.iterator();
		//2. 아이디 비번 찾기
		while (iter.hasNext()) {
			GoldUser g = iter.next();
			if ( dd_id.equals(g.getUserName()) && dd_pw.equals(g.getPass()) ) {
				// 찾았으면 찾은 넘버 저장하고 나오기
				no = cnt;
				break;
			}
			// 못찾았으면 값 증가시키고 반복
			cnt++;
		}
		if( no == -1 ) {JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 확인해주세요.");}
		//3. 삭제할건지 여부 묻기
		delete = JOptionPane.showInputDialog("정보를 삭제하실거면 '삭제' 라고 입력해주세요. ");
		//4-1. 삭제
		if(delete.equals("삭제")) {
			users.remove(users.get(no));
			JOptionPane.showMessageDialog(null, "정상적으로 삭제되었습니다.");
		}//4-2. 삭제가 아니라면
		else { JOptionPane.showMessageDialog(null, "메인으로 돌아갑니다."); }

		/*
		Iterator<GoldUser> iter = users.iterator();
		int find = -1;
		while (iter.hasNext()) {
			if(find == -1) {
				break;
			}
			else { users.remove(find);}
		}*/
	}
	
}
