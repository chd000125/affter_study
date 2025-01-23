package com.company.day002;

public class A001 {
	public static void main(String[] args) {
		char ch = '\u0000'; // ' ' 유니코드
		ch = 'A'; // 문자형은 저장시 숫자로 저장, 출력시 숫자를 문자로 출력
		// 많이 쓰는 표현 방법 문자 != 문자열
		int a = 10, b = 3; char op = '+';
		System.out.println("" + a + op + b + "=" + (a+b));
		
	}
}
