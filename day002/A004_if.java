package com.company.day002;

public class A004_if {
	public static void main(String[] args) {
		//1. 1형식 - 무조건 조건 읽음. -> if(조건) {조건이 맞으면 처리}
		int a = 1;
		if (a == 0) { System.out.println("a는 0이다."); } // a==0을 처리했는지 확인 불가능.
		if (a == 1) { System.out.println("a는 1이다."); } 
		
		//2. 2형식 - 맞다/틀리다 else뒤에 조건 못 옴.
		if (a==1) {System.out.println("\n\n1이다");}
		else {System.out.println("1이 아니다.");}
		//3. 3형식 - 여러조건
		if (a==1) {System.out.println("\n\n1이다");}
		else if (a==2) {System.out.println("2이다.");}
		else if (a==2) {System.out.println("3이다.");}
		else {System.out.println("1,2,3이 아니다.");}
}
}
