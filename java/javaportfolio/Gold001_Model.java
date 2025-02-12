package com.company.javaportfolio;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Gold001_Model {
	   public static void main(String[] args) {
	      //0. 전체저장소
//	      GoldUser one = new GoldUser("admin","123","admin123@gmail.com");
//	      System.out.println(one);
	      
	      //1. Create (회원관리)
	      ArrayList<GoldUser>  list = new ArrayList<>();
	      //1-1. 관리자
	      list.add(new GoldUser("admin","123","admin123@gmail.com"));
	      //1-2. 사용자
	       String id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
	       String pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
	       String em = JOptionPane.showInputDialog("이메일을 입력해주세요.");
	      // 사용자에게 아이디,비번,이메일 입력받기
	       list.add(new GoldUser(id,pw,em));
	      //list.add(new GoldUser("입력받는 값","입력받는 값","입력받는 값"));
	      
	      //2. Read (로그인 기능)
	      //2-1. 전체 사용자 iterator
	       String r_id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
	       String r_pw = JOptionPane.showInputDialog("비밀 번호를 입력해주세요.");
	      Iterator <GoldUser>  iter=list.iterator();   //1)줄을 서시오
	      while(iter.hasNext()) {  //2)처리대상확인
	         GoldUser u= iter.next(); //3)꺼내오기
	         if(u.getUserName().equals(id) && u.getPass().equals(r_pw)) {
	        	 System.out.println(u);
	         }
	      }
	      //2-2. 
	      // 아이디 입력받기 , 비번 입력받기
	      // 전체 사용자 iterator 아이디와 비번이 같다면 user번호 담기(찾기)
	      
	   }
	}
