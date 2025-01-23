package SelfTest;

import java.util.Scanner;

public class SelfTest005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 나이를 입력하세요. >> ");
		int age = 0;
		age = sc.nextInt();
		if (age < 19) {System.out.println("당신은 미성년자 입니다.");}
		else {System.out.println("당신은 성인 입니다.");}
	}
}
