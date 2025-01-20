package com.company.day007;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수) 와 행위(멤버함수)
class UserCard{
	int cardNum;
	boolean isMembership;
	static int width;
	static int height;
	public UserCard() { super(); cardNum=1; }

	String info() {return cardNum + ((isMembership)? "M":"");}

	public UserCard(int cardNum, boolean isMembership) {
		super();
		this.cardNum = cardNum;
		this.isMembership = isMembership;
	}
	
}


public class Class008_userCard {
	public static void main(String[] args) {
		System.out.println(UserCard.width + "/" + UserCard.height );
		UserCard card1 = new UserCard();
		System.out.println(card1.info());
		UserCard card2 = new UserCard(3, true);
		System.out.println(card2.info());
	}
}

/*		기본값	명시적	초기화	생성자
 * width  0		10		100		x
 * height 0		10		100		x
 * cardNum 0	0		0		1
 * isMembership falsex1
 * 
 * 
 * */