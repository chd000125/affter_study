package com.company.day010;

import java.util.HashSet;
import java.util.Set;

// List : 기차  	=> 순서, 중복허용 O 	/ add, get, size, remove, contains
// Set  : 주머니 	=> 순서 X, 중복허용 X 	/ add, Iterator, size, remove, contains


public class Set001 {
	public static void main(String[] args) {
	Set<String> set = new HashSet<>();
	set.add("ONE");
	set.add("TWO");
	set.add("THREE");
	set.add("THREE");
	System.out.println(set);
	System.out.println(set.size());
	System.out.println(set.remove("ONE"));
	System.out.println(set.contains("TWO"));
	System.out.println(set.size());
	
	for (String s : set) {System.out.println(s);}
	}
}
