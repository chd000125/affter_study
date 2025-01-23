package com.company.day002;

import java.util.Scanner;

public class A004_ifTest {
	public static void main(String[] args) {
		int score =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요. >> ");
		score = sc.nextInt();
		if (score >= 60) {
			System.out.println(score +"합격");
		} else {System.out.println(score + "불합격");}
		
		int num;
		System.out.println("숫자를 입력하세요. >> ");
		num = sc.nextInt();
		String result ="zero";
		/*if(num > 0) {
			System.out.println(num+"은(는) 양수입니다.");
		} else if ( num == 0 ) {
			System.out.println(num+"은(는) 제로입니다.");
		} else if (num < 0 ) {
			System.out.println(num+"은(는) 음수입니다.");
		} else {System.out.println(num+"은(는) 양수,제로,음수가 아닙니다.");}
		*/
		
		if(num > 0) { result = "양수";}
		else if(num <0) { result = "음수";}
		System.out.println(result);
		
		
	}
}
