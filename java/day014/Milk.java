package com.company.day014;

public class Milk {
	private int no;
	private String name;
	private int price;
	public Milk() { super();}
	
	public Milk(int no, String name, int price) {
		super(); this.no = no; this.name = name; this.price = price; }
	@Override public String toString() {
		return "Milk [no=" + no + ", name=" + name + ", price=" + price + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no;}
	public String getName() { return name;}
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
}
