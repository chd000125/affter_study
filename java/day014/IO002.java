package com.company.day014;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO002 {
	public static void main(String[] args) {
		String folder_rel = "src/com/company/day014/";
		String file_rel = "file002.txt";
		
		//1. folder + file 준비
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		if(!folder.exists()) { folder.mkdir();}
		if(!file.exists()) { try { file.createNewFile();
			System.out.println("파일 / 폴더 준비 완료! ");
		} catch (IOException e) {  e.printStackTrace(); } }
		
		//2. byte 단위로 파일 쓰기 (프로그램이 쓰는 것이므로 Output
		//	InputStream	-> 프로그램 -> OutputStream [#] | 프로그램 기준으로 생각.
			try { OutputStream output = new FileOutputStream(file);   // byte 단위
				output.write('c');
				output.write('o');
				output.write('l');
				output.write('d');
				output.flush();
				output.close(); // 닫지 않으면 다른 곳의 write 가 작동을 하지 않음. -> 아직 write 가 끝나지 않았다고 판단함.
				System.out.println("쓰기 완료");
			}
			catch (Exception e) { e.printStackTrace(); } 
			
		
		//3. byte 단위로 파일 읽기 (프로그램이 읽는 것이므로 Input
		//  InputStream [#]	-> 프로그램 -> OutputStream 
			try { InputStream input = new FileInputStream(file);
				//System.out.println(input.read()); // c -> 99
				int cnt = 0;
				while ( (cnt=input.read()) != -1 ) {
					System.out.print( (char)cnt );
				}
				input.close(); // 닫지 않으면 다른 곳의 read 가 작동을 하지 않음. -> 아직 read 가 끝나지 않았다고 판단함.
			} catch (Exception e) {
				e.printStackTrace();
			} // byte 단위
			
	}
}
