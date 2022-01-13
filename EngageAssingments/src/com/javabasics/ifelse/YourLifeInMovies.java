package com.javabasics.ifelse;

import java.util.Scanner;

public class YourLifeInMovies {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Hey, let's play a game! What's your name? ");
		String inputName = scanner.nextLine();
		
		System.out.print("Ok, " + inputName + ", when were you born? ");
		int inputYear = scanner.nextInt();
		
		System.out.println("Well " + inputName + "...");
		if(inputYear < 1965) {
			System.out.println("MASH TV series has been around for almost half a century!");
		}
		if(inputYear < 1975) {
			System.out.println("Original Jurassic Park release is closer to the first lunar landing than it is to today.");
		}
		if(inputYear < 1985) {
			System.out.println("Space Jam came out not last decade, but the one before THAT.");
		}
		if(inputYear < 1995) {
			System.out.println("The first Harry Potter came out over 15 years ago.");
		}
		if(inputYear < 2005) {
			System.out.println("Pixar's 'Up' came out over a decade ago.");
		}
		scanner.close();
	}
}
