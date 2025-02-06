package com.company.day007_oop2_static_final_modifier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//1. 클래스는 부품객체
//2. 조립
class MyView implements ActionListener{ // 클릭이벤트
	// 멤버변수 ( frame / button )
	JFrame frame; JButton button; //1. 부품 new 생성자
	// 멤버함수
	public MyView() {
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
		button.addActionListener(this); // #3. 이벤트 걸기
		}
	@Override
	public void actionPerformed(ActionEvent e) { //#2 
		JOptionPane.showMessageDialog(null,"Click 했네요.");
	}
	
}

public class Gui001 {
	public static void main(String[] args) {
		new MyView().create();
		
	}

}
