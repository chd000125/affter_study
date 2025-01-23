package com.company.day002;

public class A003 {
	public static void main(String[] args) {
	int a =1 ,b=1,c=1,d=1;
	
	System.out.println(++a);
	System.out.println("처리1 : " + a);
	System.out.println(b++);
	System.out.println("처리2 : " + b);
	
	System.out.println(--c);
	System.out.println("처리 3 : "+ c);
	System.out.println(d--);
	System.out.println("처리 4 : " + d);
	
	int test1 =3, test2 = 10;
	System.out.println(test2 += 10 - test1++);
	System.out.println(test1 += 5);
	
	//삼항연산자
	int t = 1;
	System.out.println(t>0 ? "양수":"음수");
	
	}
}
