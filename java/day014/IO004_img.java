package com.company.day014;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IO004_img {
	public static void main(String[] args) throws Exception {
		String origin="src/com/company/day014/neon.jpg";
		String target1="src/com/company/day014/neon1.jpg";
		String target2="src/com/company/day014/neon2.jpg";
		
		
		//이미지파일 읽고 쓰기
		//1. byte 네온 -> 네온1
		// InputStream (읽기) > [program] > OutputStream(쓰기)
		InputStream bis = new FileInputStream(origin);
		OutputStream bos = new FileOutputStream(target1);
		
		int cnt1 = 0;
		while((cnt1=bis.read()) != -1 ) { // 마지막에는 항상 -1을 반환
			bos.write((byte)cnt1);
		}
		bos.flush(); bos.close(); bis.close();
		System.out.println(" >> 이미지 복사 완료 "); // byte 단위는 모든
		
		//2. char
		// Reader(읽기) > [Program] > Writer(쓰기)
		Reader cr = new FileReader(origin);
		Writer cw = new FileWriter(target2);
		
		int cnt2 = 0;
		while ((cnt2=cr.read()) != -1 ) { // 마지막에는 항상 -1을 반환
			cw.write((char)cnt2);
		}
		cw.flush(); cw.close(); cr.close();
		System.out.println(" >> 이미지 복사 완료22"); // char 단위는 문자전용. >> 이미지 복사 실패
	}
}
