package com.company.day011_using_Thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//1.  클래스는 부품객체
//2.   상태  +  행위
/*
	SwingGui001
	  ◆		◆      // 생성자에서 new 해라 -> 합성 관계
	JFrame JButton
*/
class SwingGui001{
	//멤버 변수(상태)
	JFrame frame;			//틀
	JButton button;			//버튼

	//생성자
	public SwingGui001() {
		this.frame = new JFrame("Ex Font Checking Frame");
		this.button = new JButton("CLICK");
	}//swingGui 생성자
	
	//멤버 함수(행위)
	public void show() {// 1. 틀.add (컴포넌트) 2. 틀.setSize() 3. 틀.setVisible
		// Q  	버튼의 배경색상 설정(set) background
		//		글자색상 foreground | 글자 모양 font
		button.setBackground(Color.cyan);
		button.setForeground(Color.magenta);
		button.setFont( new Font(Font.SANS_SERIF, Font.BOLD, 50));;
		
		button.addActionListener( new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) { 
				JOptionPane.showMessageDialog(button, " 반갑고 ");
			}
			});	
		
		frame.add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 닫기 기능.
	}//show

}// SwingGui class


public class GUI001 {
	public static void main(String[] args) {
		new	SwingGui001().show();
		
		
		
	}//  main
}// class GUI
