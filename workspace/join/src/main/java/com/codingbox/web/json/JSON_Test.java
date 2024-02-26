package com.codingbox.web.json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON_Test {
	public static void main(String[] args) {
		JSONObject in = new JSONObject();
		
		in.put("name", "김자바");
		in.put("gender", "남자");
		in.put("age", 20);
		
		System.out.println(in.toString());
		
		JSONObject out = new JSONObject();
		out.put("in", in);
		System.out.println(out.toString());
		System.out.println("-------------------------------");
		
		String json = out.toString();
		JSONParser parser = new JSONParser();
		JSONObject p_out = null;
		JSONObject p_in = null;
		String name = null;
		String gender = null;
		int age = 0;
		
		// json 형태로 parsing
		try {
			p_out = (JSONObject)parser.parse(json);
			p_in = (JSONObject) p_out.get("in");
			name = (String) p_in.get("name");
			gender = (String) p_in.get("gender");
			age = ((Long)p_in.get("age")).intValue();  
			System.out.println("name : " + name);
			System.out.println("gender : " + gender);
			System.out.println("age : " + age);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
