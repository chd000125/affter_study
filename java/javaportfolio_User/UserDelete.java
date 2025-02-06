package com.company.javaportfolio_User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserDelete implements UserProcess{
	@Override public void exec(ArrayList<UserInfo> users) {
		System.out.println("..........4. delete");
		Iterator<UserInfo> iter=users.iterator();  //1)줄을 서시오

		Scanner scanner = new Scanner(System.in);
		System.out.print("no > ");     int no = scanner.nextInt();
		
		while(iter.hasNext()) {  //2)처리대상확인
			UserInfo u= iter.next(); //3)꺼내오기
			//if( no가 2이라면 ) { abc@gmail.com으로 변경  }
			if(u.getNo() == no) { iter.remove(); break; }  // iter가 가리키는 친구를 지워주세요!
		}
		
	}

	@Override
	public void exec(ArrayList<UserInfo> users, UserView_crud crud) {
		int no = Integer.parseInt(JOptionPane.showInputDialog("삭제할 번호를 입력해주세요."));
		int find = -1; int cnt = 0;
		Iterator<UserInfo> iter = users.iterator(); // 줄서기
		while(iter.hasNext()) {// 데이터 존재 유무확인
			if(iter.next().getNo() == no ) {find = cnt; iter.remove(); break;}
			cnt ++; // iterator는 index카운트 어려움.
		}
		if(find == -1) {JOptionPane.showMessageDialog(null, "번호를 확인해주세요"); return;}
		
		crud.model.removeRow(cnt);
	}
}
