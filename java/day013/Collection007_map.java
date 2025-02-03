package com.company.day013;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Collection007_map {
	public static void main(String[] args) {
		Map<Integer, UserInfo> map = new HashMap<>();
		// new UserInfo("아이언맨", 50), new UserInfo("헐크", 40), new UserInfo("캡틴", 120)
		map.put(1, new UserInfo("아이언맨", 50)); // 키 . 값 2개 입력
		map.put(2, new UserInfo("헐크", 40));
		map.put(3, new UserInfo("캡틴", 120));
		map.put(1, new UserInfo("아이언맨-new",50)); // 키가 겹치면 덮어씌움
		
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println();
		//1. 줄서기 2. 처리대상확인 3.대상꺼내오기
		System.out.println(map.keySet()); // 1,2,3
		System.out.println(map.entrySet()); // 1= UserInfo [name=아이언맨-new, age=50],.....
		
		System.out.println();
		Iterator <Integer> iter1 = map.keySet().iterator(); // [->1,2,3]
		while (iter1.hasNext()) {
			Integer key = iter1.next();
			System.out.println(key + "\t" + map.get(key)); // key값에 해당하는 value 출력
		}
		System.out.println();
		Iterator <Entry <Integer, UserInfo>> iter2 = map.entrySet().iterator();
		while (iter2.hasNext()) {
			Entry <Integer, UserInfo> temp = iter2.next();
			System.out.println(temp.getKey() + "\t" + temp.getValue());
		}
	}
}
/***
	1. 콜렉션 프레임워크 - 동적배열
	2. 핵심 인터페이스 [ List, Set, Map ]
	
	 List : 기차 index O , 중복여부 O, add,size,get,remove,contains
	 		= ArrayList(검색에 용이), LinkedList(삽입, 삭제에 용이), Vector(쓰레드)
	 	
	 Set : 주머니 index X, 중복여부 X, add, 향상된 for 문, get, remove, contains
	 Map : 사전 키:값 - 쌍(Entry), put,size,get,remove,conatins


***/