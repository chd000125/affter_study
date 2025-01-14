package com.company.day004;

public class Arr001 {
public static void main(String[] args) {
	int a = 0; // 정수형 공간이 1개인 변수
	int []arr = {1,2,3}; // 정수형 공간이 여러개 []
						 // [heap]1000번지 {1,2,3} -> [stack] arr 1000번지
	
	System.out.println(a);
	System.out.println(arr);
	System.out.println("1 꺼내기 : "+arr[0]);
	System.out.println("2 꺼내기 : "+arr[1]);
	System.out.println("3 꺼내기 : "+arr[2]);
	
	int []arr3 = {1,2,3,4,5}; // 배열명 : arr3 /들어가있는 값 : 1,2,3,4,5 | (0,1,2,3,4)번째 |
	int []arr4 = {100,200,300}; 
	char [] arr5 = {'a','b','c'}; // arr5 - 'a','b','c'
	
	System.out.println("arr3의 2라는 값 꺼내기 : "+ arr3[1]);
	System.out.println("arr3의 전체 갯수 : "+ arr3.length);
	
	System.out.println();System.out.println();
	for(int i = 0; i<5; i++) {System.out.print(arr3[i]);}
	
	System.out.println();System.out.println();
	for(int i = 0; i<arr3.length; i++) {System.out.print(arr3[i]);}
	
}
}
