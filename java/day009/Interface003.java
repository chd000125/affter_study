package com.company.day009;
//1. 클래스는 부품객체
//2. 클래스는 상태 + 행위 를 갖는다.
//3. interface 는 ( 설계 : 멤버변수 - public static final / 멤버함수 : public abstract )

interface Vehicle {
	public void run();
}
class MotoCycle implements Vehicle {
 @Override public void run() {System.out.println("오토바이가 달립니다.");}

}
class Car implements Vehicle {
	 @Override public void run() {System.out.println("자동차가 달립니다.");}
}
class Driver{
	void drive(Vehicle v) {v.run();} // 오버라이드 된 run (@run)이 각각 자식의 run 을 호출
 }
public class Interface003 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Car car = new Car();
		MotoCycle mo = new MotoCycle();
		
		driver.drive(car);  // 함수 구조 먼저 가져오기
		driver.drive(mo);	// 리턴값 메서드명 ( 파라미터(재료, 인수, 인자) )
							// void drive ( Car / mo  -> 둘 다 담을 수 있는 자료형 => Vehicle )
							// 								부모는 자식을 담을 수 있다.
	}

}
