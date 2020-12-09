package com.differentJobs.app;

public class Doctor extends Person {
	
	public Doctor(String name, int age){
		super(name, age);
		
	}
	
	@Override
	public String display() {
		return super.display() + " and i'm a doctor";
	}
	
}
