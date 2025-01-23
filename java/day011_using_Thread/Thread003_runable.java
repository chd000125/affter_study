package com.company.day011_using_Thread;

class Animal{}

//class DogShow extends Thread{ //1.  Thread 수행클래스 상속
class DogShow extends Animal implements Runnable{ // 상속 + 수행클래스 두개 다 받을 수 있다.	 단. runnable 무조건 구현
//2. 해야할 일 - run
	@Override public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("😊😊");
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		}//for
	}//run
}// end DogShow

public class Thread003_runable {
	public static void main(String[] args) {
		Thread show = new Thread(new DogShow()); show.start();  //3. start
		Thread sound = new Thread(new Runnable() {
			@Override public void run() { 
				for (int i = 0; i < 5; i++) {
					System.out.println("멍");
					try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
				}
			}
		}); sound.start();  //3. start 멍*5
	}// main
}// class
