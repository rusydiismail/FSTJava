package com.javabasics.ifelse;

import java.util.Scanner;

public class GuessMe {

	public static void main(String[] args) {
		int num = 50;
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("I've chosen a number. Betcha can't guess it!");
		System.out.print("Your guess: ");
		
		int input = scanner.nextInt();
		if(input == num) {
			System.out.println(input + " Wow, nice guess! That wa it!");
		} 
		else if(input < num) {
			System.out.println(input + " Ha, nice try - too low! I chose " + num + ".");
		}
		else {
			System.out.println(input + " Too bad, way too high. I chose " + num + ".");
		}
		scanner.close();
	}
}
