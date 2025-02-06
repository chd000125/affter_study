package com.company.day015;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class Network003_xml {
		public static void main(String[] args) {
			try {
				//1. URL - 주소 설정
			String apiurl = "https://www.weather.go.kr/w/rss/dfs/hr1-forecast.do?zone=1168064000"
					+ URLEncoder.encode("oracle", "UTF-8");
				URL url = new URL(apiurl);
				
				//2. HttpURLConnection - 연결설정
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				
				//3. 요청설정 - GET(요청) / POST(서비스제공) - 보안문제걸림(헤더에 데이터 숨겨서 전달가능)
				//		필수 - query ( UTF-8 ) 쿼리스트링
				//		X-Naver-Client-Id : { 애플리케이션 등록 시 발급받은 클라이언트 아이디 값 }
				//		X-Naver-Client-Secret : {애플리케이션 등록 시 발급 받은 클라이언트 시크릿 값}
				
				conn.setRequestMethod("GET");
				//conn.setRequestProperty("X-Naver-Client-Id", "4WL0EKRJfpMnwFbebX3A");
				//conn.setRequestProperty("X-Naver-Client-Secret", "11qYR2heTx");
				
				//4. 응답확인
				BufferedReader br;
				int code =conn.getResponseCode(); System.out.println(code);
				if (code == 200) {br = new BufferedReader(new InputStreamReader (conn.getInputStream()));}
				else {br = new BufferedReader(new InputStreamReader (conn.getErrorStream()));}
				
				//5. 응답데이터 - csv / xml / json
				String line = ""; StringBuffer sb = new StringBuffer();
				while((line = br.readLine()) != null) {sb.append(line+"\n");}
				br.close(); conn.disconnect();
				//System.out.println(sb.toString());
				
				//5-2. xml
				Path path = Paths.get("src/com/company/day015/network003.xml");
				String result = sb.toString();
				BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
				bw.write(result);
				File file = new File("src/com/company/day015/network003.xml");
				
				
				//6. 필요한 데이터 처리
				//## 싱글톤(static메서드로 객체 생성) + 팩토리패턴(다른클래스의 객체를 가지고 객체생성)
				DocumentBuilderFactory factory =
						DocumentBuilderFactory.newDefaultInstance(); // static 객체생성 - 전역 - 데이터 공유가능.
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document 			doc = builder.parse(file); // import org.w3c.dom.Document;
				Element root 			= doc.getDocumentElement();
				NodeList items 			= doc.getElementsByTagName("item");
				//items -> [item,item,item]
				
				for (int i = 0; i < items.getLength(); i++) {
				Node item = items.item(i); System.out.println(item);
				 // NodeList ( 라이브컬렉션 - dom의 변경사항을 실시간 반영 / 텍스트, 속석(id,pw 등등)
				NodeList child = item.getChildNodes(); // {공백,<title></title>,공백,<link></link>,,,}
				//System.out.println(child.getLength()); // 13 = (공백 + 태그)갯수
				for (int j = 0; j < child.getLength(); j++) {
					Node data = child.item(j);
					if ( data.getNodeType() == Node.ELEMENT_NODE ) {
						String name = data.getNodeName();
						String value = data.getTextContent();
						if(name.equals("hour")) {
							System.out.println("HOUR : " + value);
						}//if
						else if(name.equals("temp")) {System.out.println("TEMP : " + value); }
					}//if
				}//for
			}//for
				
			} catch (Exception e) {
				e.printStackTrace();
				
				
				
			}
		}
	}
	/*
		1. Naver개발자 사이트에서 Book json가져오기
		https://developers.naver.com/docs/serviceapi/search/book/book.md#%EC%B1%85
	*/
