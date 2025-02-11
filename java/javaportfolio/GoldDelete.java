package com.company.test;

import java.util.ArrayList;
import java.util.Iterator;

public class GoldDelete implements GoldProcess {

	@Override
	public void exec(ArrayList<GoldUser> users) {

		System.out.println("유저삭제");
		/*
		Iterator<GoldUser> iter = users.iterator();
		int find = -1;
		while (iter.hasNext()) {
			if(find == -1) {
				break;
			}
			else { users.remove(find);}
		}*/
	}
	
}
