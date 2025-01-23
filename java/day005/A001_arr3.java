package com.company.day005;

public class A001_arr3 {
	public static void main(String[] args) {
		int [][] arr = new int [2][3];
		int data = 1;
		for (int ch = 0; ch < arr.length; ch++) {
			for(int i = 0; i <arr[ch].length; i ++) {
				arr[ch][i] = data;
				data = data *10;
			}
		}
		for (int ch = 0; ch < arr.length; ch++) {
			for(int i = 0; i <arr[ch].length; i ++) {
				System.out.print(arr[ch][i]+"\t");
			} System.out.println();
		}
	}
}
