package com.company.day005;
// 1. 클래스는 부품객체 -> 클래스가지고 객체를 만들 수 있어서.
// 2. 클래스 속성(멤버 변수)과 행위(멤버 함수)
class Car41{}// 3-4. Car41() 생성자를 안만들었을 때, 컴파일러가 기본 생성자를 자동으로 생성해줌.
class Car42{
	String color;
	// alt + shift + s 아래서 3번째
	// 오버로딩(같은 이름의 메서드, 다른 파라미터) => 컴파일러가 기본생성자 자동생성 취소
	public Car42(String color) {
		this.color = color;
	}
	// ※ 오버로딩 시 수동으로 기본생성자 만들기 및 기본 셋팅
	public Car42() { color = "black";}
}

public class Class004_constructor {
	public static void main(String[] args) {
		 // 3-1. new - 1000번지 메모리 할당, 객체 생성
	Car41 car1 = new Car41(); System.out.println(car1);
			 // 3-2. Car41() - 초기화, String null int 0 초기화
  // 3-3. car1 = 1000번지 주소 값이 들어있음.
	Car42 car2 = new Car42("red"); System.out.println(car2); //오버로딩 => 수동으로 기본생성자를 만들어 주어야 함.
	
	
	}
}
/* 								== 저장되는 영역을 나타냄. ==
------------------------------------------------------------------------------------
						[method : class 들의 정보, static, final] 
						  Car41 와 Class004_constructor 가 저장됨.
------------------------------------------------------------------------------------
				[heap]	  					| 				[stack]
 				 동 적	  					|				잠깐빌리기
 		  									|		 	 	 main
↑1000번지 Animal(name : "sally", age : 10)	←	ani.show() 1000번지로 가서 show
↑1000번지 Animal(name : "sally", age : 10)	←	ani.input() 1000번지로 가서 input
↑1000번지 Animal(name : null, age : 0)		←	ani(1000번지)
------------------------------------------------------------------------------------
*/