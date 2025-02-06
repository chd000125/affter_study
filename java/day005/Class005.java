package com.company.day005;

// 1. 클래스는 부품객체
// 2. 클래스는 속성(멤버 변수) + 행위(멤버 함수)
class MyPrice {
	String name;
	int price;
	void show() {
		System.out.println("제품 이름 : " + name);
		System.out.println("제품 가격 : " + price);
	} // 기능
	public MyPrice() {name="갤럭시 노트"; price = 1000000;} // 기본값 설정.
	
}

public class Class005 {
	public static void main(String[] args) {
		MyPrice p = new MyPrice();
		p.show();
	}
}
//								   RUNTIMEDATA AREA
/* 								== 저장되는 영역을 나타냄. ==
------------------------------------------------------------------------------------
						[method : class 들의 정보, static, final] 
							  MyPrice 와 Class005 가 저장됨.
------------------------------------------------------------------------------------
				[heap]	  					| 				[stack]
 				 동 적	  					|				잠깐빌리기
 				 							|
 		  									|		 	 	 main()
------------------------------------------------------------------------------------
*/