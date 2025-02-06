package com.company.day015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Network002_naver {
	public static void main(String[] args) {
		try {
		//1. URL - https://openapi.naver.com/v1/search/news.xml 
		//		 - https://openapi.naver.com/v1/search/news.json 
		String apiUrl = "https://openapi.naver.com/v1/search/news.xml?query="
					+ URLEncoder.encode("AI","UTF-8");
		URL url = new URL(apiUrl);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		//2. HttpURLConnection
		
		//3. 요청설정 - GET(요청) / POST(서비스제공) - 보안문제걸림(헤더에 데이터 숨겨서 전달가능)
		//		필수 - query ( UTF-8 ) 쿼리스트링
		//		X-Naver-Client-Id : { 애플리케이션 등록 시 발급받은 클라이언트 아이디 값 }
		//		X-Naver-Client-Secret : {애플리케이션 등록 시 발급 받은 클라이언트 시크릿 값}
		conn.setRequestMethod("GET");
		conn.setRequestProperty("X-Naver-Client-Id", "4WL0EKRJfpMnwFbebX3A");
		conn.setRequestProperty("X-Naver-Client-Secret", "11qYR2heTx");
		
		//4. 응답확인
		BufferedReader br;
		int code =conn.getResponseCode(); System.out.println(code);
		if (code == 200) {br = new BufferedReader(new InputStreamReader (conn.getInputStream()));}
		else {br = new BufferedReader(new InputStreamReader (conn.getErrorStream()));}
		
		//5. 응답데이터 - csv / xml / json
		String line = ""; StringBuffer sb = new StringBuffer();
		while((line = br.readLine()) != null) {sb.append(line+"\n");}
		System.out.println(sb.toString());
		br.close(); conn.disconnect();
		
		//필요한 데이터 처리
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
