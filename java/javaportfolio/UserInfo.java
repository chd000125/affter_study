package com.company.javaportfolio;

import java.util.Calendar;

public class UserInfo {
	private int no;
	public static int cnt = 0;
	private String name;
	private String email;
	private String date;
	
	public UserInfo() { super(); }
	public UserInfo(int no, String name, String email, String date) {
		super();
		this.no = no;
		this.name = name;
		this.email = email;
		this.date = date;
	}
	public UserInfo(String name, String email) {
		super();
		this.no = ++cnt;
		this.name = name;
		this.email = email;
		Calendar today = Calendar.getInstance();
		this.date = today.get(1) + "-" + today.get(2) + "-" + today.get(5);
		//				년						월					일
	}
	@Override public String toString() {
		return "UserInfo [no=" + no + ", cnt=" + cnt + ", name=" + name + ", email=" + email + ", date=" + date + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public int getCnt() { return cnt; }
	public void setCnt(int cnt) { this.cnt = cnt; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	public String getDate() { return date; }
	public void setDate(String date) { this.date = date; } 
	
}
/*
	1. 주제 : 자원봉사 (Together)
	2. 주요기능 : (CRUD)
		자원봉사자 등록
		자원봉사자 확인
		자원봉사자 수정
		자원봉사자 삭제
	+) 후원기능
	
*/