package com.company.day008;

class Grand extends Object{public void one() {
	System.out.println("Grand:one");
} public void two() {
	System.out.println("Grand:two");
}}
class Aunt extends Object{ String name = "Mimi";
	@Override public String toString() { return name + " = 옆집 이모 클래스"; } }
class Father extends Grand{public void three() {
	System.out.println("Father : three");
}}
class Uncle extends Grand{public void four() {
	System.out.println("Uncle:four");
} public void one() {
	System.out.println("Uncle:one");
} public void two() {
	System.out.println("Uncle:two");
}}

public class Extends004 {
	public static void main(String[] args) {
		Father father = new Father(); father.three(); father.two(); father.one();
		
		System.out.println();
		System.out.println();
		
		Uncle uncle = new Uncle(); uncle.four(); uncle.two(); uncle.one();
		// Override - 부모 클래스와 같은 메서드 재정
		// extends - 부모와 같은 메서드
		// Override 우선순위 - 자식메서드(내꺼)
		
		Aunt aunt = new Aunt();
		System.out.println(aunt);
	}
}
