package com.company.day005;

import java.util.Scanner;

public class minibank2 {
	public static void main(String[] args) {
		Object[][] user = { { "", "", "" },
							{ "", "", "" },
							{ "", "", "" } };
		
		String idCheck = "";
		String pwCheck = "";
		int money = 0;
		int pMoney = 0;
		int mMoney = 0;
		int idArea = -1;
		int ch = 0;
		int listNo = 0;

		while (listNo != 6) {
			try {
				Thread.sleep(500); // 지연시간 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("======bank======");
			System.out.println(" * 1. 추가 ");
			System.out.println(" * 2. 조회 ");
			System.out.println(" * 3. 입금 ");
			System.out.println(" * 4. 출금 ");
			System.out.println(" * 5. 삭제 ");
			System.out.println(" * 6. 종료 ");
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 >>> ");
			listNo = sc.nextInt();
			System.out.print("\n");
			if (listNo == 6) {
				System.out.println("종료되었습니다.");
				break;
			} else if (listNo == 1) {
				for (ch = 0; ch < user.length; ch++) { // dead code
					if (user[ch][0].equals("")) {
						System.out.println("======추가======");
						System.out.print("아이디 >> ");
						user[ch][0] = sc.next();
						System.out.print("비밀번호 >>");
						user[ch][1] = sc.next();
						System.out.print("나이 >>");
						user[ch][2] = sc.nextInt();
						System.out.print("금액 >>");
						money = sc.nextInt();
						System.out.println("입력이 완료되었습니다.");
					} else {
						System.out.println("");
						continue;
					}
					break;
				}
			} else {
				for (;;) { // #1. 무한 반복 
					int find = -1;
					System.out.print("아이디 >> ");
					idCheck = sc.next();
					for (ch = 0; ch < user.length; ch++) { // dead code
						if (user[ch][0].equals(idCheck)) { find = ch; break;  //찾았으면 나오기
							}}
					if (find != -1) {//#2. 빠져나올 조건
						break;} else {System.out.println("아이디를 정확하게 입력해주세요.");}}
					}
				for (;;) {
					int find = -1;
					System.out.print("비밀번호 >> ");
					pwCheck = sc.next();
					for (ch = 0; ch < user.length; ch++) {
						if (user[ch][1].equals(pwCheck)) {
							find = ch;
							break;
						}
					}
					if (find != -1) {break;}
					else {System.out.println("비밀번호를 정확하게 입력해주세요.");}
				}
				switch(listNo) {
				case 2 :
					System.out.println("현재 잔액은 >>" + money + "입니다.");
					listNo = 0;
					break;
				}
		}
	}
}