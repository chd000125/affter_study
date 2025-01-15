package com.company.day005;

import java.util.Scanner;

public class minibank2 {
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// 1. dead code 생긴 이유.
		// 2. id 와 pw 가 맞는지 / user 배열에 값과 입력받은 값이 같은지 비교하는 것.
		String[][] user = { { "", "", "" }, // id, pass, balance
				{ "", "", "" }, { "", "", "" } };

		int age = 0; // 나이
		int money = 0; // 금액
		String idCheck = "";
		String pwCheck = "";
		int mMoney = 0;

		for (;;) {
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
				for (int ch = 0; ch < user.length; ch++) { // dead code
					if (user[ch][0].equals("")) {
						System.out.println("======추가======");
						System.out.print("아이디 >> ");
						user[ch][0] = sc.next();
						System.out.print("비밀번호 >>");
						user[ch][1] = sc.next();
						System.out.print("나이 >>");
						age = sc.nextInt();
						System.out.print("금액 >>");
						money = sc.nextInt();
						System.out.println("입력이 완료되었습니다.");
					} else {
						System.out.println("회원 수 초과");
						continue;
					}
					break;
				}
			} else {
				//3. 찾은 id 번호(ch) 찾기
				for (;;) {
					System.out.print("아이디 >> ");
					idCheck = sc.next();
					for (int ch = 0; ch < user.length; ch++) { // dead code
						if (!(user[ch][0].equals(idCheck))) { // user 배열에 값과 입력받은 idCheck값을 같은지 비교하는 것.
							System.out.println("아이디를 정확하게 입력해주세요.");
							continue;
						}

						System.out.print("비밀번호 >> ");
						pwCheck = sc.next();
						if (!(user[ch][1].equals(pwCheck))) {
							System.out.println("비밀번호를 정확하게 입력해주세요.");
							continue;
						}
						break;
					}
					break;
				}

				if (listNo == 2) {
					System.out.println("현재 잔액은 >>" + money + "입니다.");

				} else if (listNo == 3) {
					System.out.print("입금 하실 금액을 적어주세요 >> ");
					money = money + sc.nextInt();
					System.out.println("입금 후 잔액 : " + money);

				} else if (listNo == 4) {
					for (;;) {
						System.out.print("출금 하실 금액을 적어주세요 >> ");
						mMoney = sc.nextInt();
						if (mMoney > money) {
							System.out.println("출금 금액이 현재 잔액보다 클 수 없습니다. 다시 입력해주세요.");
							continue;
						} else {
							money = money - mMoney;
							System.out.println("출금 후 잔액 : " + money);
						}
						break;
					}
				} else if (listNo == 5) {
					// 1. ""
					age = 0;
					money = 0;
					System.out.println("삭제가 완료 되었습니다.");
				}
			}
		}
	}
}
