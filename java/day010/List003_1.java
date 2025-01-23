package com.company.day010;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

class UserInfo2{
	private String name;
	private int age;
	public UserInfo2() { super(); }
	public UserInfo2(String name, int age) { super(); this.name = name; this.age = age; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; } 
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }

}

public class List003_1 {
	//1. 사용자 이름 입력받기
	//2. 만약 사용자의 이름을 찾아서 같다면, 사용자 정보 출력
public static void main(String[] args) {
	List<UserInfo2> usif = new ArrayList<>();
	usif.add(new UserInfo2("IRON MAN", 50));
	usif.add(new UserInfo2("HULK", 43));
	usif.add(new UserInfo2("CAPTAIN", 120));
	String inputName = JOptionPane.showInputDialog("사용자 이름 입력 >> ");
	if(inputName.equals(usif.get(0).getName())) {
		System.out.println(usif.get(0));}
	if(inputName.equals(usif.get(1).getName())) {
		System.out.println(usif.get(1));}	
	if(inputName.equals(usif.get(2).getName())) {
		System.out.println(usif.get(2));}
}
}