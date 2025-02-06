package com.company.day015;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Network004_json {
	public static void main(String[] args) {
		Gson gson = new Gson();
		JsonObject job = new JsonObject();
		job.addProperty("one", "일");
		job.addProperty("two", "이");
		job.addProperty("three", "삼");
		job.addProperty("four", "사");
		System.out.println(gson.toJson(job));
		
		System.out.println(gson.toJson(new GTest(1,"hello")));
		System.out.println(gson.toJson(new GTest2("alpha", 3, "경기시흥시")));
		
		JsonObject ex = new JsonObject();
		
		ex.addProperty("name", "alpha");
		ex.addProperty("age", 3);
		ex.addProperty("loc", "시흥");
		
		String result = gson.toJson(ex); System.out.println(result);
		
		JsonParser parser = new JsonParser();
		JsonObject ex_result = (JsonObject) parser.parse(result);
		String name = ex_result.get("name").getAsString();
		String age = ex_result.get("age").toString();
		String loc = ex_result.get("loc").getAsString();
		
		System.out.println( name + "/" + age + "/" + loc );
		
	}
}

class GTest{
	private int no;
	private String name;
	public GTest(int no, String name) {
		super(); this.no = no; this.name =name;
	}
}
class GTest2{
	private String name;
	private int age;
	private String loc;
	public GTest2(String name, int age, String loc) {
		super();
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	
}

//2.) Gson
// https://mvnrepository.com/artifact/com.google.code.gson/gson/2.2.4
// 프로젝트 - build path - 3번째 탭 = classpath - Jar External