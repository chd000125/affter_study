package com.company.day008;
// Child(10,20,30)
class Parent {
    int i, j;
    public Parent(){   super();     }  //// 1) 누구 호출한것이지 적어주세요!  =>  Object
    public Parent(int i, int j) {	//#4
        super();  //// 2) 누구 호출한것이지 적어주세요!  =>  Object() #5
        this.i=i;
        this.j=j;
    }
}
class Child extends Parent {
    int k;
    public Child(){  super();  }  //// 3) 누구 호출한것이지 적어주세요! =>   Parent
    public Child(int i,int j,int k){ //#2
        super(i,j); //// 4) 누구 호출한것이지 적어주세요! => Parent(int i, int k) #3
        this.k=k;
    }
}
public class Polymorphism006 {
	public static void main(String[] args) {
        Child child=new Child(10,20,30);	//#1
        System.out.println(child.i);  //5) 결과 출력   
        System.out.println(child.j);  //5) 결과 출력   
        System.out.println(child.k); //5) 결과 출력   
	}
}

