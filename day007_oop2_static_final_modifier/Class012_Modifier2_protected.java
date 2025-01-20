package com.company.day007_oop2_static_final_modifier;

import com.company.day007_etc.Cat;

class Cat2 extends Cat{//Cat 기존 -> Cat2 [Cat 의 기능을 끌어다가 사용]
	public Cat2() { super(); } 
	public void show() {
		pub = 1;
		pro = 2; // extends 를 붙여야 protected 사용가능.
	 // pac = 3; => Cat 클래스와 같이 있지 않음.
	 // pri = 4; => Cat 클래스 내부에서만 사용가능.
		System.out.println("public/protected : " + pub + " / " + pro);
	}
}

public class Class012_Modifier2_protected {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.pub = 1;	// public <- 아무데서나 접근가능
	  //cat.pro = 2;	// protected <- 상속받은 자식 - extends
	  //cat.pac = 3;	// package(default) <- 같은 폴더(package)안에서 사용.
	  //cat.pri = 4;	// private <- Cat 이라는 클래스 내부에서만 사용가능
		Cat2 cat1 = new Cat2();
		cat1.pub = 1;
	  //cat1.pro = 2;  <= 여기는 extends 를 쓴 클래스 밖이기 때문에 사용불가.
		
	}
}
// 1. package - day007_etc
// 2. 			dat007_etc.Cat 클래스파일
// 3. day007  - Class012_Modifier