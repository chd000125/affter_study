package com.company.mini_step;

import java.util.ArrayList;
import java.util.Scanner;

// controller    상속도 확인하고 구현객체만들기 (~기능입니다)
/*
	<<interface>>  InfoProcess     (     void exec(Arraylist<Info> users)   )
		↑       ↑           ↑            ↑
 InfoCreate    InfoRead		InfoUpdate   InfoDelete
*/

public class Test002_controller {
	public static void main(String[] args) {
		// model
		//ArrayList<Info> list = new ArrayList<>();  System.out.println(list);
		// controller
		//Q1.  interface / class 구현객체  - ~기능입니다. 출력
		//		InfoProcess  controller = null;
		//		controller =  new InfoCreate();  controller.exec(list);
		//		controller =  new InfoRead();    controller.exec(list);
		//		controller =  new InfoUpdate();  controller.exec(list);
		//		controller =  new InfoDelete();  controller.exec(list);
		
		//Q2.  무한반복 메뉴판  1. 이메일등록  2.확인  3.수정  4.삭제  5.종료
		//ver-1
		/*
		Scanner scanner = new Scanner(System.in);
		InfoProcess  controller = null;
		int menu=-1;
		for(;;) {
			System.out.println("\n\n:::::\n1. 등록\n2. 조회\n3. 수정\n4. 삭제\n5. 종료");
			menu = scanner.nextInt();
			if(menu==5) { break; }
			// switch 이용해서 각번호에 해당하는  controller 호출하기 
			switch(menu) {
			case 1 : controller =  new InfoCreate();  controller.exec(list); break;
			case 2 : controller =  new InfoRead();    controller.exec(list); break;
			case 3 : controller =  new InfoUpdate();  controller.exec(list); break;
			case 4 : controller =  new InfoDelete();  controller.exec(list); break;
			}
		} */
		//ver-2
		/*
		Scanner scanner = new Scanner(System.in);
		InfoProcess  controller = null;
		InfoProcess  [] crud = {new InfoCreate() , new InfoRead() , new InfoUpdate() , new InfoDelete()};
		int menu=-1;
		for(;;) {
			System.out.println("\n\n:::::\n1. 등록\n2. 조회\n3. 수정\n4. 삭제\n5. 종료");
			menu = scanner.nextInt();
			if(menu==5) { break; }
			// switch 이용해서 각번호에 해당하는  controller 호출하기 
			switch(menu) {
			case 1 : controller =  crud[0];  controller.exec(list); break;
			case 2 : controller =  crud[1];  controller.exec(list); break;
			case 3 : controller =  crud[2];  controller.exec(list); break;
			case 4 : controller =  crud[3];  controller.exec(list); break;
			}
		} */
		//ver-3
		// model
		ArrayList<Info> list = new ArrayList<>();  System.out.println(list);
		Scanner scanner = new Scanner(System.in);
		InfoProcess  controller = null;
		InfoProcess  [] crud = {new InfoCreate() , new InfoRead() , new InfoUpdate() , new InfoDelete()};
		int menu=-1;
		for(;;) {
			System.out.println("\n\n:::::\n1. 등록\n2. 조회\n3. 수정\n4. 삭제\n5. 종료");
			menu = scanner.nextInt();
			if(menu==5) { break; }
			// switch 이용해서 각번호에 해당하는  controller 호출하기 
			controller =  crud[menu-1];  controller.exec(list);
		} 
	
	} // end main
}// end class

interface InfoProcess{  void exec( ArrayList<Info> users );    }

class InfoCreate implements InfoProcess {
	@Override public void exec(ArrayList<Info> users) {
		System.out.println("1. 등록기능입니다.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("이메일입력 > ");
		users.add( new Info(scanner.next()) );
		//list.add(  new Info("aaa@gmail.com") );
		//System.out.println("............. 확인 >" + users);
	}// end exec
}// end class

class InfoRead implements InfoProcess {
	@Override
	public void exec(ArrayList<Info> users) {
		System.out.println("2. 조회기능입니다.");
		for( Info u  : users) { System.out.println(u); }
	}
}

class InfoUpdate implements InfoProcess {
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

class InfoDelete implements InfoProcess {
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







