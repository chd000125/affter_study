package com.company.day001;

import java.util.Scanner;

public class A006_Ex1 {
	public static void main(String[] args) {
		int enum1 = 0, enum2 = 0;
		float result = 0.0f;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1 입력 >> ");
		enum1 = sc.nextInt();
		System.out.print("숫자 2 입력 >>");
		enum2 = sc.nextInt();
		result = ((float)enum1/enum2); //둘 중에 하나만 바꿔도 연산은 가능.
		System.out.println(enum1 + " / " + enum2 +" = " + result);
	}
}
