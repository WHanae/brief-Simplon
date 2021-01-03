package com.brief1.app;

import java.util.Scanner;

public class PaymentSimuator {
	
	public static void main(String[] args) {
		System.out.println("Good morning!");
		Scanner nameIn = new Scanner(System.in);
		System.out.print("Please enter your firstname and lastname: ");
		String name = nameIn.nextLine();
		
		System.out.println("You are welcome mr " + name); 
		
		Scanner hourIn = new Scanner(System.in);
		System.out.print("Please enter the number of hour worked :");
		int numOfHours = hourIn.nextInt();
		
		Scanner tariffIn = new Scanner(System.in);
		System.out.print("Please enter your rate per hour :");
		double tariffPerHours = tariffIn.nextInt();
		//double tariffPerhours = tariffPerHours * (numOfHours-40);
		//double extraTariff = tariffPerHours + 0.5 * tariffPerHours;
		double tarifextra = (tariffPerHours+tariffPerHours*0.5)*(numOfHours-40);
		
		if(numOfHours < 40) {
			double finalTarrif = (numOfHours * tariffPerHours);
			System.out.println("the final tarrif is: "+ finalTarrif);	
		}
		
		else if(numOfHours <= 60) {
			System.out.println("your compensation is "+ extraTariff);
			//double finalTarrif = (numOfHours * tariffPerHours) + extraTariff;
			// correction au niveau de calcul
				double finalTarrif = (40 * tariffPerHours) + tarifextra;
			System.out.println("the final tarrif is: "+ finalTarrif);
		}

		else {
			System.out.println("wrong information");
		}
		
	}

}
