package com.company.day003;

public class A001_star {
	public static void main(String[] args) {
		int tot = 303;
		int level = tot/10;
		String star = "★";
		for (int i = 1; i == level; i++) {
			star = (star+"★");
			System.out.print(star);
		}
		System.out.println(star);
	}
}
