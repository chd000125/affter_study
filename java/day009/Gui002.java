package com.company.day009;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//1. 클래스는 부품객체
//2. 조립
class MyView2{ // 클릭이벤트
	// 멤버변수 ( frame / button )
	JFrame frame; JButton button; //1. 부품 new 생성자
	// 멤버함수
	public MyView2() {
		this.frame = new JFrame("box");
		this.button = new JButton("button");
	}
	public void create() { // 셋팅 set / 가져오기 get / add, get, size, remove
		//2-1. frame.add(component) => 속성 추가
		//2-2. frame.size(300,300) => 크기 조정
		//2-3. frame.setVisite() => 보일것인지 유무
		frame.add(button); // 부모는 자식을 담을 수 있다.
		frame.setSize(300,300);
		frame.setVisible(true);
		button.addActionListener(new ActionListener() {// #3. 이벤트 걸기 interface 는 new를 못한다.
			@Override public void actionPerformed(ActionEvent e) { 
					JOptionPane.showMessageDialog(null,"Click 했네요.");
				} // 2) 한번 쓰고 버릴 목적으로
			});		// 3) new 인터페이스명 () { implements 구현 메서드 }
					// 익명 클래스
}
}
public class Gui002 {
	public static void main(String[] args) {
		new MyView2().create();
		
	}

}
