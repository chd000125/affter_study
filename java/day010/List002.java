package com.company.day010;

import javax.swing.JOptionPane;

public class List002 {
	public static void main(String[] args) {
		//1. 입력
		//2. 알림창
		
		String name = JOptionPane.showInputDialog("당신의 이름은? >>");
		JOptionPane.showMessageDialog(null, name);
	}

}
