package com.company.day007_oop2_static_final_modifier;

import java.util.Arrays;

class Score {
	private String name;
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private float avg;
	
	public Score() { super(); }
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (kor + eng + math)/3f;
	} 

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}
	public float getAvg() {return avg;}
	public void setAvg(float avg) {this.avg = avg;}

	@Override
	public String toString() {
		return name+ "\t\t" +kor+ "\t" + eng + "\t" + math + "\t" + avg;
	}
	
	
	
}


public class Class015_Ex {
	public static void main(String[] args) {
		
		Score []arr = new Score[3];
		System.out.println(Arrays.toString(arr));
		arr[0] = new Score("아이언맨", 100, 100, 100);
		arr[1] = new Score("헐크", 90, 60, 80);
		arr[2] = new Score("블랙팬서", 20, 60, 90);
		
		System.out.println("==================================================");
		System.out.println("이름\t\t국어\t영어\t수학\t평균");
		System.out.println("==================================================");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("==================================================");
		
		
		
		
	}
}
