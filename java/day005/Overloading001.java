package com.company.day005;

public class Overloading001 {

	public static void hi() {
		System.out.print("hi");
	}

	public static void hi(String b) {
		System.out.println("hi" + b);
	}

	public static String hi1(String a) {
		return hi() + "!";
	}

	public static void main(String[] args) {
		// 메서드 기본구조
		// public static 리턴값 메서드명(파라미터){ 처리 }
		// public static String hi() {System.out.print("hi");}

		hi();

		// public static void hi (String a) {System.out.println("hi" +a);}
		hi("sally");
		hi("alpha");

		System.out.println("Good morning~!" + hi1("buja"));
	}

	/*
	 	메서드 오버로딩?
	 	1. 같은 목적으로 비슷한 동작을 수행하는 메소드들의 이름을 같게 만드는 작업
	 	2. 같은이름 (파라미터 타입, 갯수)
	 */
	int add(int x, int y) {
		return x + y;
	}

	int add(byte a, byte b) {return a + b;} 	// a O
	int add(short a, short b) {return a + b;}	// b O
	long add (long a, long b) {return a+b;} 	// 
	// long add (int a, int b) {return a+b;}	// c X
}
