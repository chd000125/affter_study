package com.company.day013;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	1. 콜렉션프레임워크
- [   배열   ]의 단점을 개선한 클래스 [	객체    ]만 저장가능 ( 동적배열 )
- 저장공간의 크기를 [	동적    ]으로 관리함.

2. 핵심 인터페이스 [ List, set, map ]
- 인터페이스를 통해서 틀이 잡혀 있는 방법으로 
  다양한 컬렉션 클래스를 이용함.

  List :  	기차   	index O , 중복 O,	 	( add, size, get, remove, contains ) contains => 포함되어있는지 여부
  Set :   	주머니  	index X , 중복 X, 	( add, size, 향상된 for 문/iterator, remove, contains )
  Map  :   	사전 		키:값 -쌍(Entry),  	( put, size, get(키), remove, contains ) 
*/
public class Remind001 {
	public static void main(String[] args) {
		 UserInfo [] arr = new UserInfo[]{ 
	       	new UserInfo("아이언맨",50), new UserInfo("헐크",40), new UserInfo("캡틴",120) , };
	       

	       //##1. 데이터 입력   ( add, get, size, remove, contains)
		 	List<UserInfo> list = new ArrayList<>();
		   //list.add(arr[0]); list.add(arr[1]); list.add(arr[2]);
		 	for (int i = 0; i < arr.length; i++) {
		 		list.add(arr[i]);
		 	}
	        
	       //##2. 데이터 출력
		 	System.out.println("=NAME\t AGE=");
		 	for (int i = 0; i < list.size(); i++) {
		 		UserInfo temp = list.get(i);
		 		System.out.println(temp.getName() + "\t" + temp.getAge());
		 	}
		   //##3. 향상된 for 문
		 	
		 	System.out.println("\n=NAME\t AGE=");
		 	for ( UserInfo temp : list ) { // list에서 하나씩 가져와서 temp에 넣겠다.
		 		System.out.println(temp.getName() + "\t" + temp.getAge());
		 	}
		   //##4. Iterator - 줄을 서시오
		 	//1. 리스트 모으기(iterator) 2. 처리대상 확인(hasNext) 3. 데이터 가져오기(next)
		 	//db에서 데이터 가져올 떄 표줄칸? 표준칸? 으로 가져오기
		 	System.out.println("\n=NAME\t AGE=");
		 	Iterator <UserInfo> iter = list.iterator(); // 1)줄세우기 iter -> ["AAA","BBB","CCC"]
		 	while (iter.hasNext()) { // 2)처리대상 유무 확인 iter [->"AAA","BBB","CCC"]
		 		UserInfo temp = iter.next(); // "AAA" 3)꺼내오기 iter [->"BBB", "CCC"]
		 		System.out.println(temp.getName() + "\t" + temp.getAge());
		 	}
		 	
		 	
	}
}
