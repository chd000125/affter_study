package com.company.day009;
//1. 클래스는 부품객체
//2. 부품객체 상태 + 행위
// 인터페이스 상태 ( 멤버 변수 ) : public static final ( 상수 )
// 인터페이스 행위 ( 멤버 함수 ) : public abstract	: {} 구현부가 없음.
// abstract 클래스보다 추상화 정도가 높다.
interface Animal{
	String NAME = "홍길동"; // static final 이 자동으로 붙음. => method area, new 보다 먼저 메모리상에 올라가있다.
	void eat(); // abstract 가 자동으로 붙음. => 구현부('{}')가 없으므로 new 못함.
}
class Human implements Animal{ // extends(확장) => 인스턴스화 | implements(구현)
	@Override public void eat() {System.out.println("밥먹기");}
}
class Pig implements Animal{
 @Override public void eat() {System.out.println("꿀꿀");} 
}
public class Interface001 {
 public static void main(String[] args) {
	 //Animal ani = new Animal(); 
	 System.out.println(Animal.NAME);
	 Animal [] ani = {new Human(), new Human(), new Pig(), new Pig()};
	 for  (Animal a : ani) { a.eat(); }
 }
}
