package com.company.day008;
// Object 를 각각 상속 받으면 다른 자료형이 됨.
//	 ↑
//  TestA2 ( int a / toString )
//	 ↑
//  TestB2 ( int a / toString )
class TestA3 extends Object{
	int a = 10;
	@Override public String toString() { return "TestA3 [a=" + a + "]"; } 
}
class TestB3 extends TestA3{
	int b = 20;
	@Override public String toString() { return super.toString() + "TestB3 [b=" + b + "]"; } 
} 

public class Polymorphism003 {
	public static void main(String[] args) {
		TestA3 ta = new TestA3();
		System.out.println(ta);
			   ta = new TestB3();
		System.out.println(ta);
		TestB3 tb = (TestB3) ta;
		System.out.println(tb);
		
	}
}
