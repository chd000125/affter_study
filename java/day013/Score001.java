package com.company.day013;

public class Score001 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int avg;
	public Score001() { super(); }
	public Score001(String name, int kor, int eng, int math) { // 내가 만든 생성자
		super(); this.name = name; this.kor = kor; this.eng = eng;
				 this.math = math; this.avg = (this.kor+this.eng+this.math)/3; }
	public Score001(String name, int kor, int eng, int math,int avg) { // 필드 생성자
		super(); this.name = name; this.kor = kor; this.eng = eng;
				 this.math = math; this.avg = avg;}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
	public int getAvg() { return avg; }
	public void setAvg(int avg) { this.avg = avg; }
	@Override
	public String toString() {
		return name + " 총점 : " + (kor + eng + math) + "/ 평균 : " + (kor +eng +math)/3 ;
	}
	
}
