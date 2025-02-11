package com.company.test;

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
		
		String r_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
		String r_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
		Iterator<GoldUser> iter = users.iterator();
		while (iter.hasNext()) {
			GoldUser g = iter.next();
			if(r_id.equals(g.getUserName()) && r_pw.equals(g.getPass())){ System.out.println("정보출력"); break; }
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
