package com.company.day008;

class TestA4 extends Object{
	int a = 10;
	public TestA4() {super();}
	@Override public String toString() {return "TestA4[a=}"+a+"]";}
}
class TestB4 extends TestA4{
	int b = 20;
	public TestB4() {super();}
	@Override public String toString() { return "TestB4 [b=" + b + "]"; }
}
public class Polymorphism004 {
	public static void main(String[] args) {
		TestA4 ta = new TestA4();
		TestB4 tb = new TestB4();
		ta = new TestB4(); // 자식생성자 호출
		tb = (TestB4)ta ;
	}
}
