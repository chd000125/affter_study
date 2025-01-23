package com.company.day011_using_Thread;

import java.awt.Toolkit;

/*
	프로세스 - 실행중인 프로그램
	=> 자원 + Thread( 작업 수행 )
*/

class PigShow extends Thread{ // #1. 상속 Thread(작업수행 클래스)
	@Override public void run() {
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		for (int i = 0; i < 5; i++) {
			System.out.println("˙Ꙫ˙");
			try { Thread.sleep(400); } catch (InterruptedException e) { e.printStackTrace(); }
			
		}
	}//end run
} // end PigShow

class PigSound extends Thread{
	@Override public void run() {
	for (int i = 0; i < 5; i++) {
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		System.out.println("꿀꿀");
		try { Thread.sleep(500);} catch(InterruptedException e ) {e.printStackTrace();}
	}
	}// end run
} // end PigSound

class PigCnt extends Thread{ // cnt 1~5까지 출력 #1. 작업수행클래스 상속
	// #2. (1~5까지 출력)
	@Override public void run() {
		try { Thread.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
		for (int i = 1; i < 6; i ++) {
			try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
			System.out.println("COUNT : " + i);
			try { Thread.sleep(500);} catch(InterruptedException e ) {e.printStackTrace();}

		}
	}
} // end PigCnt

public class Thread002 {
	public static void main(String[] args) {
		Thread show = new PigShow(); show.start(); // start
		Thread sound = new PigSound(); sound.start();
		Thread cnt = new PigCnt(); cnt.start();
		
		
	}//end main
}// end class
