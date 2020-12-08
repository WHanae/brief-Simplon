package com.salaryManagemnt.app;

public class Employee {
	String nom; 
	double salary;
	
	public Employee() {
		
	}
	
	public Employee(String nom, double salary) {
		super();
		this.nom = nom;
		this.salary = salary;

	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee name is : " + this.nom +" and salary is: "+ this.salary;
	}
}
