package com.company.day010;

import java.util.HashMap;
import java.util.Map;

//List : 기차  	=> 순서, 중복허용 O 		 / add, get, size, remove, contains
//Set  : 주머니 	=> 순서 X, 중복허용 X 		 / add, Iterator, size, remove, contains
//Map  : 사전		=> [key:value] 한쌍 entry	 / put, get, size, remove, contains(Key?)

public class Map001 {
	public static void main(String[] args) {
		Map<String, String> maps = new HashMap<>();
		maps.put("First", "하나");
		maps.put("Second", "두울");
		maps.put("Third", "세엣"); 
		//maps.put("Third", "셋"); // 키 값이 같으면 덮어 씀.
		System.out.println( maps );
		
		System.out.println(maps.get("First"));
		System.out.println(maps.size());
		System.out.println(maps.remove("Third"));
		System.out.println(maps.containsKey("Second"));
		
		System.out.println();
		System.out.println();
		
		for(String key : maps.keySet()) {
			System.out.println(key + " / " + maps.get(key));
		}
	}
}
