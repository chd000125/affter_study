package com.company.day012_lambda;

//1. 클래스 부품객체	interface(설계도)
//2. 상태 + 행위		interface ( public static final / public abstract )
//3. 코드 간결하게

interface Inter1 { void method(); }

class Inter1Impl implements Inter1 {
	@Override public void method() { System.out.println("Hello :D"); }
}// end class

public class Lambda001 {
	public static void main(String[] args) {
		// #1. interface 구현객체 만들기
		Inter1 a1 = new Inter1Impl();
		a1.method();

		Inter1 a2 = new Inter1() {
			@Override public void method() { 
				System.out.println("hello :D :D");
			}//end method
		}; // end new Inter1
		a2.method();
		// #3. lambda  = 어떤거를 받아서 어떻게 처리하는지를 궁금.
		Inter1 a3 = ()->{
			System.out.println("hello :D :D :D");
		}; // == Inter1 a2 = new Inter1(){@Override public void method(){}}
		a3.method();
	}// end main
}// end class
