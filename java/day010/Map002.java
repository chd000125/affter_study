package com.company.day010;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Fruit{
	private int no;
	private String name;
	public Fruit() { super(); }
	public Fruit(int no, String name) { super(); this.no = no; this.name = name; }
	public int getNo() { return no; } public void setNo(int no) { this.no = no; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	@Override public String toString() { return "Fruit [no=" + no + ", name=" + name + "]"; }
	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Fruit other = (Fruit) obj; return Objects.equals(name, other.name) && no == other.no; //실제 값 비교
	}
}

public class Map002 {
	public static void main(String[] args) {
		Map<Fruit, Integer> map = new HashMap<>();
		
		map.put(new Fruit(1, "Apple"), 1);
		map.put(new Fruit(1, "Apple"), 1);
		map.put(new Fruit(2, "Banana"), 2);
		
		System.out.println("Total : " + map.size());
		System.out.println("Fruit 정보  /  순위 ");
		for (Fruit f : map.keySet()) {
			System.out.println(f + " / " + map.get(f));
		}
		
		
	}
}
