package com.company.day009;

interface BankProcess { void exec();}

class BankAdd implements BankProcess{
	@Override public void exec() { 
		System.out.println("1. 추가기능입니다.");
	} 
}

class BankRead implements BankProcess{
	@Override public void exec() {
		System.out.println("2. 조회기능입니다.");
	} 
}

class BankIn implements BankProcess{
	@Override public void exec() {
		System.out.println("3. 입금기능입니다.");
	} 
}

class BankOut implements BankProcess{
	@Override public void exec() {
		System.out.println("4. 출금기능입니다.");
	} 
}

class BankDel implements BankProcess{
	@Override public void exec() {
		System.out.println("5. 삭제기능입니다.");
	} 
}


public class MiniBank_v5 {
	public static void main(String[] args) {
		BankProcess[] process = {new BankAdd(),new BankRead(),new BankIn(),new BankOut(),new BankDel(),};
		for (BankProcess p : process) {p.exec();}
	}
}
