package com.company.day011_using_Thread;

class Barista5{
	String order;
	boolean isEmpty = true; // #1. 상태 표시
	synchronized void order(String order) { //synchronized : 동기화 보장.
		//#2. 음료를 가져가지 않았다면 !(빈게)아니라면 == 꽉찼다면 기다려! 10번째줄 stop! #4
		if (!isEmpty) { try { wait(); } catch (InterruptedException e) { e.printStackTrace(); } }
		
		isEmpty = false; this.order = order; // #4
		System.out.println("[" + order + "] 주문을 받았습니다. " ); notify();
	}// order
	
	synchronized void make() {
		//#3. 음료가 나오지 않았따면 기다리기
		if ( isEmpty ) { try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }} // try 시도하는거지 보장은 안됨.
		
		isEmpty = true;
		System.out.println("[" + order + "] 음료 나왔습니다. " ); notify();
	}// make
	
}// Barista5


public class Thread005 {
	public static void main(String[] args) {
		Barista5 one = new Barista5(); // 공용자원사용
		String []coffees = {"아메리카노", "카푸치노", "바닐라 라떼", "딸기 요거트"};
		Thread ordering = new Thread( new Runnable() { //1.  Runnable  수행 클래스
			@Override public void run() { //2. run 해야할 일
				for (int i = 0; i < 5; i++) {
					one.order("주문번호 " + i + coffees[ (int)(Math.random()*4) ]);
				}// run for
			}//order run
		}); // ordering
		
		Thread making = new Thread ( new Runnable() {//1
			@Override public void run() { //2
				for (int i = 0; i < 5; i++) {
					one.make();
				} // run for
			}// making run	
		}); // making
		ordering.start(); making.start();
		
	}//main
	
}//class
