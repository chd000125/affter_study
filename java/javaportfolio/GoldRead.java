package com.company.javaportfolio;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class GoldRead implements GoldProcess{
	@Override
	public void exec(ArrayList<GoldUser> users) {

		System.out.println("유저확인");
		//step1) 
		//변수 
		//입력 임시 아이디, 비밀번호 입력받기
		//처리 기능1) 유저확인   /   기능2)
		//출력 
		// 임시 아이디, 비밀번호 입력받기
		String r_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
		String r_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
		Iterator<GoldUser> iter = users.iterator(); // GoldUser 줄 세우기
		while (true) { 
			GoldUser g = iter.next(); // GoldUser 정보 담기 
			 // 임시 아이디,비밀번호와 GoldUser 에 있는 아이디, 비밀번호 일치 확인
			if (!r_id.equals(g.getUserName()) && !r_pw.equals(g.getPass())) {
				// 확인 실패
				JOptionPane.showMessageDialog(null, "아이디, 비밀번호를 확인해주세요.");
				continue; // 아래꺼 스킵
			} else if(r_id.equals(g.getUserName()) && r_pw.equals(g.getPass())){
				//확인 성공
				JOptionPane.showMessageDialog(null, g.getUserName()+"님 의 현재 잔액은 " + g.getUserMoney() + "원 입니다.");
				break; // 정보 출력 후 반복 나오기
			}
		}
		
		/*
		Iterator<GoldUser> iter = users.iterator();
		while (iter.hasNext()) {
			GoldUser g = iter.next();
			String r_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
			String r_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
			if(r_id.equals(g.getUserName()) && r_pw.equals(g.getPass())){ System.out.println("이미 가입된 아이디입니다."); break; }
			else {break;}
			}*/

	}
}
