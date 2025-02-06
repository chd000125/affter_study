package com.company.day012_lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda005 {
	public static void main(String[] args) {
		//1. Consumer<T> - 받는 용도 - Accept
		// void.java.util.function.Conumer.accept( T t )
		Consumer<String> consumer = (t) -> {System.out.println("Hello  " + t);};
		// Consumer<String> consumer1 = System.out::println; => 받은값을 그대로 내보낼때만 사용.
		consumer.accept("alpha");
		consumer.accept("beta");
		consumer.accept("delta");
		
		//2. Supplier<T> - 제공 용도 - Get
		// T java.util.function.Supplier.get()
		Supplier<String> supplier = () -> {return "Hello";};
		System.out.println(supplier.get());
		
		Supplier<String> supplier2 = () -> "Hello";
		System.out.println(supplier2.get());
		
		//3. Predicate<T> 판단 용도 - test (true / false)
		//boolean java.util.function.Predicate.test ( T t )
		Predicate<Integer> predicate = (Integer i) -> {return i<0;};
		System.out.println(predicate.test(1));
		System.out.println(predicate.test(-1));
		//					Integer i = -1 | Integer i = 1 (Wrapper class) => 
		
		//4. Function<T,R> 처리 용도 - apply
		Function<String , Integer> function = str -> Integer.parseInt(str);
		System.out.println(function.apply("10") + 3);
		
		
		//5. Operator<T> 연산 용도 - apply
		//int java.utill.function.IntBinaryOperator.applyAsInt ( int left, int right)
		IntBinaryOperator operator = (int left, int right) -> {return left >= right? left:right;};
		System.out.println(operator.applyAsInt(10, 3));
		
		IntBinaryOperator operator2 = (left, right) -> left>= right? left:right;
		
		
		
	}// end main
}// end Class
/*
	API삶의 질이 올라감.
	
	1. Consumer<T>		- 받는 용도 - Accept
	2. Supplier<T> 		- 제공 용도 - Get
	3. Predicate<T> 	- 판단 용도 - Test
	4. Function<T, R> 	- 처리 용도 - Apply
	5. Operator<T>		- 연산 용도 - Apply
	
	
	
*/