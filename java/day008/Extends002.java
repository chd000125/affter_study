package com.company.day008;

class Color {
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; } }

class Green extends Color {
	private int num;
	public int getNum() { return num; }
	public void setNum(int num) { this.num = num; }
	public void show() {System.out.println( getName() + "/" + num);}
}

public class Extends002 {
	public static void main(String[] args) {
		Green g = new Green();
		g.setName("LIGHT_GREEN");
		g.setNum(5);
		g.show();
	}
}
