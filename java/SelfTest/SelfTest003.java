package SelfTest;

import java.util.Scanner;

public class SelfTest003 {

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요. >> ");
		name = sc.next();
		System.out.println();
		System.out.println("당신의 이름은 " + name + " 입니다. ");
	}
}
