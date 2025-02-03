package com.company.day013;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection006_SetEx {
	public static void main(String[] args) {
		Set<Score001> score = new HashSet<>();
		score.add(new  Score001("아이언맨",30,40,50)); 
		score.add(new  Score001("아이언맨",30,40,50)); 
		score.add(new  Score001("아이언맨",30,40,50)); 
		score.add(new  Score001("헐크",40,60,70)); 
		score.add(new  Score001("캡틴",80,90,100));
		
		System.out.println(score.size());
		Iterator<Score001> iter = score.iterator();
		while(iter.hasNext()) {
			Score001 temp = iter.next();
			System.out.println(temp.getName() + "\t총점 : " + (temp.getKor()+temp.getEng()+temp.getMath()) + "\t평균 : "+ temp.getAvg());
		
		}
		
	}
}
