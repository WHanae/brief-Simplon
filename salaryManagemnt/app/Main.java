package com.salaryManagemnt.app;

public class Main {
	
	
	public static void main(String[] args) {
		EmployeFixe tom = new EmployeFixe("tom", 6000.09);
		
		
		System.out.println(tom.toString());
		
		CommissionEmployer jerry = new CommissionEmployer(200, 0.7);
		
		System.out.println(jerry.commission(tom));
		
		HourlyEmployee bar = new HourlyEmployee(100, 20);
		System.out.println(bar.pay());
	}

}
