package com.company.day010;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// controller
/*
	<<interface>> InfoProcess (void exec( Arraylist<Info> users)
	↑		↑		↑		↑
  Create   Read	  Update  Delete
*/
interface InfoProcess {
	void exec(List<Info> list);
}

class InfoCreate implements InfoProcess {
	@Override
	public void exec(List<Info> users) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 이메일 등록");
		System.out.println("등록할 이메일 입력 > ");
		users.add(new Info(sc.next()));
	}
}

class InfoRead implements InfoProcess {
	@Override
	public void exec(List<Info> users) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2. 조회");
		for (Info u : users) {
			System.out.println(u);
		}
	}
}

class InfoUpdate implements InfoProcess {
	@Override
	public void exec(List<Info> users) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3. 수정");
			System.out.println("수정할 번호 입력. >> "); int i = sc.nextInt();
				System.out.println("변경할 이메일 입력 >> "); String email = sc.next();
				users.get(i-1).setEmail(email);
	}
}

class InfoDelete implements InfoProcess {
	@Override
	public void exec(List<Info> users) {
		Scanner sc = new Scanner(System.in);
		System.out.println("4. 삭제");
			System.out.println("삭제할 번호 입력. >> "); int find = sc.nextInt();
			Info finduser = null; // 삭제번호와 사용자의 번호가 같으면 객체 담기
			for (Info u : users) {if(find == u.getNo() ) {finduser = u; break;} }
			users.remove(finduser);	 // 그 객체 삭제하기.
	}
}

public class Test002_controller {
	public static void main(String[] args) {
		List<Info> list = new ArrayList<>();

		// controller
		// 1. interface / class 구현 객체
		InfoProcess controller = null;
		InfoProcess[] crud = { new InfoCreate(), new InfoRead(), new InfoUpdate(), new InfoDelete() };

		Scanner sc = new Scanner(System.in);
		int me = -1;
		for (;;) {
			System.out.println("\n\n:::::::\n1. 등록\n2. 조회\n3. 수정\n4. 삭제\n5. 종료");
			me = sc.nextInt();
			if (me == 5) {
				break;
			} else {
				controller = crud[me - 1];
				controller.exec(list);
			}
		}
	}

}

//2. 무한 반복 메뉴판
/*
 * Scanner sc = new Scanner(System.in); int menu = -1; for (;;) {
 * System.out.println("\n\n:::::::\n1. 등록\n2. 조회\n3. 수정\n4. 삭제\n5. 종료"); menu =
 * sc.nextInt(); if (menu == 5) {break;} else { switch (menu) { case 1:
 * controller = crud[0]; controller.exec(list); break; case 2: controller =
 * crud[1]; controller.exec(list); break; case 3: controller = crud[2];
 * controller.exec(list); break; case 4: controller = crud[3];
 * controller.exec(list); break; default : continue; } }
 */
