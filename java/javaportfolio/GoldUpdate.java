package com.company.test;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class GoldUpdate implements GoldProcess{

	@Override
	public void exec(ArrayList<GoldUser> users) {

		System.out.println("유저수정");
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
