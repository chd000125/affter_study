package com.company.day005;

import java.util.Scanner;

public class remind001 {
	
	public static String hi() { return "hi"; }
	public static String alpha() {return "♡";}
	
	public static void main(String[] args) {
		int a ;
		int b ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10, 20, 30 중 입력해주세요. >> ");
		a = sc.nextInt();
		if (a == 10) {
			b = 10 * 10;
			System.out.println(b);
		} else if (a == 20) {
			b = 10 * 20;
			System.out.println(b);
		} else if (a == 30) {
			b = 10 * 30;
			System.out.println(b);
		} else {System.out.println("10, 20, 30 중에 입력해주세요.");}
		
		System.out.print("10, 20, 30 중에 입력해주세요. >>>");
		a = sc.nextInt();
		
		switch(a) {
		case 10 :
			b = 10 *10;
			System.out.println(b);
			break;
		case 20 :
			b = 10 * 20;
			System.out.println(b);
			break;
		case 30 :
			b = 10 * 30;
			System.out.println(b);
			break;
		default : System.out.println("10, 20, 30 중에 입력해주세요.");
		}
		
		for (int i = 1; i < 4; i++) {
			System.out.print(i);
		}
		System.out.println("");
		int c = 1;
		while (c < 4) {
			System.out.print(c);
			c++;
		}
		System.out.println("");
		c = 1;
		do {System.out.print(c); c++; } while(c < 4);
		
		int [][] arr2 = new int[2][3];
		int d = 1;
		System.out.println("");
		for (int ch = 0; ch <arr2.length; ch++) {
			for (int i = 0; i <arr2[ch].length; i++) {
				arr2[ch][i] = d++;
				System.out.println(arr2[ch][i]);
			}
		}
}}
