package com.company.javaportfolio;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class mGold implements GoldProcess {

	@Override
	public void exec(ArrayList<GoldUser> users) {
		String mg_id = "", mg_pw="";
		int mMoney = 0;
		Iterator<GoldUser> iter = users.iterator();
		mg_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
		mg_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
		while (true) {
			GoldUser g = iter.next();
			if(mg_id.equals(g.getUserName()) && mg_pw.equals(g.getPass())) {
				mMoney = Integer.parseInt( JOptionPane.showInputDialog("입금하실 금액을 입력해주세요."));
				if ( mMoney > g.getUserMoney() ) {JOptionPane.showMessageDialog(null, "현재 잔액보다 출금금액이 클 수 없습니다."); continue;}
				else {
				g.setUserMoney(g.getUserMoney() - mMoney);
				JOptionPane.showMessageDialog(null, "출금이 완료되었습니다. 출금 후 잔액은 " + g.getUserMoney() + "원 입니다."); return;}
			}
			
		}
		
	}

}
