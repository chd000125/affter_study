package com.company.javaportfolio;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class GoldUpdate implements GoldProcess{

	@Override
	public void exec(ArrayList<GoldUser> users) {

		System.out.println("유저수정");
		//1. 임시 아이디와 임시 비밀번호 입력받기 READ기능 사용
		//2. 확인이 되었다면 그 정보가 있는 줄 찾기
		//3. 바꿀 아이디 입력하기 + 중복확인
		//4. 변경할 비밀번호 입력받기
		//5. 변경할 이메일 입력받기
		//6. 변경사항 저장.
		/*
		Iterator<GoldUser> iter = users.iterator();
		while ( iter.hasNext() ) {
			GoldUser g =iter.next();
			String u_id = JOptionPane.showInputDialog("변경할 아이디를 입력해주세요.");
			if (u_id.equals(g.getUserName())) {JOptionPane.showMessageDialog(null, "존재하는 아이디입니다.");}
			else {
				String u_pw = JOptionPane.showInputDialog("변경할 비밀번호를 입력해주세요.");
				String u_em = JOptionPane.showInputDialog("변경할 이메일을 입력해주세요.");
				g.setUserName(u_id);
				g.setUserName(u_pw);
				g.setUserName(u_em);
			}
		}*/
	}

}
