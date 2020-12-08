package com.differentJobs.app;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}

	@Override
	public String toString() {
		return "I'm maher" + name + " i'm " + age + " old, " ;
	}
	
	
	
}
