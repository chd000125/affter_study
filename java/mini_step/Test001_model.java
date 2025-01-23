package mini_step;

import java.util.ArrayList;
import java.util.List;

//Q1. Dto만들기  - alt+shift+s / 2,3,4 생성자 + toString / getter+setter
//1. 클래스 부품객체   2. 상태/행위
class Info{
	//상태(멤버변수)
	public static int cnt=0;  //# 클래스변수  (  method / new 먼저올라감 )
	private int no;           //  인스턴스변수 (  heap  / new O , 생성자, this)
	private String email;     //  인스턴스변수
	public Info() { super(); }
	
	public Info(String email) { super(); this.no= ++cnt; this.email = email; } //#
	public Info(int no, String email) { super(); this.no = no; this.email = email; }
	@Override public String toString() { return "Info [no=" + no + ", email=" + email + "]"; }
	
	//행위(멤버함수)
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
}
//Q2. ArrayList  Test
public class Test001_model {
	public static void main(String[] args) {
		//C(create)R(read)U(update)D(Delete)
		//Q2. Info 자료형담는 ArrayList 만들기
		List<Info>  list =  new ArrayList<Info>();  // ctlr + shift + o
		//Q3. add이용해서  new Info(1,"aaa@gmail.com") 입력
		list.add(  new Info("aaa@gmail.com") );
		list.add(  new Info("bbb@gmail.com") );
		list.add(  new Info("ccc@gmail.com") );
		System.out.println( list );
		
		//Q4. R(read)   get이용해서 전체 출력  
		// ( 한개의 데이터 : 배열, 객체)
		for(  Info i    :     list) {  System.out.println(i.getNo() + "/" + i.getEmail()); }
		
		//Q5. U(update) 해당번호의 이메일 업데이트 no가 1 "abc@gmail.com" #
		// if(만약 no가 1이라면 ){ email을 abc@gmail.com 바꾸기 }
		for(Info i : list) {
			if(i.getNo()==1) { i.setEmail("abc@gmail.com"); }
		}
		System.out.println(list);
		//Q6. D(delete) remove이용해서 1번 지우기
		list.remove(0);
		System.out.println(list);
	}
}
