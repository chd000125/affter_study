package com.company.day009;

interface Inter1 { void method(); } // public abstract
class Inter1Impl implements Inter1{
	@Override public void method() { 
		System.out.println("...... done!");
	} 
}

public class NoNameClass001 {
public static void main(String[] args) {
	System.out.println("1. 인터페이스 상속구현 객체");
	Inter1Impl a1 = new Inter1Impl(); a1.method();
	System.out.println("2. 익명 이너클래스");
	//Inter1 a2 = new Inter1();  -> 불가능 => void method();의 구현내용({})이 없어서 불가능.
	Inter1 a2 = new Inter1() {// 테스트 or 잘안쓰거나 소량의 이벤트 횟수

		@Override public void method() { 
			System.out.println("........ test");
		} 
	};	a2.method();
}
}
