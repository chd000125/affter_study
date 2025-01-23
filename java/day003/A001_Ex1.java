package com.company.day003;

import java.util.Scanner;

public class A001_Ex1 {
	public static void main(String[] args) {
		String stdid;
		int kor=-1, eng=-1, math=-1, tot=-1;
		float avg = 0.0f;
		String kor_lv="", eng_lv="", math_lv="";
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학번을 입력해주세요. >>");
		stdid = sc.next();
		/*
		for (;;) {
			System.out.print("국어 점수를 입력해주세요. >>");
			kor = sc.nextInt();
			if (0 <= kor && kor <= 100) {break;}}
			
		for(;;) {
			System.out.print("영어 점수를 입력해주세요. >>");
			eng = sc.nextInt();
			if (0 <= eng && eng <= 100) {break;}}
		for (;;) {
			System.out.print("수학 점수를 입력해주세요. >>");
			math = sc.nextInt();
			if (0 <= math && math <= 100) {break;}} */
		
		for (;;) {
			if (!(kor >= 0 && kor <= 100)) {
				System.out.print("국어 점수 >>");
				kor = sc.nextInt();	
				continue;}
	
			if (!(eng >= 0 && eng <= 100)) { 
				System.out.print("영어 점수 >>");
				eng = sc.nextInt();	
				continue;}
			
			if (!(math >= 0 && math <= 100)) {
				System.out.print("수학 점수 >>");
				math = sc.nextInt();				
				continue;}
			break;
		} 
		kor_lv = kor + "[" + (kor>=90? "수": kor>=80? "우": kor>=70? "미": kor >=60? "양":"가") + "]";
		eng_lv = eng + "[" + (eng>=90? "수": eng>=80? "우": eng>=70? "미": eng >=60? "양":"가") + "]";
		math_lv = math + "[" + (math>=90? "수": math>=80? "우": math>=70? "미": math>=60? "양":"가") + "]";
		
		tot = kor + eng + math;
		avg = tot/3f;
		String pass;
		String jang;
		int level = (int)avg/10;
		String star = "";
		
		if ( avg >= 60 ) {
			 if (kor <= 60 || eng <=60 || math<= 60){
				 pass="재시험";} else{pass = "합격";}
			 } else {pass="불합격";}
		if (avg >= 95) {jang = "장학생";} else {jang = " ";}
		for (int i = 1; i <= level; i++) {
			star = (star+"★");
		}
		
		
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t레벨");
		System.out.println(stdid+"\t"+kor_lv+"\t"+eng_lv+"\t"+math_lv+"\t"+tot+"\t"+avg+"\t"+pass+"\t"+jang+"\t"+star);
		
	}
	}

