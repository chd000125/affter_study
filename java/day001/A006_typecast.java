package com.company.day001;

public class A006_typecast {
	public static void main(String[] args) {
		int i = 1;
		float f = 1f;
		
		i = (int) f;
		System.out.println(i);
		System.out.println(f);
		
		//Q1. System.out.println(1.5 + 2.7);
		System.out.println((int)1.5 + (int)2.7);// 결과 -> 3
		
		//Q2. 오류코드
		byte b = 1;
		short s = 2;
		int i2 = 4;
		long l = 8L; //자릿수 10개가 넘어가면 long을 사용하며, float처럼 값 옆에 L을 붙인다.
		
		boolean b1 = true; //논리형 1byte true/false
		
		float f2 = 4.4f;
		double d = 8.8;

		// b1 = b; //2-1. boolean 빼고 형변환 가능
		   i2 = b; //2-2. i2(정수형-int-4byte) = b(정수형 - byte - 1byte)
		// i2 = l; //2-3. i2(정수형-int-4byte) = l(정수형 - long - 8byte)
		// f2 = l; //2-4. f2(실수형-float-4byte) = l(정수형 - long - 8byte)
	}
}
