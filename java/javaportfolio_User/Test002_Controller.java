package com.company.javaportfolio_User;

import java.util.ArrayList;
import java.util.Scanner;

public class Test002_Controller {
	public static void main(String[] args) {
		
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(new UserInfo("aaa", "aaa@gmail.com"));
		list.add(new UserInfo("bbb", "bbb@gmail.com"));
		list.add(new UserInfo("ccc", "ccc@gmail.com"));
		
		Scanner sc = new Scanner(System.in);
		UserProcess controller = null; // 부모 - 인터페이스 - 설계
		UserProcess [] crud = {
				new UserCreate(), new UserRead(), new UserUpdate(), new UserDelete(), 
		};
		
		//1.  무한반복
		//2. 사용자에게 번호 입력받기, 1 입력받으면 crud[0]호출, 2 입력받으면 crud[1]호출, 3 입력받으면 crud[2]호출, 4 입력받으면 crud[3]호출
		// 	5 입력 받으면 종료
		int i = 0;
		for(;;) {
			System.out.print("\nMenu \n1.create \n2.read \n3.update \n4.Delete");
			System.out.print("\n번호를 입력해주세요 >> ");
			i = sc.nextInt();
			if (i == 5) { System.out.println("종료되었습니다."); break;}
			else {
					 if(i == 1) { controller = crud[0]; controller.exec(list); }
				else if(i == 2) { controller = crud[1]; controller.exec(list); }
				else if(i == 3) { controller = crud[2]; controller.exec(list); }
				else if(i == 4) { controller = crud[3]; controller.exec(list); }
			}
		}
		
		
		
		
		
	}//end main
}// end class
