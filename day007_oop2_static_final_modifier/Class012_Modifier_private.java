package com.company.day007_oop2_static_final_modifier;

import com.company.day007_etc.Cat;

public class Class012_Modifier_private {
public static void main(String[] args) {
	Cat cat = new Cat();
	cat.pub = 1;
	cat.setPri(4); // private 안 보이게 숨는 기능, set 변수명 - 값을 셋팅할 때
	System.out.println(cat.getPri()); //       get 변수명 - 값 가져오기

 }
}
/*
	public (아무데서) > protected( extends ) > package(같은 폴더) > private(class 내부)
 
 
*/