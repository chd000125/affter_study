package com.company.day012_lambda;

interface Inter21{ void hi(); }
interface Inter22{ void hi(int a); }
interface Inter23{ int hi(); }
interface Inter24{ int hi(int a); }

public class Lambda002 {
	public static void main(String[] args) {
		Inter21 a1 = () -> {System.out.println("h");};
		Inter21 a11 = () -> {System.out.println("i");};
		Inter22 a2 = (int a) -> {
			String result ="";
			for (int i = 0; i < a; i++) { result += "안녕"; }
		System.out.println(result);
		};
		Inter22 a22 = a -> System.out.println( "안녕".repeat(a) );
		Inter23 a3 = () -> { return 3; };
		Inter23 a33 = () -> 3;
		Inter24 a4 = (int a) -> {return (a*10);};
		Inter24 a44 = a -> (a*10);
		
		
		
		
		
		a1.hi();
		a11.hi();
		a2.hi(2);
		a22.hi(2);
		System.out.println(a3.hi());
		System.out.println(a33.hi());
		System.out.println(a4.hi(3));
		System.out.println(a44.hi(3));
	}//end main
}// end class
