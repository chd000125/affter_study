package com.company.day005;

public class Method4 {
	public static int return_num() {return 1;}
	public static double return_float() {return 3.33333;}
	public static String myColor() {return "purple";}
	
	
	// public(전역) static(먼저 로딩) 리턴값 메서드명(파라미터)
	public static void main(String[] args) {
		// public static 3.3333 return_float() {return;}
		// public static double return_double() {return 3.33333;}
		// public static String myColor() {return "purple";}
		System.out.println(return_num());
		System.out.println(return_float());
		System.out.println(myColor());
		
	}
}
