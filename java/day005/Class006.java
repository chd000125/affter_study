package com.company.day005;

class INitNum {
	String name = "BMW";
	int speed;
	{ name = "벤츠"; speed = 150; }
	public INitNum() {super();}
	public INitNum(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}
	// 멤버 함수
	@Override
	public String toString() {
		return "INitNum [name=" + name + ", speed=" + speed + "]";
	}
	
}

public class Class006 {
	public static void main(String[] args) {
		INitNum car = new INitNum();
		System.out.println(car);
	}
}
