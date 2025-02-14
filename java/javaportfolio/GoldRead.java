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
		//처리 기능1) 유저확인 / 기능2) 잔액 확인
		//출력 
		//1. 아이디 비번 입력받기 2. 아이디 비번 일치 확인 3. 현재 잔액 출력
		//1. 아이디 비번 입력받기
		int no = -1;
		int cnt = 0;
		String r_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
		String r_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
		Iterator<GoldUser> iter = users.iterator(); // GoldUser 줄 세우기
		while (iter.hasNext()) {
			GoldUser g = iter.next();
			if (r_id.equals(g.getUserName()) && r_pw.equals(g.getPass()) ) {
				no = cnt;
				break;
			}
			cnt++;
		}
 JOptionPane.showMessageDialog(null, users.get(no).getUserName() + "님의 현재 잔액은 " + users.get(no).getUserMoney() + "원 입니다.");
		
		
		
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
