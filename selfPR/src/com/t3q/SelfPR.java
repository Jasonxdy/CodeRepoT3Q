package com.t3q;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.t3q.model.Person;

public class SelfPR {
	public static void main(String[] args) {
		Map<String, Integer> knowledge = new HashMap<String, Integer>();
		Person dongyoung = new Person(1, "조동영", "경기도 수원시", knowledge);
		int age = 0;
		
		while (dongyoung.getAge() < 30) {
			age = dongyoung.getAge();
			knowledge = dongyoung.getKnowledge();
			
			if(age < 20) {
				
				if (age == 1) System.out.println("==== 유년기 ====");
				
				if (knowledge.get("근성") == null) knowledge.put("근성", 1);
				knowledge.put("근성",knowledge.get("근성") + 1);
				
			} else if (age < 27) {
				
				if (age == 20) System.out.println("==== 대학교 (생명공학과) 입학 ====");
				
				if (knowledge.get("코딩 욕구") == null) knowledge.put("코딩 욕구", 1);
				knowledge.put("코딩 욕구", knowledge.get("코딩 욕구") + 1);
				if (knowledge.get("사회성") == null) knowledge.put("사회성", 1);
				knowledge.put("사회성",knowledge.get("사회성") + 1);
				knowledge.put("근성",knowledge.get("근성") + 1);
				
			} else if (age < 29) {
				
				dongyoung.setAddr("서울시 동대문구");
				
				if (age == 27) System.out.println("==== 법률회사 입사 ====");
				knowledge.put("사회성",knowledge.get("사회성") + 5);
				
			} else {
				
				dongyoung.setAddr("서울시 금천구 독산동");
				
				System.out.println("==== 자바 웹 개발자 과정 ====");
				if (knowledge.get("프로그래밍 능력") == null) knowledge.put("프로그래밍 능력", 1);
				knowledge.put("프로그래밍 능력",knowledge.get("프로그래밍 능력") + 1);
				
			}
			
			age++;
			dongyoung.setAge(age);
			
		}
		System.out.println("안녕하세요 저는 " + dongyoung.getAddr() + "에 살고있는" + dongyoung.getAge() + "살 " + "신입사원 " + dongyoung.getName() + "입니다.\n"
				+ "잘 부탁드립니다!");
		System.out.println(knowledge);
	}
	
}
