package com.company.day010;

import java.util.ArrayList;
import java.util.List;

//0.DTO
//1. 클래스는 부품객체
//2. 상태 + 행위

class UserInfo{
	private String name;
	private int age;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public UserInfo() { super();  }
	public UserInfo(String name, int age) { super(); this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }

}
public class List003 {
public static void main(String[] args) {
	List<UserInfo> users = new ArrayList<>();
	users.add(new UserInfo("IRON", 50));
	users.add(new UserInfo("HULK", 38));
	users.add(new UserInfo("CAPTAIN", 120));
	for (int i=0;i<users.size(); i++) {
	System.out.println(users.get(i));
}

	}
}
