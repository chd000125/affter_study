package com.company.day009;
// 1. 클래스는 부품객체
// 2. 상태(멤버변수)와 행위(멤버함수)
/*
 		Object
 		  ↑
 		Shape002 { showArea (int w, int h); showArea(int r); }
 	↑		↑		↑
 Rectangle	Circle  Triangle
 */
abstract class Shape002 {
	abstract void showArea (int w, int h);
	abstract void showArea (int r);
}
class Rectangle extends Shape002{
	@Override void showArea(int w, int h) { System.out.println("사각형의 넓이 : " + w*h ); }
	@Override void showArea(int r) {  } // 필요없는 부분도 오버라이딩 해야함.
}
class Circle extends Shape002{
	@Override void showArea(int w, int h) { } // 필요 없는 부분
	@Override void showArea(int r) { System.out.println("원의 넓이 : " + r*r*Math.PI); }
}
class Triangle extends Shape002 {
	@Override void showArea(int w, int h) { System.out.println("삼각형의 넓이 : " + w*h*0.5 );}
	@Override void showArea(int r) {  } // 필요 없는 부분
}


public class Abstract2{
	public static void main(String[] args) {
		Shape002 area = new Rectangle(); // 부모 = 자식 / 업캐스팅 / 타입캐스팅X
		area.showArea(10, 3); // @Override 구현이되어있는 showArea
		area = new Circle();
		area.showArea(10);
		area = new Triangle();
		area.showArea(10, 3);
		
		
		//Shape002 [] arr = {new Rectangle(), new Circle(), new Triangle()};
	
	
	}
}