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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class IO006_Ex {
	public static void main(String[] args) throws Exception{
		Calendar today = Calendar.getInstance();
		String folder_rel = "src/com/company/day014/";
		String file_rel = "file006_";
		String file_character = ".txt";
		String network = "src/com/company/day014/file005.txt";
		
		//1. folder + file 생성
		// Calendar 이용해서 file006_20250204.txt 파일명 변경
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel + today.get(1) + today.get(2) + today.get(5)+ file_character );

		if (!folder.exists()) {folder.mkdir();}
		if (!file.exists()) {try {
			file.createNewFile();
			System.out.println("폴더 / 파일 준비완료");
		} catch (IOException e) { e.printStackTrace(); }}
		
		//2. 파일 쓰기 (byte 단위)
		// InputStream > [program] > OutputStream[#]
		// BufferedWriter(속도 향상) - OutputStreamWriter(단어) - FileOutputStream
		// flie05.txt 읽어들이기
		InputStream is = new FileInputStream(network); // 이전 파일 읽어오기
		BufferedWriter bw = new BufferedWriter( // 속도 향상
				new OutputStreamWriter( // char 로 변환하고
						new FileOutputStream(file))); // byte 로 읽어서
		 bw.write("1,white,1200\n");
		 bw.write("2,choco,1500\n");
		 bw.write("3,banana,1800\n");
		 bw.flush(); bw.close();
		 // 직접 입력가능.
		/*
		int cnt1 = 0;
		while ((cnt1 = is.read()) != -1) { // 읽어온 파일내용
			bw.write(cnt1); // 만든 파일에 쓰기
		}
		bw.flush(); bw.close();
		*/
		
		//3. 파일 읽기 (byte 단위)
		//InputStream[#] > [program] > OutputStream]
		// a->a b->b c->c =속도 향상=> abc->abc
		// BufferedWriter(속도 향상) - InputStreamWriter(단어) - FileInputStream
		
		BufferedReader br = new BufferedReader( // 속도 향상
				new InputStreamReader( //char 로 변환하고
						new FileInputStream(file))); // byte 로 읽어서
		String line = ""; // 읽어올 "줄"내용
		StringBuffer sb = new StringBuffer(); // 속도향상 -> 통채로 들고오기
		
		while ((line = br.readLine()) != null) { // 읽어온 내용 라인에 저장
			sb.append(line+"\n"); // 라인의 내용 표시
		}
		System.out.println(sb.toString());
		br.close();
		String result = sb.toString();
		// 4. 파일 검색
		/*	원하는 우유번호를 입력하시오. _번호입력 예) 1
			1 white 1200
			csv 1,white,1200
			
			* 변수 < 배열 < 클래스 < 콜렉션프레임워크(List, Set, Map) < 파일# < DB
			* 1. class Milk { private int no; private String name; private int price; }
					alt + shift + s ( 생성자, toString, getters/setters )
			* 2. 읽어들일 때 1 white 1200 문자열 분리 split("")
			* 3. ArrayList에 담기
		*/
		ArrayList<Milk> list = new ArrayList<>();
		String[] arr = result.split("\n");
		for (String data : arr) {
			String[] d = data.split(","); // 1 white 1200
			//System.out.println(d[0] + "/" + d[1] + "/" + d[2]);
			//4. list 에 데이터 담기 list.add(new Milk( d[0], d[1], d[2] )
			list.add(new Milk( Integer.parseInt(d[0]), d[1], Integer.parseInt(d[2])));
			// String -> Integer Integer.parseInt()
		}// end for
		System.out.println(list);
		
		//5. 사용자에게 번호 입력 받기 ( scanner )
		//6. 입력받은 번호가 해당번호와 같다면 해당데이터 출력
		//6-1. 밀크한개 데이터 단위 - list.get(0) 0번의 데이터, list.get(1) 1번의 데이터
		//6-2. 단위안에 있는 번호 - list.get(0).getNo()
		//6-3. 번호가 5번에서 입력받은 번호와 같다면 출력 list.get(번호)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호를 입력해주세요 >> ");
		int no = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (no == list.get(i).getNo()) {
				System.out.println(list.get(i));
				break;
			}
		}
		
		
		
		
		
	}
}
