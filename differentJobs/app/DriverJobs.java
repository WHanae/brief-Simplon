package com.differentJobs.app;

public class DriverJobs {

	public static void main(String[] args) {
		Person[] person = new Person[2];
		
		person[0] = new Doctor("Maher",31);
		person[1] = new Optician("Iman",33);
		
		
		for (int i = 0; i < person.length; i++)
			System.out.println(person[i].toString());

	}
	
	
}
