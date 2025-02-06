package com.company.day014;

import java.io.File;
import java.io.IOException;

public class IO001 {
	public static void main(String[] args) {
		//1. 폴더 - 파일만들기
		//String folder_rel = "src/com/company/day014/";
		String folder_rel = "C:\\file\\";
		String file_rel = "file001.txt";
		
		File folder = new File ( folder_rel ); // 경로 확인
		File file = new File ( folder_rel + file_rel ); // 경로 + 파일 이름 => 파일 확인
		
		if ( !folder.exists() ) { folder.mkdir();} //  폴더 존재하지 않으면 mkdir (만들기)
		if ( !file.exists() ) { try { file.createNewFile(); 
			System.out.println("폴더 / 파일 준비 완료! ");
		} catch (IOException e) { e.printStackTrace(); } }
		// 파일이 존재 하지 않으면 만들기 | 단, 실패할 수 있으니 try catch 사용(폴더가존재하지않을수있음)
		
		
	}// end Main
}// end Class
