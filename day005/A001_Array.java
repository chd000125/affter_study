package com.company.day005;

public class A001_Array {
	public static void main(String[] args) {
	// 1. 1차원 배열
	// 1. new => 공간빌리기(heap) 2. int(정수. ->1,2,3) 3. [3] -> 공간 3개
	int[] arr1 = new int[3];
	// 4. arr1(주소보관 : stack)
	// 의미 : 3(0~2)

	// 2. 2차원 배열
	// 1. new => 공간빌리기(heap) 2.int(정수) 3. [2][3] => 2층 3칸 => 6칸
	int[][] arr2 = new int[2][3];
	// 4. arr2(주소 보관 : stack)
	// 의미 : 2층(0,1) 3칸(0,1,2)
	// 0층 0,1,2
	// 1층 0,1,2 => 총 6칸

	int[][] arr3 = new int[3][4]; // 1. new => 공간빌리기(heap) 2.int(정수) 3. [3][4] => 3층 4칸 => 12칸

	int[][] arr4 = new int[2][2];

	arr4[0][0]=1;arr4[0][1]=2;arr4[1][0]=3;arr4[1][1]=4;

	for(int ch = 0;ch<2;ch++)
	{
		for (int i = 0; i < 2; i++) {
			System.out.print(arr4[ch][i]); System.out.println();
		}
	}
	int data = 1;
}}
