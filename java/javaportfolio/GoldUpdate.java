package com.company.javaportfolio;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class GoldUpdate implements GoldProcess{
	@Override
	public void exec(ArrayList<GoldUser> users) {
		Iterator<GoldUser> iter = users.iterator();
		int find = -1;
		String u_id = "", u_pw = "", ch_id = "", ch_pw = "", ch_em = "";
		
		//인증
		while (true) {
			GoldUser g = iter.next();
			//1. 임시 아이디와 임시 비밀번호 입력받기 READ기능 사용
			u_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
			u_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
			if (u_id.equals(g.getUserName()) && u_pw.equals(g.getPass())) {
			//찾은 정보 위치 저장
				find = g.getNo(); 
				break;
				//2. 인증성공
			}//end if
			// 인증 실패 다시 인증받기.
			else { JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 확인해주세요."); return;}
		}//end while
		
		// 변경
			while (true) {
			// 줄 세우기 초기화
			iter = users.iterator();
			//3. 바꿀 아이디 입력하기
			ch_id = JOptionPane.showInputDialog("변경할 아이디를 입력해주세요.");
			GoldUser g = iter.next();
			// 바꿀 아이디 중복확인
			if(ch_id.equals(g.getUserName())) {JOptionPane.showMessageDialog(null, "이미 존재하는 아이디 입니다.");
			// 변경 불가 아래꺼 스킵하고 다시 입력받기
			continue;
			}// end if
			// 중복이 아니라면 while 빠져나오기
			else {break;}
		}//end while
			//4. 변경할 비밀번호 입력받기
			ch_pw = JOptionPane.showInputDialog("변경할 비밀번호를 입력해주세요.");
			//5. 변경할 이메일 입력받기
			ch_em = JOptionPane.showInputDialog("변경할 이메일을 입력해주세요.");
			//6. 변경사항 저장. -- 변경 안됨.
			users.get(find).setUserName(ch_id);
			users.get(find).setPass(ch_pw);
			users.get(find).setUserEmail(ch_em);
			System.out.println(users.get(find));
			JOptionPane.showMessageDialog(null, "변경이 완료되었습니다. ");
	}//end exec
}// end update

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
