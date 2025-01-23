package com.company.project;

import java.util.ArrayList;
import java.util.Scanner;

public class InfoDelete implements InfoProcess {
	@Override
	public void exec(ArrayList<Info> users) {
		System.out.println("4. 삭제기능입니다.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 유저번호입력 > ");   int find = scanner.nextInt();
		// add / get/size/remove / contains
		//users.remove(find-1);  // upgrade!   
		Info finduser = null;     // 삭제번호와  사용자의번호가 같으면     객체담기
		for( Info u  : users) {  if(  find == u.getNo() ) {  finduser = u; break; } } 
		users.remove(finduser);  // 그 객체 삭제해주세요
	}
}// end class