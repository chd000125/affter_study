package SelfTest;

import java.util.Scanner;

public class SelfTest007 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("a,b,c중에 입력 >> ");
	String string = sc.next();
	switch(string) {
	case "a" :
	case "A" :
		System.out.println("Apple");
		break;
	case "b" : 
	case "B" :
		System.out.println("Banana");
		break;
	case "c" :
	case "C" :
		System.out.println("Coconut");
		break;
	default : System.out.println("대소문자 관계 없이 a,b,c,중에 입력해주세요.");
	}
}
}