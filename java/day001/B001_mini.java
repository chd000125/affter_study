package com.company.day001;
import java.util.Scanner;

public class B001_mini {
	public static void main(String[] args) {
		Object [][] user = {
				  {  "" , "" , "" } ,   // id, pass, balance 
				  {  "" , "" , "" } , 
				  {  "" , "" , "" } };
		String id = ""; //아이디
		String pw = ""; //비밀번호
		int age = 0; // 나이
		int money = 0; //금액
		String idCheck = "";
		String pwCheck = "";
		int mMoney =0;
		
		
		for (;;) {
		try {
			Thread.sleep(1000);
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
		if (listNo == 1) {
			System.out.println("======추가======");
			System.out.print("아이디 >> ");
			user[][] = sc.next();
			System.out.print("비밀번호 >>");
			user[][] = sc.next();
			System.out.print("나이 >>");
			age = sc.nextInt();
			System.out.print("금액 >>");
			money = sc.nextInt();
			System.out.println("입력이 완료되었습니다.");
			continue;
		}
		else if(listNo == 2) {
			for (;;) {
			System.out.print("아이디 >> ");
			idCheck = sc.next();
			if(!(idCheck.equals(user[][]))) {
				System.out.println("아이디를 정확하게 입력해주세요.");
				continue;} break; }
			for (;;) {
			System.out.print("비밀번호 >> ");
			pwCheck = sc.next();
			if (!(pwCheck.equals(user[][]))) {
				System.out.println("비밀번호를 정확하게 입력해주세요.");
				continue;} break; }
			if ((pwCheck.equals(pw)) && (idCheck.equals(id))) {
				System.out.println(id+"님의 현재 잔액은 >>"+money+"입니다.");
			}
       }
		else if(listNo == 3) {
			for (;;) {
				System.out.print("아이디 >> ");
				idCheck = sc.next();
				if(!(idCheck.equals(id))) {
					System.out.println("아이디를 정확하게 입력해주세요.");
					continue;} break; }
				for (;;) {
				System.out.print("비밀번호 >> ");
				pwCheck = sc.next();
				if (!(pwCheck.equals(pw))) {
					System.out.println("비밀번호를 정확하게 입력해주세요.");
					continue;} break; }
				if ((pwCheck.equals(pw)) && (idCheck.equals(id))) {
					System.out.print("입금 하실 금액을 적어주세요 >> ");
					money = money + sc.nextInt();
					System.out.println("입금 후 잔액 : "+money);
				}
       }
		else if (listNo == 4) {
			for (;;) {
				System.out.print("아이디 >> ");
				idCheck = sc.next();
				if(!(idCheck.equals(id))) {
					System.out.println("아이디를 정확하게 입력해주세요.");
					continue;} break; }
				for (;;) {
				System.out.print("비밀번호 >> ");
				pwCheck = sc.next();
				if (!(pwCheck.equals(pw))) {
					System.out.println("비밀번호를 정확하게 입력해주세요.");
					continue;} break; }
				if ((pwCheck.equals(pw)) && (idCheck.equals(id))) {
					for (;;) {
					System.out.print("출금 하실 금액을 적어주세요 >> ");
					mMoney = sc.nextInt();
					if (mMoney > money) {
						System.out.println("출금 금액이 현재 잔액보다 클 수 없습니다. 다시 입력해주세요."); continue;}
					else {money = money - mMoney;
					System.out.println("출금 후 잔액 : "+money);
					}break;}}
		}
			else if (listNo == 5) {
				id = "";
				pw = "";
				age = 0;
				money = 0; 
				idCheck = "";
				pwCheck = "";
				mMoney =0;
				System.out.println("삭제가 완료 되었습니다.");
			}
			else if (listNo == 6) {
				System.out.println("종료되었습니다.");
				break;}
		}
		}
     }

