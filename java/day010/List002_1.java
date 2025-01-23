package com.company.day010;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class List002_1 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		int num = Integer.parseInt(JOptionPane.showInputDialog("1,2,3 중에 하나를 입력해주세요. >>"));
		for (int i = 0; i <list.size(); i++) {
			if (num-1 == i) {  // 123 = 012
			JOptionPane.showMessageDialog(null, list.get(i));
			break;
		} else {System.out.println("1,2,3중에 입력해주세요.");}
		// JOptionPane.showMessageDialog(null, list.get( num - 1 ));
	}
	}
}
