package com.company.day007_oop2_static_final_modifier;

import java.util.Arrays;

class A{ // DTO - Data Transfer Object
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "A [age=" + age + ", name=" + name + "]";
	}
	
	
}


public class Class014_classArr {
public static void main(String[] args) {
	A a = new A();
	System.out.println(a);
	A[] arr = new A[3]; // new 공간빌리기 -배열(같은 자료형 연결) A(클래스 자료형) 3개 공간만 빌리기
						// 3개	:	arr[0]		arr[1]		arr[2]
						// 		  {name, age} {name, age} {name, age}
	System.out.println(Arrays.toString(arr));
	// 각 공간에 생성자를 불러서 초기화
	arr[0] = new A();
	arr[0].setName("apple");
	arr[0].setAge(10);
	System.out.println(arr[0]);
}
}
