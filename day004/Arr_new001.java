package com.company.day004;

public class Arr_new001 {
	public static void main(String[] args) {
		int [] arr = new int[3];
		///1. new heap 공간빌려오기
		///2. int[3] int 형태 공간 3개
		///3. 3개 : index 0~2
		//arr [0] = 1;
		//arr [1] = 2;
		//arr [2] = 3;
		int data = 1;
		arr [0] = data++; // arr [0] = data대입 -> data++(값 증가)
		arr [1] = data++; // arr [1] = data+1대입 -> data++(값 증가)
		arr [2] = data++; // arr [2] = data+1+1대입 -> data++(값 증가)
		
		System.out.print(arr[0] + "\t" );
		System.out.print(arr[1] + "\t" );
		System.out.print(arr[2] + "\t" );
		System.out.println("\n");
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
