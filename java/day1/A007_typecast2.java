package com.company.day001;

public class A007_typecast2 {
	public static void main(String[] args) {
		int in =10;
		double dou=1.2;
		double result = in + dou;
		int result2 = in + (int)dou;
		
		byte a = 10; byte b = 20;
		byte c1 =(byte)(a+b); // [] = [|||] + [|||]
		int c2 = a+b;
		//int 보다 작은 자료형은 연산시 int 로 자동변환
	}
	
}
