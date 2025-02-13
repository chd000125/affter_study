package com.company.javaportfolio;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class GoldDelete implements GoldProcess {

	@Override
	public void exec(ArrayList<GoldUser> users) {
		//1. 아이디 비밀번호 인증 확인하기
		String dd_id = "", dd_pw = "", delete = "";
		dd_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
		dd_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
		Iterator<GoldUser> iter = users.iterator();
		while(true) {// 무한히 찾기
			GoldUser g = iter.next(); // 데이터 찾아서 넣기
			// 인증 실패
			if(!dd_id.equals(g.getUserName())&& !dd_pw.equals(g.getPass())) {
				//실패 메세지
				JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 확인해주세요.");
				// 메뉴로 나가기
				return;
			}
			else if (dd_id.equals(g.getUserName()) && dd_pw.equals(g.getPass())) {
				delete = JOptionPane.showInputDialog("정보를 삭제하려면 '삭제'를 입력");
				if(delete.equals("삭제")) {
					iter.remove();
					JOptionPane.showMessageDialog(null, "삭제되었습니다.");
				}
				else {return;}
			}
		}
		// 삭제 할건지 여부 확인
		// 삭제
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
