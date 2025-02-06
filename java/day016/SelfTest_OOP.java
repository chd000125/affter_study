package com.company.day016;

public class SelfTest_OOP {
	/*
Q1. CLASS  vs  INSTANCE  의 차이점?

	Class 는 값을 만드는 틀
	Instance 는 값을 넣어 만들어낸 결과물 값

Q2.  다음코드를 보고 빈칸을 채우시오
-------------------------------------------------
A11 a1 = new A11();
-------------------------------------------------
1. 메모리빌려오고 객체생성하는 역할 :  ( new  )
2. String null, int 는 0으로 초기화 : (  A11  )
3. new A11() 한 주소를 갖고 있는 것은 : ( a1  )


Q3.  생성자
1.  역할? (  초기화  )
2.  [클래스 생성]할때 제일먼저 실행되는 특수한형태의 메서드
3. 생성자는 리턴값이   ( 없음 ) 
4. 클래스명과 이름이 ( 같다 )


Q4. 기본생성자를 반드시 선언해야하는 경우
    ( 추가적인 생성자를 만들었을 때  / 초기화 시켜야 할 때 )
 
Q5.  다음코드를 확인하고 클래스를 작성시 RUNTIME DATA AREA 의 빈칸을 채우고 설명하시오.
----------------------------------------------------------------------------------------------------------------
class  Tv002{
     String channel;      int volume;
     public Tv002(){  }
     public Tv002(String channel,  int volume){ 
    	this.channel = channel;   this.volume = volume;
     }
     public void show(){
         System.out.println( "Tv채널 > " + channel );
         System.out.println( "Tv볼륨 > " + volume;);
     }
    public void input(){
         Scanner scanner = new Scanner(System.in);
         System.out.print( "Tv채널 > "  ); channel = scanner.next();
         System.out.print( "Tv볼륨 > "  ); volume = scanner.nextInt();
    }
}
public class Test{
    public static void main(String[] args){
    	Tv002  a1 = new Tv002(  "MBC" , 6 );   a1.show();
    	Tv002  a2 = new Tv002();     a2.input(); a2.show();
    }
}

----------------------------------------------------------------------------------------------------------------

파일명    :    ( Test ) 
위의 코드에서 생성되는 클래스명 : ( Tv002 / Test )

----------------------------------------------------------------
[method 정보] ( main  / Test )
----------------------------------------------------------------
[heap]                             |   [stack]
2000번지{channel= , volume= }  <------ |  [a2 | 번지       ]

1000번지{channel= , volume= }  <------ |  [a1 | 번지       ] 
		                           |  [main]
----------------------------------------------------------------



Q6.   클래스에서 사용가능한 변수들의 범위와 역할
6-1. 자바메모리구조 - RUNTIME DATA AREA
6-2. 
1) method area :  (   )
2) heap     area :  ( ###  )
3) stack     area :  ( ###  )



Q7. 다음파일을 확인하고 빈칸을 채우시오.
------------------------------------------------------------------------------------------
class A{
    int a;    
    static String company; 

    void method(){  int a=0; System.out.println(a);       }
    void    show(){             System.out.println(this.a);  } 

    public A(){   }
    public A(int a) {   this.a = a;   }  
}
---------------------------------------------------------------------------------------------


7-1. 변수의 종류
클래스(static)변수     :  ( company )      ,   메모리위치 영역 -  ( method )
인스턴스변수           :   ( this.a )      ,   메모리위치 영역 -  ( heap )
지역변수              :   ( a )      ,   메모리위치 영역 -  ( heap )

7-2. 초기화순서
                       기본값          명시적초기화      초기화블록      생성자
클래스변수               ( ###  )       ( ###  )        ( ###  )      ( ###  ) 
인스턴스변수 a=0         ( ###  )       ( ###  )        ( ###  )      ( ###  ) 


 
파일명 :     ( ###  ) 
클래스명 :  ( ###  /### )
----------------------------------------------------------------
[method 정보 - static, final ] ( ###  /### )
----------------------------------------------------------------
[heap]                             |   [stack]  
                                            
2000번지 { a  } <----------    [ a2 |  번지 ]     a2.a ->  this.a
1000번지 { a  } <----------    [ a1 |  번지 ]     a1.a ->  this.a
		           |  [main]
----------------------------------------------------------------
 

Q8.  오버로딩과 오버라이딩의 차이점은?
오버로딩:  ( ###   )
오버라이딩 : ( ###   )



Q9.  접근자의 범위를 넓은 순에서 좁은순으로 적으시오.
( ###   )

Q10.  final 의 의미는?
( ###   )






	
	
	*/
}
