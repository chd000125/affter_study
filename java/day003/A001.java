package com.company.day003;

import java.util.Scanner;

public class A001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char i = '\u0000';
		
		System.out.print("a,b,c중 한개의 문자를 입력하시오. >> ");
		i = sc.next().charAt(0);
		
		if (i == 'a' || i == 'A') {System.out.println("apple이다.");}
		else if (i == 'b' || i == 'B') {System.out.println("banana이다.");}
		else if (i == 'c' || i == 'C') {System.out.println("coconut이다.");}
		else {System.out.println("a,b,c중에 입력해주세요.");}
		
		System.out.print("a,b,c중 한개의 문자를 입력하시오. >> ");
		i = sc.next().charAt(0);
		switch(i) {
		case 'a' :
		case 'A' : System.out.println("apple이다."); break;
		case 'b' :
		case 'B' : System.out.println("Banana이다."); break;
		case 'c' :
		case 'C' : System.out.println("Coconut이다."); break;
		default : System.out.println("a,b,c중에서 입력해주세요."); break;
		}
	}
}
