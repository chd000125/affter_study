package SelfTest;
class A11{
static int a; // (1) 지역 변수
A11(){ }
A11(int a){ this.a = a; } // (2) 인스턴스 변수
//(3) void show() 인스턴스 메서드
void show() { this.a =11; System.out.println( this.a ); }
//(4) static void classMethod() 클래스 메서드
static void classMethod() { this.a = 12; }
//(5) int show2() 인스턴스 메서드
int show2(int a){ return a; }
}
public class SelfTest024 {
	public static void main(String []args) {
		A11 a1 = new A11(); //(6)
	} // end main
} // end class
/*
Q1  다음문제에서 (1),(2),(3),(4),(5)를
[ 클래스변수, 인스턴스변수, 지역변수 , 클래스메서드, 인스턴스메서드 ]에서 고르시오.

Q2  클래스 A11에서 오류나는 곳을 수정하고 그 이유를 적으시오.
int a 보다 classMethod가 먼저 메모리공간상에 올라가기 때문에 int a를 인식 할 수 없음. 따라서 오류
Q3 (6)번위치에서

메모리 빌려오고, 객체 생성하는 역할  : (new)

String은 null, int는 0으로 초기화하는 역할 : (A11())
new A11()한 주소를 갖고 있는 것은 : (a1)

Q4 기본생성자를 반드시 선언해야하는 경우를 적으시오.
	같은 이름의 생성자를 따로 선언 할 시 반드시 기본생성자를 선언하여 초기값(기본값)을 설정해 줘야 한다.

*/