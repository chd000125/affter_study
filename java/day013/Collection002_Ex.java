package com.company.day013;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Collection002_Ex {

	public static void main(String[] args) {
		List<Score001> list = new ArrayList<>();
		list.add( new Score001("아이언맨",30,40,50) );
		list.add( new Score001("헐크",40,60,70) );
		list.add( new Score001("캡틴",80,90,100) );
		
		System.out.println("이름\t국어\t영어\t수학\t평균");
		for (int i = 0; i < list.size(); i++) {
			Score001 temp = list.get(i);
			System.out.println(temp.getName() +"\t"+ temp.getKor() +"\t"+ temp.getEng()+"\t"+temp.getMath()+"\t"+temp.getAvg() );
		}
		System.out.println("\n이름\t국어\t영어\t수학\t평균");
		for ( Score001 temp : list) {
			System.out.println(temp.getName() +"\t"+ temp.getKor() +"\t"+ temp.getEng()+"\t"+temp.getMath()+"\t"+temp.getAvg() );
		}
		System.out.println("\n이름\t국어\t영어\t수학\t평균");
		Iterator <Score001>iter = list.iterator();
		while(iter.hasNext()) {
			Score001 temp = iter.next();
			System.out.println(temp.getName() +"\t"+ temp.getKor() +"\t"+ temp.getEng()+"\t"+temp.getMath()+"\t"+temp.getAvg() );
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 > ");
		String UserName = sc.next();
		iter = list.iterator();
		while (iter.hasNext()) {
			Score001 temp = iter.next();
			if(temp.getName().equals(UserName)) {
				System.out.println(temp.getName()+"\t총점 : "+ (temp.getKor()+temp.getEng()+temp.getMath()) +"\t평균 : "+ temp.getAvg());
				break;
			}
		}
		
	// ArrayList 와 LinkList / Vector 차이점
		
	
	}
}
/*
 Q1. 외부에서 ( 다른폴더에서 사용가능하게 )
 	/ 생성자, toString, getters + setters (alt + shift + s)
public class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int avg;
}

Q2. ArrayList 만들어서 데이터 넣기
	new ScoreDto8("아이언맨",30,40,50);
	new ScoreDto8("헐크",40,60,70);
	new ScoreDto8("캡틴",80,90,100);

Q3. 출력 for + size / 향상된 for / Iterator

Q4. 사용자에게 이름입력받기 -> 그 사용자의 총점과 평균 출력하기

사용자 총점 / 평균 확인 > 입력받기 ( 예 : 아이언맨 )
아이언맨 총점 : 120  / 평균 : 40
 
 
 
 */