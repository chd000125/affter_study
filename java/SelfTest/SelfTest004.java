package SelfTest;

import java.util.Scanner;

public class SelfTest004 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int kor = 0;
	int eng = 0;
	
	System.out.print("국어 점수를 입력해주세요. >> ");
	kor = sc.nextInt();
	System.out.print("영어 점수를 입력해주세요. >> ");
	eng = sc.nextInt();
	
	if (kor < 40) {System.out.println("국어과락");}
	if (eng < 40) {System.out.println("영어과락");}	
}
}
