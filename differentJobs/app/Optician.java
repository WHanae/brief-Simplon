package com.differentJobs.app;

public class Optician extends Person{

	public Optician(String name, int age){
		super(name, age);
	}
	
	@Override
	public String display() {
		return super.display()+ " and i'm an optician";
	}

}
