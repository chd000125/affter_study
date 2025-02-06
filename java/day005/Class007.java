package com.company.day005;

class A7 {
	int a; // 인스턴스 변수 (new,this 로 인해 값이 변경됨)
	static String company = "BANA"; // => static 을 붙여 메서드 영역에 올라갔기 때문에 바로 사용가능. 클래스 변수 (new, this의 영향을 받지 않음)
	public A7(int a) { super(); this.a = a; }
	public A7() { super(); }
	void show() {int b=0; System.out.println(b);}
}

public class Class007 {
	public static void main(String[] args) {
		//System.out.println(A7.company);
		A7 a7 = new A7();
		a7.show();
	}
}
/* 								== 저장되는 영역을 나타냄. ==
------------------------------------------------------------------------------------
						[method : class 들의 정보, static, final] 
						   company 와  A7 과 Class007 가 저장됨.
------------------------------------------------------------------------------------
				[heap]	  					| 				[stack]
 				 동 적	  					|				잠깐빌리기
 				 							|
 		  									|		 	 	 main()
------------------------------------------------------------------------------------
*/