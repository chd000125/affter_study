package com.company.day013;

import java.util.List;
import java.util.Vector;

public class Collection004_Vector {
//	static List<String> list = new ArrayList<>(); // thread-unsafe | Test1
	  static List<String> list = new Vector(); // thread-safe | Test2
	
	public static void main(String[] args) {
		System.out.println("...........[1. main start]");

		Thread thread = new Thread(new Runnable() {
			@Override public void run() { 
				list.add("1"); list.add("2"); list.add("3"); list.add("4");
				list.forEach((data)->{ 
					try { Thread.sleep(1000); }
					catch (InterruptedException e) { e.printStackTrace(); }
					System.out.println("DATA-" + data);
				});
			}
		});// Thread 선언
		thread.start();
		try { Thread.sleep(1000); }
		catch (InterruptedException e) { e.printStackTrace(); }
		list.add("5");
		System.out.println(list);
		System.out.println("...........[2. main end]");
		
		
		
		
		
	}//end main
}//end class
