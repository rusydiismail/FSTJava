package com.classesandobjects.calculator;

public class SimpleCalculator extends App {

	public void addition(int x, int y) {
		int result = x + y;
		System.out.println("The result is: " + result);
	}
	
	public void subtraction(int x, int y) {
		int result = x - y;
		System.out.println("The result is: " + result);
	}
	
	public void multiplication(int x, int y) {
		int result = x * y;
		System.out.println("The result is: " + result);
	}
	
	public void division(int x, int y) {
		double result = x / y;
		System.out.println("The result is: " + result);
	}
}
