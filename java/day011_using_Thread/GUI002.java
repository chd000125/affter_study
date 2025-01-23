package com.company.day011_using_Thread;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//1.  클래스는 부품객체
//2.   상태  +  행위
/*
	SwingGui001
	  ◆		◆      // 생성자에서 new 해라 -> 합성 관계
	JFrame JButton
*/
class SwingGui002{
	//멤버변수
	JFrame frame;
	JButton [] button;  //버튼 배열
	// alt + shift + s
	public SwingGui002() {
		frame = new JFrame("LAYOUT");
		button = new JButton[6]; // 6개 공간(만) 빌려옴
		for (int i = 0; i <button.length; i++ ) { button[i] = new JButton("BTN" + (i+1)); } // 버튼 생성
	}// new
	public void show() { // 틀.add 틀.setSize 틀.setVisible
		frame.setLayout(new GridLayout(2,2));
		frame.add(button[0]);
		frame.add(button[1]);
		frame.add(button[2]);
		frame.add(button[3]);
		
		
		/*frame.setLayout(new BorderLayout()); // 	
		frame.add(button[0], BorderLayout.NORTH); // add(컴퍼넌트 , 북쪽에 위치)
		frame.add(button[1], BorderLayout.SOUTH); // add(컴퍼넌트 , 남쪽에 위치)
		frame.add(button[2], BorderLayout.EAST); // add(컴퍼넌트 , 남쪽에 위치)
		frame.add(button[3], BorderLayout.WEST); // add(컴퍼넌트 , 남쪽에 위치)
		frame.add(button[4], BorderLayout.CENTER); // add(컴퍼넌트 , 남쪽에 위치)
		*/
		
		frame.setSize(300,300);
		frame.setVisible(true);
		
		
		}// show
	} //class SwingGui

public class GUI002 {
	public static void main(String[] args) {
		new SwingGui002().show();
		
	}// main
}// class
