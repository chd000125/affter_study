package com.company.day008;
// Object 를 각각 상속 받으면 다른 자료형이 됨.
//	 ↑
//  TestA2 ( int a / toString )
//	 ↑
//  TestB2 ( int a / toString )
class TestA2 extends Object{
	int a = 10;
	@Override public String toString() { return "TestA2 [a=" + a + "]"; } 
}
class TestB2 extends TestA2{
	int b = 20;
	@Override public String toString() { return super.toString() + "TestB2 [b=" + b + "]"; } 
} 

public class Polymorphism002 {
	public static void main(String[] args) {
		TestA2 ta = new TestA2();	// 본인 = new 본인()
		// 1-1. 사용할 수 있어야 하는 범위 TestA2(int a)
		// 1-2. ta[1000번지] 	= [1000번지] TestA2{ a = 10 }
		System.out.println(ta); // TestA2 [a = 10]
			   ta = new TestB2();	// 부모 = new 자식() => 누가 부모이고 누가 자식인지 체크하기.
		// 2-1. 사용할 수 있어야 하는 범위 TestA2 (int a)
		// 2-2. ta[] = [2000번지] TestB2{ b = 20 / toString 사용가능 }--TestA2{ a = 10 / toString } => 타입캐스팅
		// 2-3. ta(부모자료형) = 자식생성자
			   System.out.println(ta); // TestB2 [a = 20]
		
		TestB2 tb = (TestB2) ta;
		// 3-1. TestB2 tb 사용할수있는 범위 TestB2{ b = 20 / toString 사용가능 }--TestA2{ a = 10 / toString }
		// 3-2. 실제로 만들어진 객체
		// 3-3.자식 = 부모 / 다운캐스팅 / 타입캐스팅 O
		System.out.println(tb);
		
	}
}
