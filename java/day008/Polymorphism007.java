package com.company.day008;
/*
	Q1. 상속도 Object <- Parent7 <- Child7
	Q2. 사용가능한 멤버 변수/ 멤버 함수 Parent7 = int x, method() Child = int x, method()
 * */
class Parent7 {
	int x =100;
	void method() {System.out.println("Parent Method");}
}
class Child7 extends Parent7 {
	int x =200;
	void method() {System.out.println("Child Method");}
}

public class Polymorphism007 {
	public static void main(String[] args) {
		Parent7 p = new Child7(); // Q3. parent7 p	보장하는 범위 parent7 의 int x, method
		//Q4. 인스턴스화 했을 때 사용가능한 범위 : new Child7() int x method | prent7 int x
		//Q5. 부모,자식 / 업/다운 캐스팅 / 타입캐스팅 필요여부
		// 		부모가 자식 불러오기 업캐스팅 타입캐스팅X
		Child7 c = new Child7();
		System.out.println("p.x = " + p.x); // Q5. 출력되는 내용 100
		p.method(); //Q6. 출력되는 내용 Child Method
		System.out.println("c.x = "+c.x); // Q7. 출력되는 내용 200
		c.method(); // Q8. 출력되는 내용 Child Method
	}
}
