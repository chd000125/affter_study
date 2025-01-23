package com.company.day010;

import java.util.ArrayList;
import java.util.List;

//1. DTO
class Info{
	public static int cnt = 0;  //## 클래스 변수 ( method Area 에 new 연산자 보다 먼저 올라감.)
	private int no;				//	 인스턴스 변수 ( heap Area / new O , 생성자, this)
	private String email;		//	 인스턴스 변수
	public Info() { super(); }
	public Info(String email) { super(); this.no = ++cnt; this.email = email; } // 이메일만 체크해서 cnt 증가시키고 no 에 할당 
	public Info(int no, String email) { super(); this.no = no; this.email = email; }
	public int getNo() { return no; } public void setNo(int no) { this.no = no; }
	public String getEmail() { return email; } public void setEmail(String email) { this.email = email; }
	@Override public String toString() { return "Info [no=" + no + ", email=" + email + "]"; }
	
}

public class Test001_model {
	public static void main(String[] args) {
		//C R U D
		//2. Info 자료형 담는 ArrayList 만들기
		List<Info> list = new ArrayList<>();
		
		//3. add 이용해서 new Info(1, "aaa@gmail.com") 입력
		list.add(new Info("aaa@gmail.com"));
		list.add(new Info("bb@gmail.com"));
		list.add(new Info("ccc@gmail.com"));
		System.out.println(list);
		
		//4. R(read) get 이용해서 전체 출력
		for (Info i : list ) {System.out.println(i.getNo() + " / " + i.getEmail());}
		
		//5. U(update) 해당 번호의 이메일 업데이트 1을 입력받아서 1의 이메일 업데이트
		for (Info i : list) {
			Info data = i;
			if (data.getNo() == 1) {
				i.setEmail("abc@gmail.com");
		
			}
		System.out.println(i);
		}
		
		
		//6. D(delete) remove 이용해서 1번 지우기
		list.remove(0);
		System.out.println(list);
		

	}
}
