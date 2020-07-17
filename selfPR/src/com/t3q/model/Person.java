package com.t3q.model;

import java.util.Map;

public class Person {
	
	private int age;
	private String name;
	private String addr;
	private Map<String, Integer> knowledge;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int age, String name, String addr, Map<String, Integer> knowledge) {
		super();
		this.age = age;
		this.name = name;
		this.addr = addr;
		this.knowledge = knowledge;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Map<String, Integer> getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(Map<String, Integer> knowledge) {
		this.knowledge = knowledge;
	}
	
	
	
		
}

