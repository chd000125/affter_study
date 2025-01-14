package com.company.day002;

import java.util.Scanner;

public class A006 {
	public static void main(String[] args) {
		int a = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한개 입력받기 >> ");
		a = sc.nextInt();
		
		switch(a) { //switch(대상)
		case 1 : result = "1이다."; break;
		case 2 : result = "2이다."; break;
		case 3 : result = "3이다."; break;
		default : result = "1,2,3이 아니다.";
		}
		System.out.println(result);
	}
	
}
