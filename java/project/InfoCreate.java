package com.company.project;

import java.util.ArrayList;
import java.util.Scanner;

public class InfoCreate implements InfoProcess {
	@Override public void exec(ArrayList<Info> users) {
		System.out.println("1. 등록기능입니다.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("이메일입력 > ");
		users.add( new Info(scanner.next()) );
		//list.add(  new Info("aaa@gmail.com") );
		//System.out.println("............. 확인 >" + users);
	}// end exec
}// end class