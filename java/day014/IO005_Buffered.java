package com.company.day014;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IO005_Buffered {
	public static void main(String[] args) throws Exception {
		
		String folder_rel = "src/com/company/day014/";
		String file_rel = "file005.txt";
		String network = "src/com/company/day014/file003.txt";
		
		//1. 폴더 + 파일 만들기
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		if(!folder.exists()) {folder.mkdir();}
		if(!file.exists()) {try { file.createNewFile();
			System.out.println("폴더 / 파일 생성완료");
		} catch (IOException e) { e.printStackTrace(); }}
		
		//2. 파일 쓰기 (byte 단위)
		// InputStream > [program] > OutputStream[#]
		// BufferedWriter(속도 향상) - OutputStreamWriter(단어) - FileOutputStream
		// file003.txt 파일 읽어와서 file005.txt 에 쓰기
			InputStream is = new FileInputStream(network);
			BufferedWriter bw = new BufferedWriter( // 속도향상
									new OutputStreamWriter( // (char 단위)단어로 처리 (Writer)
										new FileOutputStream(file) ) ); // byte 단위 읽어와서 (Stream)

		int cnt1 = 0;
		while ((cnt1 = is.read()) != -1) {
			bw.write(cnt1);
		}
		bw.flush(); bw.close();
		
		//3. 파일 읽기 (byte 단위)
		//InputStream[#] > [program] > OutputStream]
		// a->a b->b c->c =속도 향상=> abc->abc
		// BufferedWriter(속도 향상) - InputStreamWriter(단어) - FileInputStream
		BufferedReader br = new BufferedReader(
								new InputStreamReader(
									new FileInputStream(file)));
		String line = ""; // line = "a" =>(a : 1000번지) , line += "b" (ab : 1001번지) 문자열에 문자열을 더하면 주소가 갱신됨. 
		StringBuffer sb = new StringBuffer(); // sb.append("a"), sb.append("ab") (sb : 2000번지) 주소가 갱신되지 않음. => 원래 주소값 사용.
		while ((line = br.readLine()) != null) {
			sb.append(line+"\n");
			
		}
		System.out.println(sb.toString());
	}
}
/*
	1. white 1200
	2. Choco 1500
	3. banana 1800


*/