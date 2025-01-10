package com.company.day001;

public class A002_basic {
	public static void main(String[] args) {
		//System.out.print -> 줄 바꿈 불가능.
		//System.out.println -> 줄 바꿈 가능.
		System.out.println("one");
		System.out.println("two");
		//출력 서식
		System.out.printf("%d, %f, %s",1, 1.23, "Hello" ); //% -> 출력형식, %의 갯수 많큼 | %d -정수 | %f -실수 | %s -문자열 |
	}
	public static void B002(String[] args) {
		System.out.println("좋아하는 색상은 RED 입니다.");
	}
}
