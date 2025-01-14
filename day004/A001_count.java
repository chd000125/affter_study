package com.company.day004;

public class A001_count {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i =1; i<=10; i++) {
			if (i%3==0) { cnt++; }
		}
		System.out.println("1~10까지의 3의 배수 개수 : " + cnt);
		
		cnt = 0;
		int i =1;
		while (i<=10) {if(i%3==0) { cnt++; } i++;}
		System.out.println("1~10까지의 3의 배수 개수 : " + cnt);
		
		cnt = 0;
		i = 1;
		do{if(i%3==0) { cnt++; } i++;} while (i<=10);
		System.out.println("1~10까지의 3의 배수 개수 : " + cnt);
	}
}
