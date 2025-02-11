package com.company.test;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class GoldCreate implements GoldProcess {

	@Override
	public void exec(ArrayList<GoldUser> users) {
	   //1. Create (회원관리)
	   //System.out.println("유저등록");
	    // Step1) 
		// 변수 
		// 입력 아이디를 입력받기 ㄴ
		// 처리 기능1) 아이디중복검사 -같은게 있으면 알림창띄우고 메뉴 / 기능2) 아니라면 유저등록
		// 출력
		///////////////////////////////////////////////////////////////////////////////
	    // Step2)   기능1) 유저 아이디 확인
		// 변수
		String c_id = "no_user",c_pw="",c_em="";
		//기능1) 유저 아이디 확인 
	    //1-2. 사용자
	    // 1. 입력받은 값이랑   users.get(0)  같다면 종료 후 메뉴판
	    // 1. 입력받은 값이랑   users.get(1)  같다면 종료 후 메뉴판
		c_id  = JOptionPane.showInputDialog("아이디를 입력해주세요."); 
	    for (int i =0; i<users.size(); i++) {
		    if(c_id.equals(users.get(i).getUserName())) { // 찾았다
		       JOptionPane.showMessageDialog(null, "아이디를 다시 입력해주세요."); 
		       c_id = users.get(i).getUserName();
		       return;// 나가
		    }
	    }
		///////////////////////////////////////////////////////////////////////////////
	    // 기능2) 저장소에 등록
		//list.add(new GoldUser("입력받는 값","입력받는 값","입력받는 값"));   
	    // temp가 ""라면 
        c_pw = JOptionPane.showInputDialog("비밀번호를 입력해주세요.");
        c_em = JOptionPane.showInputDialog("이메일을 입력해주세요.");
        users.add(new GoldUser(c_id,c_pw,c_em));  
		///////////////////////////////////////////////////////////////////////////////
	}

}
