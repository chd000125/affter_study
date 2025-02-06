package com.company.day015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Network001 {
	public static void main(String[] args) {
		//1. Java URL 연결
		try {
			URL url = new URL("https://www.google.com");

		//2. 연결객체 ( HttpURLConnerction )
		//				  부모 = 자식 -> 다운캐스팅/타입캐스팅 필요O
		// 				  자식  = 				   부모 (업캐스팅/타입캐스팅 필요X)
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		//3. 요청 설정
		conn.setDoInput(true); // 
		conn.setDoOutput(true); // 
		conn.setReadTimeout(1000); //
		conn.setRequestMethod("GET"); // 주소표시창줄에 데이터 노출
		
		
		//4. 응답코드 - 200(성공)
		int code = conn.getResponseCode();
//		System.out.println(conn.getResponseCode());
		
		//5. 응답데이터 얻기
		BufferedReader br;
		if (code == 200) {
			br = new BufferedReader(new InputStreamReader( conn.getInputStream() ));
		} else {// 에러 발생
			br = new BufferedReader(new InputStreamReader( conn.getErrorStream() ));
		}
		String line = ""; StringBuffer sb = new StringBuffer();
		while ( (line=br.readLine()) != null ) {
			sb.append(line+"\n");
		}
		System.out.println(sb.toString());
		br.close(); conn.disconnect();
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
	1. 네이버 개발자 사이트
	2. 애플리케이션
	Client ID : 4WL0EKRJfpMnwFbebX3A
	Client Secret : 11qYR2heTx

*/