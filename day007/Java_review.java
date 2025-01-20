package com.company.day007;

import java.util.Scanner;

class Hello {
	String hel() { return "hello"; }
}
class Hello2 {

	void hi(String name) {System.out.println("Hello" + name);}
}
class Hello3 {
	
	void hello (int repeat) {for (int i =0; i < repeat; i++) {
		System.out.print("Hello\t");
	}}
}

public class Java_review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
//1
		System.out.print("1,2,3 중에 입력해주세요. >> ");
		num = sc.nextInt();

		if (num == 1) {
			System.out.println("1이다");
		} else if (num == 2) {
			System.out.println("2이다");
		} else if (num == 3) {
			System.out.println("3이다");
		} else {
			System.out.println("1,2,3 중에 입력해주세요. >> ");
		}
//1
//2
		System.out.print("1,2,3 중에 입력해주세요. >> ");
		num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("1이다");
			break;
		case 2:
			System.out.println("2이다");
			break;
		case 3:
			System.out.println("3이다");
			break;
		}
//2
//3
		for (int i = 1; i < 4; i++) {
			System.out.print(i * 100 + "\t");
		}
		System.out.println("");
		int a = 1;
		while (a < 4) {
			System.out.print(a * 100 + "\t");
			a++;
		}

		System.out.println("");
		a = 1;
		do {
			System.out.print(a * 100 + "\t");
			a++;
		} while (a < 4);
//3
//4
		int[] arr1 = new int[3];
		int data = 1;

		System.out.println("");
		for (int i = 0; i < 3; i++) {
			arr1[i] = data * 100;
			data++;
			System.out.print(arr1[i]);
		}
//4
//5
		int[][] arr2 = new int[2][3];
		data = 1;
		System.out.println("");

		for (int ch = 0; ch < arr2.length; ch++) {
			for (int i = 0; i < arr2[ch].length; i++) {
				arr2[ch][i] = data * 100;
				data++;
				System.out.print(arr2[ch][i]);
			}
			System.out.println("");
		}
//5
//6
		Hello hello = new Hello();
		hello.hel();
//6
//7
		Hello2 h = new Hello2();
		h.hi("HD");
//7
//8
		Hello3 hihi = new Hello3();
		hihi.hello(2);
//8
//9
		//Override
//9
		

	}// public static void main
}// class Java_review
