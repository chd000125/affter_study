package com.company.day007;

class AnimalFarm {
	String name;
	int age;
	static String Company = "(주) 동물농장";
	static int num = 10;
	static String boss;
	static String location;
	static {boss = "신동엽"; location = "여의도";}
	
	static void num_plus() { num++; }
	void show() {
		System.out.println(":: 회사명 : " + AnimalFarm.Company);
		System.out.println(":: 식구수 : " + AnimalFarm.num);
		System.out.println(":: 이름 : " + AnimalFarm.this.name);
		System.out.println(":: 나이 : " + AnimalFarm.this.age);
		}
}
/*
 	1) static 클래스변수/클래스 메서드
 	2) instance 인스턴스 변수 / 인스턴스 메서드
*/


public class Class009_static {
	public static void main(String[] args) {
		AnimalFarm cat = new AnimalFarm();
		cat.name = "sss"; cat.age =10;  cat.show();
		System.out.println();
		AnimalFarm.num_plus(); // new X -> method Area에 올라가있음 - static 사용
		cat.show();
		
		
	}
}
