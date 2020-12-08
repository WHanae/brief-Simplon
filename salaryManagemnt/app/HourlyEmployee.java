package com.salaryManagemnt.app;

public class HourlyEmployee extends Employee{
	
	double hourlyRate;
	double hourWorked;

	public HourlyEmployee( double hourlyRate, double hourWorked) {
		this.hourlyRate = hourlyRate;
		this.hourWorked = hourWorked;
	}
	
	public double pay() {
		double mensualSalary = hourlyRate * hourWorked;
		return mensualSalary;
	}

	@Override
	public String toString() {
		return super.toString() + "your mensual salary: " + this.pay();
	}
	
	

}
