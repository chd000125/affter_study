package com.company.day012_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Stream002 {
	public static void main(String[] args) {
		/*
		목적 : 데이터 종류에 상관없이 같은 방식으로 처리
		Arrays.stream(배열)
		Stream.of('값')
	*/
			//#0. Stream<Integer>
			Integer[] arr = {1,2,3,4,5,1,2,1,2};				//배열
			List<Integer> list = Arrays.asList(arr);	//리스트
			
			Arrays.stream(arr);
			list.stream();
			//1. 중간연산
			//filter
			//distinct (중복생략) / sorted(정렬) / 2개 skip / list 로 변환
			//Consumer - 받는 용도 - void accept(T t)
			
			list.stream().filter( (t) -> {return t%2 != 0;} )
					.distinct() // 중복제거
					.sorted()	// 정렬
					.skip(1)	// 1개 스킵
					//최종 연산
					.forEach(System.out::println); //홀수
			//#3.
			Arrays.stream(arr).filter( (t) -> {return t%2 != 0;} )
					.distinct() // 중복제거
					.sorted()	// 정렬
					.skip(1)	// 1개 스킵
					//최종 연산
					.forEach(System.out::println); //홀수
}
}
