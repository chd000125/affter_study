package com.company.day012_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream001 {
	public static void main(String[] args) {
/*
	목적 : 데이터 종류에 상관없이 같은 방식으로 처리
	Arrays.stream(배열)
	Stream.of('값')
*/

		Integer[] arr = {1,2,3,4,5};
		List<Integer> list = Arrays.asList(arr);
		//ver - 1 Stream<Integer>				
		Arrays.stream(arr).forEach(System.out::println);
	 	
		//ver - 2 	
		list.stream().forEach(  System.out::println  );		
		Consumer c;
		//Consumer < ? super Integer> action
		//Consumer<T> 받는 용도 - accept
		// void java.util.function.Consumer.accept (T t)
		
	}
}
