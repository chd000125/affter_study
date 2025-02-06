package com.company.day005;

import java.util.Scanner;

//1. 클래스는 부품객체
//2. 클래스는 속성 + 행위(기능)

class Animal001{
	// 속성 - 멤버 변수
	int age;
	String name;
	
	// 행위 - 멤버 함수
	void input() { // public static 을 붙이면 전부 다 사전에 로딩하기 때문에 프로그램이 무거워짐.
		Scanner sc = new Scanner(System.in);
		System.out.print("name > ");
		name = sc.next();
		System.out.print("age > ");
		age = sc.nextInt();
	} 
	void show() {System.out.println(name + "\t" + age);}

}
///////////////////////////////
public class Class002 {
	public static void main (String[] args) {
		Animal001 ani = new Animal001();
		// 1. new (heap 공간 빌려오기) 1000번지
		// 2. Animal001() name : null , age : 0 초기화 셋팅
		// 3. ani 에 1000번지 넣기
		ani.input();
		ani.show();
	}
}

/* 								== 저장되는 영역을 나타냄. ==
------------------------------------------------------------------------------------
						[method : class 들의 정보, static, final] 
						    Animal001 와 Class002 가 저장됨.
------------------------------------------------------------------------------------
				[heap]	  					| 				[stack]
 				 동 적	  					|				잠깐빌리기
 		  									|		 	 	 main
↑1000번지 Animal(name : "sally", age : 10)	←	ani.show() 1000번지로 가서 show
↑1000번지 Animal(name : "sally", age : 10)	←	ani.input() 1000번지로 가서 input
↑1000번지 Animal(name : null, age : 0)		←	ani(1000번지)
------------------------------------------------------------------------------------
*/