package com.company.javaportfolio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GoldCreate implements GoldProcess {

	@Override
	public void exec(ArrayList<GoldUser> users) {
		//1. Create (회원관리)
	      ArrayList<GoldUser>  list = new ArrayList<>();
	      //1-1. 관리자
	      list.add(new GoldUser("admin","123","admin123@gmail.com"));
	      //1-2. 사용자
	       String c_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
	       String c_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
	       String c_em = JOptionPane.showInputDialog("이메일을 입력해주세요.");
	      // 사용자에게 아이디,비번,이메일 입력받기
	       list.add(new GoldUser(c_id,c_pw,c_em));
	      //list.add(new GoldUser("입력받는 값","입력받는 값","입력받는 값"));
	}

}
