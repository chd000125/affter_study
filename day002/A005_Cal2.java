package com.company.day002;

import java.util.Scanner;

public class A005_Cal2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stdid = "", level = "", suc="", jang = "";
		int kor = 0, eng = 0, math = 0, tot = 0;
		float avg = 0.0f;

		
		System.out.print("학번을 입력하세요. >> ");
		stdid = sc.next();
		System.out.print("국어 점수를 입력하세요. >> ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요. >> ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요. >> ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot/3f;
		
		/* level = (avg >= 90? "수":avg >= 80? "우":avg >=70 "미":avg >=60 "양":"가")*/
		if (avg>=90) {level = "수";}
		else if (avg >= 80) {level = "우";}
		else if (avg >= 70) {level = "미";}
		else if (avg >= 60) {level = "양";}
		else {level = "가";}
		
		if (avg >= 70 && kor <= 40 || eng <= 40 || math <=40) {suc = "재시험";}
		else if (avg >= 70) {suc = "합격";}
		else {suc = "불합격";}
		
		if (avg >= 95) {jang = "장학생";}
		
		System.out.println("::::::::::::::::::::::::");
		System.out.println(":::: GREEN IT SCORE ::::");
		System.out.println("::::::::::::::::::::::::");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격\t레벨\t장학생");
		System.out.println(stdid+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+suc+"\t"+level+"\t"+jang);
	}
}
