package com.company.day004;

public class Arr002 {
	public static void main(String[] args) {
		float []fl = {1.1f,1.2f,1.3f,1.4f,1.5f};
		char []ch = {'A','B','C','D','E'};
		for (int i = 0; i<fl.length; i++) {
			System.out.print(fl[i]+"\t");
		}
		System.out.print("\n");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+"\t");
		}
	}
}
