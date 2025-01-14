package com.company.day004;

public class A001_while {
	public static void main(String[] args) {
		for(int i = 1; i <=3; i++) {
			System.out.print(i+"\t");
		}
		int a = 1;
		System.out.print("\n");
		while (a<=3) {
			System.out.print(a+"\t"); a++;
		} // while은 조건만 보며 증감은 가장 마지막에
		a=1;
		System.out.print("\n");
		do{System.out.print(a+"\t"); a++;} while(a<=3);
	} // do while은 do를 무조건 한번실행 후 while 조건 만큼 반복.
}
