package SelfTest;

import java.util.Scanner;

public class SelfTest012 {
	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while (!(i >= 1 && i <= 100)) {
			System.out.println("1~100사이의 숫자를 입력해주세요. >> ");
			i = sc.nextInt();
		}
		
	}

}
