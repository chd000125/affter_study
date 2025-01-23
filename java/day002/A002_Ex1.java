package com.company.day002;

public class A002_Ex1 {
	public static void main(String[] args) {
		 int a = 10;
		 System.out.println(a%2==0);
		 System.out.println(a%3==0);
	
		 int x = 0; char ch = '\u0000' ;
		 x = 5;
		 System.out.println("1: " + (3<x && x<10));
		 ch ='A';
		 System.out.println("2: " +(ch=='a'|| ch=='A'));
		 ch = '3';
		 System.out.println("3: " +('0' <= ch && ch <= '9'));
		 ch = 'C';
		 System.out.println("4: " +(ch >='A' && ch <= 'Z' || ch>='a' && ch <='z'));
		 // &&가 ||보다 우선순위가 높음.
	}
}
