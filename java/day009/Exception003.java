package com.company.day009;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Exception003 {
	public static int nextInt() throws InputMismatchException{ // 에러 처리할 때 Exception
		Scanner sc = new Scanner(System.in);
		System.out.print("1을 입력해주세요 >> ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int a;	
		for (;;) {
			try {
				a = nextInt();	// 에러가 나면 컨트롤타워에서 처리
				if (a==1) {
					break;
				}
		}catch(InputMismatchException e) {System.out.println("숫자만 입력가능합니다.");}}
	}
}