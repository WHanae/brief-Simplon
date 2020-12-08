package com.differentJobs.app;

public class Doctor extends Person {
	
	public Doctor(String name, int age){
		super(name, age);
		
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " and i'm a doctor";
	}
	
}
