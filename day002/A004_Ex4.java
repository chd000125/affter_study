package com.company.day002;

import java.util.Scanner;

public class A004_Ex4 {
	public static void main() {
		int num;
		String result = "1,2,3이 아니다.";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1,2,3 중 좋아하는 숫자를 입력해주세요. >> ");
		num = sc.nextInt();
		
		if (num == 1) {result="one";}
		else if (num==2) {result="two";}
		else if (num==3) {result="three";}
		
		System.out.println(result);
	}
}
