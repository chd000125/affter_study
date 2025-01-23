package com.company.day001;

import java.util.Scanner;

public class A001_break {
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++ ) {
			System.out.print(i+"\t");
		}
	
	System.out.println("\n\n002. for continue");
	for (int i=1; i<=10; i++) {
		if(i==3) {break;}
		System.out.print(i + "\t");
	}
	System.out.println("\n\n002. for continue");
	for (int i=1; i<=10; i++) {
		if(i==3) {continue;}
		System.out.print(i + "\t");
	}
	System.out.println("\n\n003. for 무한반복");
	int a = 0;
	Scanner sc = new Scanner(System.in);
	for (;;) {
	 System.out.print("숫자 한개 입력 >> ");
	 a = sc.nextInt();
	 if (a==1) {break;}
	}
	System.out.println(a);
	 
	
	}
}
