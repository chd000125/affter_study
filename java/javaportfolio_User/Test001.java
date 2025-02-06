package com.company.javaportfolio_User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test001 {
	public static void main(String[] args) {
		//0. UserInfo
		UserInfo user = new UserInfo("first","first@gmail.com");
		System.out.println(user);
		
		//1. ArrayList Test
		// 기차 : index O, 중복허용가능, add/get/size/remove/contains
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(new UserInfo("aaa", "aaa@gmail.com"));
		list.add(new UserInfo("bbb", "bbb@gmail.com"));
		list.add(new UserInfo("ccc", "ccc@gmail.com"));
		System.out.println(list);

		
		//UserInfo cnt = 0;으로 수정
		
		//2. Iterator 이용해서 전체 데이터 출력하기
		
		Iterator<UserInfo> iter = list.iterator();
		System.out.println("No Name\tEmail\t\tDate");
		while (iter.hasNext()) {
			UserInfo temp = iter.next();
			System.out.println(temp.getNo()+"  " +temp.getName()+"  " +temp.getEmail()+"  " +temp.getDate());
		}
		iter = list.iterator();
		while (iter.hasNext()) {
			UserInfo temp = iter.next();
			if(temp.getNo()==2) {
				temp.setEmail("abc@gmail.com");
				break;
			}
		}
		System.out.println("No Name\tEmail\t\tDate");
		iter = list.iterator();
		while (iter.hasNext()) {
			UserInfo temp = iter.next();
			System.out.println(temp.getNo()+"  " +temp.getName()+"  " +temp.getEmail()+"  " +temp.getDate());
		}
		iter = list.iterator();
		while (iter.hasNext()) {
			UserInfo temp = iter.next();
			if(temp.getNo() == 2) {
				list.remove(2);
			}
		}
		System.out.println("No Name\tEmail\t\tDate");
		iter = list.iterator();
		while (iter.hasNext()) {
			UserInfo temp = iter.next();
			System.out.println(temp.getNo()+"  " +temp.getName()+"  " +temp.getEmail()+"  " +temp.getDate());
		}
		
	}//end main
}//end class
