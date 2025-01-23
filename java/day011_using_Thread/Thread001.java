package com.company.day011_using_Thread;

import java.awt.Toolkit;

//1. 프로세스 - 실행중인 프로그램
//2. 자원 + Thread

public class Thread001 {
	public static void main(String[] args) {
		System.out.println("001. Thread");
		// 1. 코어 ( 일꾼 수 )
		int core = Runtime.getRuntime().availableProcessors();
		System.out.println("1.  core : " + core);
		
		// 2. 현재 Thread 확인
		Thread curr = Thread.currentThread();
		System.out.println("2. 현재 스레드 (실행 프로그램) 이름 : " + curr.getName());
		System.out.println("3. 활성화 스레드 (실행 프로그램) 수 : " + Thread.activeCount());
		
		//1. ˙Ꙫ˙
		for (int i = 0; i < 5; i++) {
			System.out.println("˙Ꙫ˙");
		}
		//2. 비프음
		for (int i = 0; i < 5; i++) {
			System.out.println("˙Ꙫ˙");
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			System.out.println("꿀");
			//toolkit.beep();
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		
	}

}
