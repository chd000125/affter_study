package com.company.javaportfolio;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class GoldUpdate implements GoldProcess{
	@Override
	public void exec(ArrayList<GoldUser> users) {
		int find = -1;
		String u_id = "", u_pw = "", ch_id = "", ch_pw = "", ch_em = "";
		
		//1. 임시 아이디와 임시 비밀번호 입력받기 READ기능 사용
		u_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
		u_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
		
		//2.인증
		Iterator<GoldUser> iter = users.iterator();
		int cnt = 0;
		while (iter.hasNext()) {
			GoldUser g = iter.next();
			if (u_id.equals(g.getUserName()) && u_pw.equals(g.getPass())) {
			//찾은 정보 위치 저장
				find = cnt; 
				break;
				//2. 인증성공
			}//end if
			// 인증 실패 다시 인증받기.
			cnt++;
		}//end while
		
		if(find == -1 ) { JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 확인해주세요."); return;}

		// 3. 변경
		// 줄 세우기 초기화
		/*
		while ( 무한반복 !check ) {
		    // 입력 - 사용자 아이디 입력받기
		    // 전체 유저에서 검색하기 / 찾았다(다시 입력받기)  -  못 찾았다 ( 무한 반복 빠지기 )
			for (int i = 0; 유저 갯수; i++){
				 찾았다(다시 입력받기 : break;) 
			} 
			if ( i = 유저갯수 )못 찾았다 (무한 반복 빠지기 check = true)
		}
		*/

		/*
		boolean check = false;
		while (!check ) {
			ch_id = JOptionPane.showInputDialog("변경할 아이디를 입력해주세요.");
			int i;
			for ( i = 0; i < users.size(); i++){
				if(ch_id.equals(users.get(i).getUserName())) {
					JOptionPane.showMessageDialog(null, "이미 존재하는 아이디 입니다.");
					// 변경 불가 아래꺼 스킵하고 다시 입력받기
					break;
				}// end if
			} 
			if ( i == users.size() ) {check = true;}
			
		}*/			
		
		//System.out.println(".........update" + users);	System.out.println("........." + find);
		//4. 변경할 비밀번호 입력받기
		//ch_pw = JOptionPane.showInputDialog("변경할 비밀번호를 입력해주세요.");
		//5. 변경할 이메일 입력받기
		ch_em = JOptionPane.showInputDialog("변경할 이메일을 입력해주세요.");
		//6. 변경사항 저장. -- 변경 안됨.
		users.get(find).setUserName(ch_id);
		users.get(find).setPass(ch_pw);
		users.get(find).setUserEmail(ch_em);
		System.out.println("....."+users.get(find));

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
