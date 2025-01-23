package com.company.day007_oop2_static_final_modifier;

import com.company.day007_etc.Milk013;

public class Class012_Ex {
	public static void main(String[] args) {
		Milk013 m1 = new Milk013();
		
	      System.out.println( m1 );  
	      m1.setMprice(2000);       
	      System.out.println( m1 );
	}
}

/*
ㅁ출력된화면
Milk [mno=0, mname=null, mprice=0]
Milk [mno=0, mname=null, mprice=2000]

ㅁ주어진조건
public class Milk013{  // 패키지를 etc에 설정해주세요!
   private int  mno;   
   private String mname;  
   private  int mprice;  
}
public class Class013 {
   public static void main(String[] args) {
      Milk m1 = new Milk();  
      System.out.println( m1 );  
      m1.setMprice(2000);       
      System.out.println( m1 );
   } // end main
} // end class
*/