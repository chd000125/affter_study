package com.company.day008;
// Object 를 각각 상속 받으면 다른 자료형이 됨.

//		Object			Object
//		  ↑				  ↑
//		TestA			TestB

class TestA extends Object{
	int a = 10;
}
class TestB extends Object{
	int a = 20;
} 

public class Polymorphism001 {
	public static void main(String[] args) {
		TestA v110 = new TestA();
		//TestB v220 = v110; // 자료형이 다름. TestA != TestB
		// 클래스도 자료형(틀 -Object)
		// Type mismatch cannot convert from TestA to TestB
	}
}
