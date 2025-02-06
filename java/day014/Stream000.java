package com.company.day014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream000 {
	public static void main(String[] args) {
		// Java IO(Input Output)
		// 입력 스트림 / 출력 스트림
		// 1. 스트림 - 데이터 종류에 상관없이 (Stream) 같은방식으로 처리(Lambda)
		
		Integer []arr = {1,2,3,4,5}; // 배열
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(new Integer(2));
		list.add(3);
		
		
		Arrays.stream(arr).forEach((t)->{System.out.print(t);});;; // 배열이지만 스트림형식으로 바꿈
		Arrays.stream(arr).forEach( t->System.out.print(t) );
		Arrays.stream(arr).forEach( System.out::print );
		//셋 다 같은 코드
		System.out.println(); System.out.println();
		
		list.stream();
		//Consumer c;
		// void java.util.function.Consumer.accept ( T t )
	}
}
