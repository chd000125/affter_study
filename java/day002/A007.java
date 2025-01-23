package com.company.day002;

public class A007 {
	public static void main(String[] args) {
		System.out.print(1 + "\t");
		System.out.print(2 + "\t");
		System.out.print(3 + "\t");
		System.out.print(4 + "\t");
		System.out.print(5 + "\t");
		System.out.print("\n");
		System.out.println("q) 1 2 3 4 5");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "\t");
		}
		System.out.print("\n");
		for (int a = 1; a <= 3; a++) {
			System.out.print("java"+a+"\t");
		}
		System.out.print("\n");
		for (int b = 3; b>=1; b--) {
			System.out.print("HAPPY"+b+"\t");
		}
		System.out.print("\n");
		for (int c = 0; c<=3; c++) {
			System.out.print(c+"\t");
		}
		System.out.print("\n");
		for (int z = 0; z<=18; z=+2) {
			if (10<=z && z<=16) {
				System.out.print(".");
			} else {System.out.print(z);}
		}
	}
}
