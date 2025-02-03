package com.company.day013;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection005_Set {
	public static void main(String[] args) {
		UserInfo [] arr = new UserInfo[]{ 
		       	new UserInfo("아이언맨",50), new UserInfo("헐크",40), new UserInfo("캡틴",120) ,new UserInfo("캡틴",120) };
		
		// #1. HashSet을 이용해서 데이터 넣기
			Set<UserInfo> set = new HashSet<>();
			for (int i = 0; i < arr.length; i++ ) {
				set.add(arr[i]);
			}
			System.out.println(set.size());
		
		// #2. 출력 향상 for 문
			System.out.println("==NAME\tAGE==");
			for ( UserInfo temp : set ) {
				System.out.println(temp.getName() + "\t" + temp.getAge());
			}
			
		
		// #3. Iterator 이용해서 출력
			System.out.println("\n==NAME\tAGE==");
		Iterator<UserInfo> iter = set.iterator();
		while (iter.hasNext()) {
			UserInfo temp = iter.next();
			System.out.println(temp.getName() + "\t" + temp.getAge());
		}
		
		
		
	}
}
