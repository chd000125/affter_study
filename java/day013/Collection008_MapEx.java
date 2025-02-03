package com.company.day013;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;

class King{
	private String Name;
	public King() { super();  }
	public King(String name) { super(); Name = name; }
	@Override public String toString() { return Name; }
	@Override public int hashCode() { return Objects.hash(Name); }
	@Override public boolean equals(Object obj)
	{ if (this == obj) return true; if (obj == null) return false;
	if (getClass() != obj.getClass()) return false;
	King other = (King) obj; return Objects.equals(Name, other.Name); }
	public String getName() { return Name; } 
	public void setName(String name) { Name = name; } 
}



public class Collection008_MapEx {
	public static void main(String[] args) {
		Map<String, King> map = new HashMap<>();
		map.put("피구왕", new King("통키"));
		map.put("제빵왕", new King("김탁구"));
		map.put("요리왕", new King("비룡"));
		
		System.out.println("==============================");
		System.out.println("KING\tNAME");
		System.out.println("==============================");
		
		Iterator<Entry<String, King>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String, King> temp = iter.next();
			System.out.println(temp.getKey() +"\t" + temp.getValue());
			System.out.println("---------------------");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("KING의 정보를 제공중입니다\n 이름을 입력해주세요. > ");
		String GettingName = sc.next();
		iter = map.entrySet().iterator(); // 화살표 초기화(필수)
		while(iter.hasNext()) {
			Entry<String, King> temp = iter.next();
			if(temp.getKey().equals(GettingName)) {
				System.out.println(temp.getKey() + "\t" + temp.getValue());
				break;
			}else {System.out.println("King의 이름을 확인해주세요.");}
		}
		
		
		
		
	}
}
