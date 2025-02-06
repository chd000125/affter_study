package com.company.day005;


//1. 클래스는 부품객체
//2. 클래스는 속성과 행위

class A1{ }


public class Class001 {

	public static void main(String[] args) {
		A1 a = new A1(); //3. new 를 사용하여 heap 공간 빌리기 | A1() 초기화 | a 는 heap 공간에서 빌려온 공간의 주소를 저장.
		System.out.println(a);
	}
}
/* A1 a = new A1();
 	== 저장되는 영역을 나타냄. ==
---------------------------------
	[method : class 들의 정보, static, final]
	A1, Class001들이 저장됨.
---------------------------------
	[heap]	  | 	[stack]
	 동 적	  |		잠깐빌리기
	 A1[]	  ←		a
	 		  |		main
---------------------------------
*/