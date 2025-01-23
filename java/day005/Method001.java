package com.company.day005;

public class Method001 {
	//public : 아무곳에서 사용 가능 | static : 실행 하면 먼저 로딩됨.
	//1. 함수 정의	  결과값 함수이름(재료)
	public static void washer() {
		System.out.println("세탁을 합니다!");}
	
	public static void line() {
		System.out.println("\n----------");}
	public static void hi() {
		System.out.print("hi ");}
	//////////////////////////////////////////////
	
	//0. JVM 가장 우선실행 (전원)
	public static void main(String[] args) {
	 //2. 함수 사용.
		washer(); // 함수이름 앞에 아무것도 없으면, return 값이 없는 것 이므로 void
		line();
		hi(); hi(); hi();
	}
}
