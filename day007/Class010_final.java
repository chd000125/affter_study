package com.company.day007;

class FinalEx extends Object{ // extends Object 가 생략되어있음. => class 클래스명 extends Object
	// 1) 상수 : 변하지 않는 값 => 기본값, 
	final static String XMAS = "12.25";
	String name;
	// 2) 메서드에 붙으면 상속 받는 자식이 오버라이드 할 수 없음.
	// 자식이 부모가 가진 메서드를 가져다가 개조해서 맞게 사용 -> 상속
	final void show() { // final 을 붙이면 상속이 불가능.
	//void show() {	
		System.out.println(XMAS + " / " + name);
	}
	
	public FinalEx() {
		super();
	}
}
//final 이 붙으면 class 도 상속이 불가능.
class Son2 extends FinalEx{}


public class Class010_final {
	public static void main(String[] args) {
		FinalEx f1 = new FinalEx();
		f1.name="예수님 탄생일";
		f1.show();
		// f1.XMAS = "01.17"; => cannot be assigned : 수정 못함.
	}
}
