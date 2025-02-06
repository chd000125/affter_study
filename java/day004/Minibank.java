package com.company.day004;

import java.util.Scanner;

public class Minibank {
	public static void main(String[] args) {
		// 1. dead code 생긴 이유.
		// 2. id 와 pw 가 맞는지 / user 배열에 값과 입력받은 값이 같은지 비교하는 것.
		Object [][] user = { { "", "", "", "" }, // id, pass, balance
				{ "", "", "", "" }, { "", "", "", "" } };

		String idCheck = "";
		String pwCheck = "";
		int pMoney = 0;
		int mMoney = 0;
		int idArea = -1;
		int ch = 0;

		for (;;) {
			try { Thread.sleep(500);} catch (InterruptedException e) { e.printStackTrace(); }

			System.out.println("======bank======");
			System.out.println(" * 1. 추가 ");
			System.out.println(" * 2. 조회 ");
			System.out.println(" * 3. 입금 ");
			System.out.println(" * 4. 출금 ");
			System.out.println(" * 5. 삭제 ");
			System.out.println(" * 6. 종료 ");

			Scanner sc = new Scanner(System.in);
			int listNo;

			System.out.print("입력 >>> ");
			listNo = sc.nextInt();
			System.out.print("\n");
			if (listNo == 6) {
				System.out.println("종료되었습니다.");
				break;
			}
			if (listNo == 1) {
				// 1. 빈칸검사 → user[0][0].equals("") / user[1][0].equals("") /
				// user[2][0].equals("") 빈칸인 찾은번호에
				// 2. 회원가입
				for (ch = 0; ch < user.length; ch++) { // dead code
					if (user[ch][0].equals("")) {
						System.out.println("======추가======");
						System.out.print("아이디 >> ");
						user[ch][0] = sc.next();
						System.out.print("비밀번호 >>");
						user[ch][1] = sc.next();
						System.out.print("나이 >>");
						user[ch][2] = sc.next();
						System.out.print("금액 >>");
						user[ch][3] = Integer.parseInt(sc.next());
						System.out.println("입력이 완료되었습니다.");
					} else {
						System.out.println("회원 수 초과");
						continue;
					}
					break;
				}
			} else {
				// 3. 찾은 id 번호(ch) 찾기
				// id 찾았을 때 나온다.

				for (;;) { // #1. 무한 반복
					int find = -1;
					System.out.print("아이디 >> ");
					idCheck = sc.next();
					for (ch = 0; ch < user.length; ch++) { // dead code
						if (user[ch][0].equals(idCheck)) {
							find = ch;
							break; // 찾았으면 나오기
						}
					}
					if (find != -1) {// #2. 빠져나올 조건
						break;
					} else {
						System.out.println("아이디를 정확하게 입력해주세요.");
					}
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
					if (find != -1) {
						break;
					} else {
						System.out.println("비밀번호를 정확하게 입력해주세요.");
					}
				}
				if (listNo == 2) {
					for (int ch1 = 0; ch1 < user.length; ch1++) {
						if (user[ch1][0].equals(idCheck)) {
							System.out.println("현재 잔액은 >>" + user[ch1][3] + "원 입니다.");
						}
					}
				} else if (listNo == 3) {
					System.out.print("입금 하실 금액을 적어주세요 >> ");
					pMoney = sc.nextInt();
					for (int ch1 = 0; ch1 < user.length; ch1++) {
						if (user[ch1][0].equals(idCheck)) {
							user[ch1][3] = String.valueOf((Integer.parseInt((String) user[ch1][3]) + pMoney));
							System.out.println("입금 후 잔액 : " + user[ch1][3]);
						}
					}
				} else if (listNo == 4) {
					for (;;) {
						int find = -1;
						System.out.print("출금 하실 금액을 적어주세요 >> ");
						mMoney = sc.nextInt();
						for (int ch1 = 0; ch1 < user.length; ch1++) {
							if (user[ch1][0].equals(idCheck)) {
							if (mMoney > Integer.parseInt((String) user[ch1][3])) {
								System.out.println("출금 금액이 현재 잔액" + user[ch1][3] + "원 보다 클 수 없습니다.");
								System.out.println(user[ch1][3] + "원 이하의 금액을 입력해주세요.");
							}else {
								user[ch1][3] = Integer.toString(Integer.parseInt((String) user[ch1][3]) - mMoney);
								System.out.println("출금 후 잔액 : " + user[ch1][3]);
								break;}
							find = ch1;	}
							}
						}
					
					}
				 else if (listNo == 5) {
					for (ch = 0; ch < user.length; ch++) {
						if (idArea == ch) {
							for (int i = 0; i < user[ch].length; i++) {
								user[ch][i] = "";
							}
						}
					}
					System.out.println("삭제가 완료 되었습니다.");
				}
			}
		}
}// main
}// class