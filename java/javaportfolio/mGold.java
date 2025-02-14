package com.company.javaportfolio;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class mGold implements GoldProcess {

	@Override
	public void exec(ArrayList<GoldUser> users) {
		//변수
		String mg_id = "", mg_pw="";
		int mMoney = 0;
		int no = -1;
		int cnt = 0;
		Iterator<GoldUser> iter = users.iterator();
		///////////////////// 기능
		//1. 아이디 비번 입력받기 2. 아이디 비번 일치하는지 확인 3. 출금 값 입력받기(반복 - 출금금액이 잔액보다 크면) 4. 잔액 - 입력받은 출금금액 빼기
		// 아이디 비밀번호 입력받기
		mg_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
		mg_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
		
		//2. 아이디 비번 일치하는지 확인
		while (iter.hasNext()) {
			GoldUser g = iter.next();
			// 아이디 비밀번호 일치하는지 확인.
			if(mg_id.equals(g.getUserName()) && mg_pw.equals(g.getPass())) {
				no = cnt;
				break;
			}
			cnt++;
			// 못찾았으면 cnt 증가시키고 다시 찾기
		}
		// 일치하면 출금할 금액 물어보기
		if ( no == -1 ) {
			for (;;) {
				mMoney = Integer.parseInt( JOptionPane.showInputDialog("출금하실 금액을 입력해주세요."));
				// 입력한 출금 금액이 남아있는 현재 잔액보다 크면 알림창 띄우고 다시 입력받기
				if ( mMoney > users.get(no).getUserMoney() ) {
					JOptionPane.showMessageDialog(null, "현재 잔액보다 출금 금액이 클 수 없습니다.");
				}else {break;}
			}
			// 금액 처리
			users.get(no).setUserMoney(users.get(no).getUserMoney() - mMoney);
			JOptionPane.showMessageDialog(null, "출금이 완료되었습니다. 출금 후 잔액은 " + users.get(no).getUserMoney() + "원 입니다.");
		}
	}

}
