package com.company.day004;

import java.util.Scanner;

public class A001_yesterday {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			System.out.print("Hello"+i+"\t");
		}
		Scanner sc = new Scanner(System.in);
		int a = 0;
		for (;;) {
		System.out.print("1,2,3중에 입력해주세요. >> ");
		a = sc.nextInt();
		if(a==1) {
			System.out.println("1이다.");
			break;
		} else if (a == 2) {
			System.out.println("2이다.");
			break;
		} else if (a == 3) {
			System.out.println("3이다.");
			break;
		} else {continue;}
	}
		for (;;) {
			System.out.print("123중에 입력해주세요. >");
			a = sc.nextInt();
			switch(a) {
			case 1 :
				System.out.println("1이다.");
				break;
			case 2 :
				System.out.println("2이다.");
				break;
			case 3 :
				System.out.println("3이다.");
				break;
			default : continue; 
			}
			break;
		}
		for(;;) {
			System.out.print("1을 입력해주세요. >> ");
			a = sc.nextInt();
			if (a == 1) {
				System.out.println("성공");
				break;
			}else {continue;}
		}
  }
}
