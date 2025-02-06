package com.company.day015;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Revice_IO {
	public static void main(String[] args){
		String folder_rel = "src/com/company/day015/";
		String file_rel = "Test001.txt";
		
		//폴더, 파일 생성
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		if (folder.exists()) {folder.mkdir();}
		if (file.exists()) {
			try { file.createNewFile();
			System.out.println("폴더 / 파일 준비완료");
			} catch (IOException e) { 
				e.printStackTrace(); }} 
		
		// 파일쓰기(byte)
		// byte로 받아서 char로 읽고 속도향상
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			bw.write("apple\n"); bw.write("banana\n"); bw.write("coconut\n");
			bw.flush(); bw.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		// 파일읽기 (byte)
		
		
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line = "";
			StringBuffer sb = new StringBuffer();
			while ((line=br.readLine()) != null) {
				sb.append(line+"\n");
			}
			System.out.println(sb.toString());
			br.close();
		} catch (Exception e) {  e.printStackTrace(); }
		
		
		
		
		
		
	}
}
