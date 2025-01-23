package com.company.day009;

//1. 클래스는 부품객체
//2. 클래스는 상태와 행위
// public static final / public abstract
interface Calc { public double exec (double num1, double num2);}

public class NoNameClass002 {
public static void main(String[] args) {
	// 구현객체 안만들고 exec를 이용해서 더하기 기능이 가능한지 확인
	System.out.println("1. 익명 이너 클래스");
	Calc calc = new Calc() {
		@Override
		public double exec(double num1, double num2) { //테스트 목적
			double result;
			result = num1 + num2;
			return result;
			// => return num1 + num2;
		}
	};
	
	System.out.println(calc.exec(10, 3)); 
}
}
// Exception001 - 1을 입력받을 때 까지 무한 반복
