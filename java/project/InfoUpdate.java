package com.company.project;

import java.util.ArrayList;
import java.util.Scanner;

public class InfoUpdate implements InfoProcess {
	@Override
	public void exec(ArrayList<Info> users) {
		System.out.println("3. 수정기능입니다.");
		Scanner scanner = new Scanner(System.in);
		//1. 사용자에게 수정할 번호를 입력받고
		//2. 수정할이메일입력받기                add / get/size/remove / contains
		System.out.print("수정할 유저번호입력 > ");   int find = scanner.nextInt();   //get 0부터시작
		System.out.print("수정할 유저이메일입력 > ");  String email = scanner.next(); 
		users.get( find-1 ).setEmail(   email  );
	}
}// end class