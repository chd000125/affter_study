package com.company.day009;

import java.util.Calendar;

//1. 클래스는 부품객체
//2. 클래스는 상태 + 행위
//3. interface  ( 설계 : 멤버변수 - public static final / 멤버함수 : public abstract )
interface Launch {
	int MONEY = 10000;
	void eat();
}
class Burger implements Launch {
	int price;
	public Burger() { this.price = 3900; }
	@Override public void eat() {System.out.println("Burger 냠냠!"); }
	@Override public String toString() { return "Burger";}
	}

class KimchiStew implements Launch {
	int price;
	public KimchiStew() { this.price = 4000; }
	 @Override public void eat() { System.out.println("KimchiStew 냠냠!"); }
	 @Override public String toString() {return "KimchiStew";}
}
class User {
	int money;
	int cnt;
	Launch [] plate; // 기본은 3개 짜리
	User() {money = Launch.MONEY; plate = new Launch[3]; cnt = 0;}
	void order(Launch a) {
		//0.  가진돈  해당객체인지 확인후  price
		int temp=0;
		if(          a  instanceof Burger)     {  temp = ((Burger)a).price ;    }
		else	if(  a  instanceof KimchiStew) {  temp = ((KimchiStew)a).price ;}	 
		/////
		if(money < temp) {System.out.println(">> 잔액이 부족해 더이상 주문이 불가능합니다.\n");  return;}	
		
		if (cnt >= plate.length) { // 현재배열의 갯수(접시 갯수) >= 갖고 있는 접시 갯수 / 배열이 꽉찼다면
			Launch [] temparr = new Launch[3+plate.length]; // 현재배열공간 + 3 (6,9,12...)
			System.arraycopy(plate, 0,temparr,0,plate.length); // 데이터 복사해오고 (원본, 0, 새로운 배열, 0, 갯수)
			plate = temparr;
		}
		//1. 주문한 메뉴의 값 확인
		//2. 내가 가진 돈 빼기
		//3. 주방에 주문들어간 plate 확인
		money -= temp; 
		plate[cnt++] = a;
	}
	
	void show() {
		//4. 보이는대로 출력.
		String order="주문    : "; 
		for( int i=0; i<cnt; i++  ) { order += ((i!=0)?",":"" ) +  plate[i];  }
		System.out.println(order);
		System.out.println("주문금액 : " + (Launch.MONEY - money));
		System.out.println("잔액 : "    +  money );
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(1) + "년 " + (today.get(2) + 1) + "월 " + today.get(5) + "일 "  );
		for( int i=0; i<cnt; i++  ) { plate[i].eat(); }   //오버라이딩
	}
}

public class Interface004 {
	public static void main(String[] args) {
		User launchorder = new User();
		launchorder.order(new Burger());
		launchorder.order(new KimchiStew());
		launchorder.order(new Burger());
		launchorder.show();

	}
}
