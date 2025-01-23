package com.company.day010;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List001 {
	public static void main(String[] args) {
		String [] arr = new String[3]; // 공간이 3개로 고정이되어 유동적으로 추가 불가능.
		System.out.println(Arrays.toString(arr));
		// 	 부모  =     자식 / 업캐스팅
		List list = new ArrayList(); //
		list.add("one");
		list.add(1);
		list.add(3.14);
		System.out.println(list);
		
		List<String> list2 = new ArrayList();
		list2.add("two");
		System.out.println(list2);
		
		//Q1 . List 를 이용해 "ONE" "TWO" "THREE" 를 add 를 이용하여 넣기
		
		List<String> list3 = new ArrayList();
		list3.add("ONE");
		list3.add("TWO");
		list3.add("THREE");
		System.out.println("갯수 > " + list3.size());
		System.out.println("꺼내기 > " + list3.get(1));
		System.out.println("포함 > " + list3.contains("TWO"));
		System.out.println("삭제 > " + list3.remove(1));
		
	}

}
/*
	List (기차) - 순서O / 중복허용O  -> add/get/size/remove/contains
	



*/