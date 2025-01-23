package SelfTest;

import java.util.Scanner;

public class SelfTest011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		for (;;) {
		System.out.print("1~100사이의 숫자를 입력해주세요. >>");
		i = sc.nextInt();
		if (i >= 1 && i <= 100) {
			break;
		}
	}
	}
}
