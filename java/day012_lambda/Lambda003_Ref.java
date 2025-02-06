package com.company.day012_lambda;

class Class3{void method(String str) {System.out.println(str);}}

interface Inter3{
	void inter(Class3 c, String str);
}


public class Lambda003_Ref {
	public static void main(String[] args) {
		//#1. 익명 클래스
		Inter3 a1 = new Inter3() {
			@Override public void inter(Class3 c, String str) { 
				c.method(str);
			} 
		};
		a1.inter(new Class3(), "CUT :P"); // 생성자 불러와서 초기화
		//#2. 람다
		Inter3 a2 = (Class3 c, String str) -> {c.method(str); };
		Inter3 a22 = (c, str) -> c.method(str);
		a2.inter(new Class3(), "Hello :)");
		a2.inter(new Class3(), ":(");
		//#3. ::표현식	( 참조 )
		Inter3 a3 = Class3::method;
		a3.inter(new Class3(), ":O");
	}
}
