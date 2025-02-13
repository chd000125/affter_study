package com.company.javaportfolio;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class pGold implements GoldProcess {
	@Override
	public void exec(ArrayList<GoldUser> users) {
		String pg_id = "", pg_pw="";
		int PMoney = 0;
		Iterator<GoldUser> iter = users.iterator();
		//1. 임시 아이디, 비밀번호 입력받기
		pg_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
		pg_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
		while (true) { // 무한반복 찾기
			GoldUser g = iter.next(); // 찾는 데이터 저장
			int no = g.getNo(); // 찾은 데이터의 번호 저장
			// 임시 아이디, 비밀번호가 저장된 아이디, 비밀번호와 같은지 조사(로그인 기능)
			if(pg_id.equals(g.getUserName()) && pg_pw.equals(g.getPass())) {
				// 입금 금액 입력받기
				PMoney = Integer.parseInt( JOptionPane.showInputDialog("입금하실 금액을 입력해주세요."));
				// 변경된 금액 데이터 저장
				iter.set(no).setUserMoney(g.getUserMoney() + PMoney);
				// 입금완료 후 데이터 표출
				JOptionPane.showMessageDialog(null, "입금이 완료되었습니다. 입금 후 잔액은 " + g.getUserMoney() + "원 입니다.");
			}
		}
		
	}
}
