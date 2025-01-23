package com.company.day009;

public class Exception002 {
	public static void main(String[] args) {
		 try { // 에러가 나도 프로그램이 멈추지 않음.
			 System.out.println(10/0); 
		 }catch(ArithmeticException e) {System.out.println("관리자에게 문의");}
	
	// 2) 그래도 귀찮다면
	try {
		System.out.println(10/0);
	}catch(Exception e) {System.out.println("관리자에게 문의");}
	}
}

/*
	1. 에러 복사 java.lang.ArithmeticException -> 어떤 Exception 인지
	2. 에러가 난 줄 수 보기.
	
	System.out.println(10/0);
	=> 에러 복사 / 그 줄 수에 가서 try { 에러 날 만한 내용 }catch(에러내용 e) { 에러 발생 시 처리 }

*/