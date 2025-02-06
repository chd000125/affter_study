package com.company.day012_lambda;

interface Inter4{ int method(int a, int b);}
interface Inter44{ int method(String str);}
interface Inter444{ void method(int num);}

public class Lambda004 {
	public static void main(String[] args) {
		//#1. Inter4 호출하면 Math.max(a,b) 큰값처리
		Inter4 a1 = (a,b) -> {return Math.max(a, b);};
		System.out.println(a1.method(10, 3));
		
		Inter4 a3 = Math::max;
		System.out.println(a3.method(10, 3));
		
		Inter44 a4 = str -> str.length();
		System.out.println(a4.method("ABC"));
		
		Inter44 a5 = String::length;
		System.out.println(a5.method("ABCDEFGHIJK"));
		
		Inter444 a6 = System.out::println;
		a6.method(100);
		
	}
}
