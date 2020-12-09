package com.salaryManagemnt.app;

// pour la class abstrait , on peut pas les instanciers , sauf pour leur fils 
 //public abstract class Employee{
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
