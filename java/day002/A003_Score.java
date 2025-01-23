package com.company.day002;

import java.util.Scanner;

public class A003_Score {
	public static void main(String[] args) {
		String stno = "";
		int kor=0, eng=0, math=0;
		int tot = 0;
		float avg = 0.0f;
		
	Scanner sc = new Scanner(System.in);
	System.out.println("학번을 입력해 주세요 >>");
	stno = sc.next();
	System.out.println("국어점수를 입력해 주세요 >>");
	kor = sc.nextInt();
	System.out.println("영어점수를 입력해 주세요 >>");
	eng = sc.nextInt();
	System.out.println("수학점수를 입력해 주세요 >>");
	math = sc.nextInt();
	tot = kor + eng + math;
	avg = tot/3f;
	//pass = avg>= 60? "합격":"불합격";
	//jang = avg>= 95? "장학생":" - ";
	
	
	
	
	System.out.println("::::::::::::::::::::::::");
	System.out.println(":::: GREEN IT SCORE ::::");
	System.out.println("::::::::::::::::::::::::");
	System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t\t합격여부\t레벨\t장학생");
	System.out.println(stno+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+(avg>=60? "합격":"불합격")
		+"\t"+(avg>=90? "수(Lv_9)":
		(avg>=80? "우(Lv_8)":
		(avg>=70? "미(Lv_7)":
		(avg>=60? "양(Lv_6)":"가(Lv_5)")
		)	)	)
		+"\t"+(avg>=95? "장학생":"")
		);
	
	}
	
}
