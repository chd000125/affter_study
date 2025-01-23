package com.company.day009;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception001 {
	public static void main(String[] args) {
		int a = 0;
		a = 0;
		for (;;) {
			Scanner sc = new Scanner(System.in);
		try {	
			System.out.println("1을 입력해주세요 >> ");
			a = sc.nextInt();
			if (a==1) {
				System.out.println("1 입력 완료");
				break;
			}
		}catch(InputMismatchException e) {
			sc.next();
			System.out.println("숫자를 입력해주세요.");}}
	}
}
