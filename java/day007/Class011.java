package com.company.day007;

class User002 {
	final String nation = "Korea";
	final String jumin;
	String name;
	
	public User002(String jumin, String name) {
		this.jumin = jumin;
		this.name = name;
	}
}
public class Class011 {
	public static void main(String[] args) {
		User002 user1 = new User002("123456-1234567", "아이유");
	    
		System.out.println(user1);   
		
		user1.nation = "USA";      
		user1.jumin  = "123123-1234321";   
		user1.name = "IU"; 
		System.out.println(user1);   
	}
}
