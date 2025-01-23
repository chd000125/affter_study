package com.company.day007_oop2_static_final_modifier;

import com.company.day007_etc.Cat;

public class Class012_Modifier {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.pub = 1;	// public <- 아무데서나 접근가능
	  //cat.pro = 2;	// protected <- 상속받은 자식 - extends
	  //cat.pac = 3;	// package(default) <- 같은 폴더(package)안에서 사용.
	  //cat.pri = 4;	// private <- Cat 이라는 클래스 내부에서만 사용가능
	}
}
// 1. package - day007_etc
// 2. 			dat007_etc.Cat 클래스파일
// 3. day007  - Class012_Modifier