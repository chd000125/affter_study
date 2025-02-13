package com.company.javaportfolio;

import java.util.ArrayList;
import java.util.Scanner;

public class GoldController {
	public static void main(String[] args) {
		// 저장소 1개
		ArrayList<GoldUser>  list = new ArrayList<>();
		GoldProcess controller = null;
		GoldProcess [] crud = {new GoldCreate(),   new  GoldRead(),   new  GoldUpdate(),   new  GoldDelete(), new pGold(), new mGold()};
		
		//controller = crud[0]; controller.exec(list); //GoldCreate
		//controller = crud[1]; controller.exec(list); //GoldRead
		
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {//1. 무한 반복
				//2. 빠져나오는 조건
			System.out.println(list);
			System.out.println("\n\n:::::\n1. 등록\n2. 조회\n3. 수정\n4. 삭제\n5. 입금\n6. 출금\n9. 종료");
			int num = scanner.nextInt();
			if (num == 9) {break;}
			else {controller = crud[num-1]; controller.exec(list);}
		}
	}
}
//controller    
/*
	<<interface>>  GoldProcess     (     void exec(Arraylist<Info> users)   )
		↑       ↑           ↑            ↑
GoldCreate    GoldRead		GoldUpdate   GoldDelete
*/