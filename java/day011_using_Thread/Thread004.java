package com.company.day011_using_Thread;

import javax.swing.JOptionPane;

//Timer 10 ~ 1까지 카운트
class Timer implements Runnable{
	@Override public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	
}

public class Thread004 {
	public static void main(String[] args) {
		Thread timer = new Thread(new Timer()); timer.setDaemon(true); timer.start();
		// Daemon Thread - 일반 Thread 가 [모두] 종료 되어야 작업이 완료가 안되어도 종료가 됨.
		String answer =  JOptionPane.showInputDialog("사과 알파벳을 입력하세요.");
		if (answer.trim().toLowerCase().equals("apple")) { // trim = 공백 빼고, toLowercase = 소문자 변경
			System.out.println("정답.");
		}else {System.out.println("오답.");}
	} // main
}// class
