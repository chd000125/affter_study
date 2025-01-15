package com.company.day005;

public class A001_arr2 {
	public static void main(String[] args) {
		int [][] arr = new int [2][3];
		
		int data = 1;
		
		arr[0][0] = data ++;
		arr[0][1] = data ++;
		arr[0][2] = data ++;
		arr[1][0] = data ++;
		arr[1][1] = data ++;
		arr[1][2] = data ++;
		
		for(int ch = 0; ch <arr.length; ch++) {
			for(int i = 0; i < arr[ch].length; i++) {
				System.out.print(arr[ch][i]+"\t");
			}System.out.println();
		}
		
	}
}
