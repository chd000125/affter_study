package com.company.day001;

import java.util.Scanner;

public class A004_Ex4 {
	public static void main(String[] args) {
		int kor, eng, mat = 0;
		int total = 0;
		float avg = 0.000f;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 >> ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 >> ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 >> ");
		mat = sc.nextInt();
		total= kor+eng+mat;
		//avg = (float)total/3;
		avg = total/3f;
		System.out.println(":::::::::::::::::::::::::::::::::::");
		System.out.println(":::::: GREEN IT SCORE :::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+total+"\t"+avg);
		
	}
}
