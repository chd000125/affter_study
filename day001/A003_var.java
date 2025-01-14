package com.company.day001;

public class A003_var {
	public static void main(String[] args) {
		//1. 리터럴
		System.out.printf("정수 : %d, 실수는 %f, 문자열 : %s", 1,1.23,"ASD\n");
		//2. 변수(open box) 1, 1.23, "ASD"
		// 자료형 공간을 빌려옴 	|	변수명 : 영어소문자_$ 까지허용(숫자로 시작X)
		// 정수 : int | 실수 : double | 문자열 : String
		int d = 1;	System.out.println(d);
			d = 10; System.out.println(d);
			
		double dd = 1.23;	System.out.println(dd);
			   dd = 3.141592;	System.out.println(dd);
		
		String str = "asd"; System.out.println(str);
			   str = "ASDF"; System.out.println(str);
			
	}
}
