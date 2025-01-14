package com.company.day001;
import java.util.Scanner;

public class A004 {
	public static void main(String[] args) {
		int age = 10;
		int year;
		int a;
		int b;
	System.out.print("당신의 나이는? >>");
	Scanner sc = new Scanner(System.in); //new Scanner : Scanner 의 새로운 메모리 할당해줘. System.in(키보드로 입력받기)
	age = sc.nextInt();
	System.out.println("당신의 나이는 "+age+"세 입니다");
	System.out.print("올해 년도를 입력해주세요 >> ");
	year = sc.nextInt();
	System.out.println("올해는 "+year+"년도 입니다.");
	System.out.print("숫자 1입력 >>");
	a = sc.nextInt();
	System.out.print("숫자 2 입력 >>");
	b = sc.nextInt();
	System.out.println(a+" + "+b+" = "+(a+b));
	}
}
