package com.company.project;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class  View_intro{
	JFrame  frame;   JButton  button;
	public View_intro() { 
		this.frame = new JFrame("INTRO");
		this.button= new JButton("WELCOME!");
	}
	public void show() {  //frame.add / frame.setSize / frame.setVisible
		button.setBackground(Color.BLACK);
		button.setForeground(Color.CYAN);
		button.setFont(new Font(Font.MONOSPACED , Font.BOLD,25));
		
		frame.add(button);
		frame.setSize(300,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}// end view_intro