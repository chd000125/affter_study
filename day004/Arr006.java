package com.company.day004;

public class Arr006 {
	public static void main(String[] args) {
		float [] arr1 = new float[5];
		
		float data = 1.1f;
		/*arr1[0] = data; data +=0.1f; // 1. 0번째 공간에 1.1 넣고 0.1 더하기
		arr1[1] = data; data +=0.1f; // 1. 0번째 공간에 1.2 넣고 0.1 더하기
		arr1[2] = data; data +=0.1f; // 1. 0번째 공간에 1.3 넣고 0.1 더하기
		arr1[3] = data; data +=0.1f; // 1. 0번째 공간에 1.4 넣고 0.1 더하기
		arr1[4] = data; data +=0.1f; // 1. 0번째 공간에 1.5 넣고 0.1 더하기
		*/
		for(int i = 0; i < arr1.length; i++ ){arr1[i] = data; data+= 0.1f;}
		for (int i=0; i < arr1.length; i++ ) {System.out.printf("%.1f",arr1[i]); System.out.print("\t");}
		}
	}
