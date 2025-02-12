package com.company.javaportfolio;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class GoldDelete implements GoldProcess {

	@Override
	public void exec(ArrayList<GoldUser> users) {

		System.out.println("유저삭제");
		//1. 삭제할 아이디 물어보기
		//2. 정말 삭제할 것인지 다시확인받기
		//3. 확인받았으면 입력받은 아이디 찾아서 지우기 / 취소하면 메뉴로 돌아가기.
		String d_id = JOptionPane.showInputDialog("삭제할 아이디를 입력해주세요.");
		Iterator<GoldUser> iter = users.iterator();
		while(iter.hasNext()) {
			GoldUser g = iter.next();
			if(d_id.equals(g.getUserName())) {
				users.remove(g);
				break;
			}
			else { JOptionPane.showMessageDialog(null, "아이디를 확인해주세요."); return;}
		}
		
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
