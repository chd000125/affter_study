package com.company.day015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Network003_json {
	public static void main(String[] args) {
		try {
			//1. URL - 주소 설정
		String apiurl = "https://openapi.naver.com/v1/search/book.json?query="
				+ URLEncoder.encode("oracle", "UTF-8");
			URL url = new URL(apiurl);
			
			//2. HttpURLConnection - 연결설정
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
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

			//2.) Gson
			// https://mvnrepository.com/artifact/com.google.code.gson/gson/2.2.4
			// 프로젝트 - build path - 3번째 탭 = classpath - Jar External
			
			
			//6. 필요한 데이터 처리
			String result = sb.toString();
			JsonParser parser = new JsonParser();
			JsonObject job = (JsonObject) parser.parse(result);
			JsonArray arr = (JsonArray) job.get("items");
			
			//System.out.println(arr.get(0));
			for (int i  = 0; i <arr.size(); i++) {
			JsonObject data = (JsonObject) arr.get(i);
			String title = data.get("title").getAsString();
			String description = data.get("description").getAsString();
			System.out.println("\n\n=======================");
			System.out.println("TITLE : " + title);
			System.out.println("DESCRIPTION : " + description);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
	1. Naver개발자 사이트에서 Book json가져오기
	https://developers.naver.com/docs/serviceapi/search/book/book.md#%EC%B1%85
*/