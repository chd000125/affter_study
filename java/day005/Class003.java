package com.company.day005;

import java.util.Scanner;

class Student002{
	String name;
	int stdno;
	int kor;
	int eng;
	int math;
	
/*	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 >> ");
		name = sc.next();
		System.out.print("번호 >> ");
		stdno = sc.nextInt();
		System.out.print("국어 >> ");
		kor = sc.nextInt();
		System.out.print("영어 >> ");
		eng = sc.nextInt();
		System.out.print("수학 >> ");
		math = sc.nextInt();
		
	}*/
	void info() {
		System.out.println("이름 : "+ name + "\t번호 : "+stdno);
		System.out.println("총점 : " + (kor + eng + math));
		System.out.println("평균 : "+ (kor + eng + math)/3f);
	}
}


public class Class003 {
	public static void main(String[] args) {
		Student002 s2 = new Student002();
		s2.name = "first"; s2.stdno = 11; s2.kor = 100; s2.eng = 100; s2.math = 99;
		s2.info();
		System.out.println(s2);
	}
}
