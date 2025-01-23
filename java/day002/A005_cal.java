package com.company.day002;

import java.util.Scanner;

public class A005_cal {
	public static void main(String[] args) {
		double a = 0.0, b = 0.0, result = 0.0;
		char m = '\u0000';
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력해주세요. >> ");
		a = sc.nextDouble();
		System.out.print("두번째 숫자를 입력해주세요. >> ");
		b = sc.nextDouble();
		System.out.print("+, -, /, *, % 중 연산자를 골라주세요. >>");
		m = sc.next().charAt(0); 
		
		if (m == '+' ) { result = a+b; }
		else if (m == '-') { result = a-b;}
		else if (m == '*') { result = a*b;}
		else if (m == '/') { result = a/b;}
		else if (m == '%') { result = a%b;}
		
		System.out.println(result);
	}
}
