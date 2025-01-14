package com.company.day001;

import java.util.Scanner;

public class A004_Ex2 {
	public static void main(String[] args) {
		float f =0.0F;
		double d = 0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 1을 입력해주세요 >> ");
		f = sc.nextFloat();
		System.out.print("실수 2를 입력해주세요 >> ");
		d = sc.nextDouble();
		System.out.println(f+"/"+d);
	}
}
