package com.company.day008;

// Q1. 상속도 그리기
// 	Object ← Papa ← Son2
// Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드
// Papa - money, sing | Son2 - sing money
class Papa extends Object{  
	int money = 10000;     
	public Papa() { super(); }
	public void sing() {  System.out.println("GOD-거짓말");  }
}// end class

class Son2 extends Papa{ 
	int money = 1500;
	public Son2() { super(); }
	@Override public void sing() { System.out.println("빅뱅-거짓말"); }
} // end class
public class Polymorphism005 {
	public static void main(String[] args) {
		Papa mypapa = new Son2();    
		// Q3. Papa mypapa 의미? 부모클래스에 자식 클래스 불러오기 {money 10000, sing() GOD - 거짓말 } 보장.
		// Q4. 인스턴스화한 실제 메모리 빌려온그림
		// mypapa [1000번지] <- money , Son2.money, Son2.sing
		System.out.println(mypapa.money); // Q5.  출력 10000
		mypapa.sing();  //Q6. 출력 빅뱅 - 거짓말
		 //Q7. mypapa.money 를 이용해서  1500 출력되게 해주세요.
		System.out.println(((Son2)mypapa).money);
	}
}
