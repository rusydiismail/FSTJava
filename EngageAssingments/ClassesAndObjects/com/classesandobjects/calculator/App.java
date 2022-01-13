package com.classesandobjects.calculator;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("Select which operations you would like to calculate ( +, -, *, / ) or quit.");
			String input = scanner.nextLine();
			
			if(input.equals("quit")) {
				break;
			}
			
			if(input.equals("+")) {
				System.out.println("Which 2 values would you like to calculate? ");
				int input1 = scanner.nextInt();
				int input2 = scanner.nextInt();
				sc.addition(input1, input2);
			}
			
			if(input.equals("-")) {
				System.out.println("Which 2 values would you like to calculate? ");
				int input1 = scanner.nextInt();
				int input2 = scanner.nextInt();
				sc.subtraction(input1, input2);
			}
			
			if(input.equals("*")) {
				System.out.println("Which 2 values would you like to calculate? ");
				int input1 = scanner.nextInt();
				int input2 = scanner.nextInt();
				sc.multiplication(input1, input2);
			}
			
			if(input.equals("/")) {
				System.out.println("Which 2 values would you like to calculate? ");
				int input1 = scanner.nextInt();
				int input2 = scanner.nextInt();
				sc.division(input1, input2);
			}
		}
		scanner.close();
		System.out.println("Thank you");
	}
}
