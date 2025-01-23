package com.company.day008;

//1. 클래스는 부품객체
//2. 부품객체는 상태와 행위
//3. 재사용하기 위해 상속을 받음
//4. Object 를 상속받음 - alt + shift + s (기본 생성자)
/*
	 Object
	   ↑
       A1
       ↑
       B1
       ↑
       C1
 */
class A1 extends Object{int a; public A1() { super(); }}
class B1 extends A1{ int b; public B1(){ super(); }} //A1 생성자 호출

class C1 extends B1 {
	int c;

	public C1() {
		super();}
	public void show() {System.out.println(a+"/"+b+"/"+c);}
} // B1 생성자 호출

public class Extends001 {
	public static void main(String[] args) {
		C1 c1 = new C1(); c1.c = 30; c1.a = 20; c1.b = 10;
		c1.show();
 }
}
/*  
3. C1 c1 = new C1(); 29번째 줄 
-----------------------------------
[method: 정보, static, final]
A1, B1, C1, public Extends001, 
-----------------------------------
[heap:동적]       |[stack: 잠깐빌리기]
  Object() {#4 불러오기		}#5 틀 만들기		Object 틀을 사용할 수 있게 만듦.
	 a A1(){#3 불러오기 		}#6 a 사용가능		인스턴수 변수를 초기화 해 사용가능하게.
	 b B1(){#2 불러오기 		}#7 b 사용가능		인스턴수 변수를 초기화 해 사용가능하게.
1번지 c C1(){	#1 불러오기		}#8 c 사용가능		인스턴수 변수를 초기화 해 사용가능하게.  
                 |	main
-----------------------------------
*/
