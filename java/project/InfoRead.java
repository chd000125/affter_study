package com.company.project;

import java.util.ArrayList;

public class InfoRead implements InfoProcess {
	@Override
	public void exec(ArrayList<Info> users) {
		System.out.println("2. 조회기능입니다.");
		for( Info u  : users) { System.out.println(u); }
	}

	@Override
	public void exec(ArrayList<Info> users, View_crud crud) {
		
	}
}