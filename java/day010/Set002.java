package com.company.day010;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Milk {
	private String name;
	private int price;
	public Milk() { super();  }
	public Milk(String name, int price) { super(); this.name = name; this.price = price; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getPrice() { return price; } public void setPrice(int price) { this.price = price; }
	@Override public String toString() { return "Milk [name=" + name + ", price=" + price + "]"; }
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override public boolean equals(Object obj){
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Milk other = (Milk) obj; return Objects.equals(name, other.name) && price == other.price;
		} 
}

public class Set002 {
	public static void main(String[] args) {
		Set<Milk> milk = new HashSet<>();
		milk.add(new Milk("Banana", 1800)); milk.add(new Milk("White", 1200));
		milk.add(new Milk("Choco", 1500)); milk.add(new Milk("Choco", 1500));
		System.out.println(milk.size());
		for(Milk s : milk) {
			System.out.println(s.getName() + " / " + s.getPrice() );
			
		}
		}
}

