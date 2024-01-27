package com.codtechitsolutions.basiccalculator;

import java.util.Scanner;

public class BasicCalculatorRunner {

	public static void main(String[] args) {
		
		BasicCalculator calculator = new BasicCalculator();
		
		double num1,num2;
		double result;
		
		// Scanner for getting input from user
		Scanner sc = new Scanner(System.in);
		
		char ch = 'y';
		
		while(ch == 'y') {
			
			// Welcome message
			System.out.println("----------Welcome to Basic Calculator App----------");
		
			// Menu display for Calculator App
			System.out.println("Which operation would you like to perform?");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("Please enter your choice below:");
			int choice = 0;
			try {
				choice = sc.nextInt();
			} catch(Exception e) {
				sc.nextLine();
			}
			
			switch(choice) {
				case 1: // Taking numbers for calculation from user
						System.out.println("Please enter number1: ");
						num1 = sc.nextDouble();
						System.out.println("Please enter number2: ");
						num2 = sc.nextDouble();
						result = calculator.addition(num1, num2);
						System.out.println("Result: "+result);
						break;
				case 2: // Taking numbers for calculation from user
						System.out.println("Please enter number1: ");
						num1 = sc.nextDouble();
						System.out.println("Please enter number2: ");
						num2 = sc.nextDouble();
						result = calculator.subtraction(num1, num2);
						System.out.println("Result: "+result);
						break;
				case 3: // Taking numbers for calculation from user
						System.out.println("Please enter number1: ");
						num1 = sc.nextDouble();
						System.out.println("Please enter number2: ");
						num2 = sc.nextDouble();
						result = calculator.multiplication(num1, num2);
						System.out.println("Result: "+result);
						break;
				case 4: // Taking numbers for calculation from user
						System.out.println("Please enter number1: ");
						num1 = sc.nextDouble();
						System.out.println("Please enter number2: ");
						num2 = sc.nextDouble();
						result = calculator.division(num1, num2);
						System.out.println("Result: "+result);
						break;
				default: System.out.println("Invalid option chosen!");
						 break;
			}
			
			System.out.println("Do you want to continue? (y/n)");
			ch = sc.next().charAt(0);
		}
	}

}
