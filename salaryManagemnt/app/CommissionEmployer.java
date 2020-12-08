package com.salaryManagemnt.app;

public class CommissionEmployer extends Employee {
	int sales;
	double commission;
	
	public CommissionEmployer(int sales, double commission) {
		super();
		this.sales = sales; 
		this.commission = commission;
	}
	
	public double commission(Employee e) {
		// salaire mensuel = salaire + ventes * commission;
		double monthlySalary = e.getSalary() + (this.sales * this.commission);
		return monthlySalary;
	}
	
	@Override
	public String toString() {
		return super.toString() + "your monthly salary is :" + this.sales + this.commission ;
	}
	
	

}
