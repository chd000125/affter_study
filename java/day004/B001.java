package com.company.day004;

public class B001 {
	public static void main(String[] args) {
		int cnt = 0;
		for (int ch = 1; ch<=30; ch++) { 
			if((ch%2)==0 && (ch%3)==0) {
				System.out.println(++cnt +". 2의 배수이면서 3의 배수인 수는 : "+ch); 
			}
			 
		}
	}
}
