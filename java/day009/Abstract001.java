package com.company.day009;

//설계 목적 : abstract 클래스 추상화 정도가 떨어짐 / 인스턴스 사용가능.
abstract class Animal1{
	String name; int age;
	//추상 메서드가 있으면 반드시 추상 클래스로 만들어줘야함.
	//추상 메서드들은 {} <- 구현부분이 없다. => 공통의 속성은 구체적인 내용이 없음.
	abstract void eat();
	abstract void sleep();
	abstract void poo(); // 일반화, 추상화, 설계 : 공통적인 속성 & 행동
}
class Cat extends Animal1{
 @Override void eat() {System.out.println(name + "냠냠");}
 @Override void sleep() {System.out.println(name + "Zzz");} 
 @Override void poo() {System.out.println(name +"시원");} // 고양이는 동물이다. 
 }
class Dog extends Animal1{

	@Override void eat() {System.out.println(name + "ㅁ");}

	@Override void sleep() {System.out.println(name + "s");}

	@Override void poo() {System.out.println(name + "d");} 
}

public class Abstract001 {
	public static void main(String[] args) {
		// 구현부분이 없기 때문에 인스턴스화를 못함 -> new 는 heap 공간에 메모리를 빌리고 객체를 생성하는데 생성자를 부르고 초기화 하는 과정이 없음.
		//Animal1 ani = new Animal1(); //Cannot instantiate the type Animal1
		Animal1 ani = new Cat(); // 부모는 자식을 담을 수 있는 업캐스팅, 타입캐스팅 필요X 
		ani.name = "찡이"; ani.age = 10; ani.eat(); ani.sleep(); ani.poo();
		
		ani = new Dog();
		ani.name = "a"; ani.age = 20; ani.eat(); ani.sleep(); ani.poo();
		
		Animal1 [] arr = { new Cat(), new Cat(), new Dog(), new Dog() };
		// 한개의 자료형으로 (Animal1) 여러타입 관리하려고 사용.
		arr[0].name = "a"; arr[1].name = "b"; arr[2].name = "c"; arr[3].name = "d";
		for (int i = 0; i <arr.length; i++) {
			arr[i].eat();
		}
		
		
		
	}
}
