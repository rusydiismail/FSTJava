package com.javabasics.ifelse;

import java.util.Scanner;

public class TriviaNight {

	public static void main(String[] args) {
		int marks = 0;
		int remain = 3;
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("It's TRIVIA NIGHT! Are you ready?!\n");
		System.out.println("FIRST QUESTION!");
		System.out.println("What is the Lowest Level Programming Language?");
		System.out.println("1) Source Code         2) Assembly Language");
		System.out.println("3) C#                  4) Machine Code\n");
		System.out.print("YOUR ANSWER: ");
		
		int inputFirst = scanner.nextInt();
		remain--;
		if(inputFirst == 4) {
			marks++;
			System.out.println("Correct!");
			System.out.println("Current score: " + marks + "/3");
			System.out.println("Remaing questions: " + remain);
		}
		else {
			System.out.println("Your choice " + inputFirst + " is incorrect, the correct answer is '4'");
			System.out.println("Current score: " + marks + "/3");
			System.out.println("Remaing questions: " + remain);
		}
		
		System.out.println("\n");
		System.out.println("SECOND QUESTION!");
		System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
		System.out.println("1) Grace Hopper        2) Alan Turing");
		System.out.println("3) Charles Babbage     4) Larry Page\n");
		System.out.print("YOUR ANSWER: ");
		
		int inputSecond = scanner.nextInt();
		remain--;
		if(inputSecond == 2) {
			marks++;
			System.out.println("Correct!");
			System.out.println("Current score: " + marks + "/3");
			System.out.println("Remaing questions: " + remain);
		}
		else {
			System.out.println("Your choice " + inputSecond + " is incorrect, the correct answer is '2'");
			System.out.println("Current score: " + marks + "/3");
			System.out.println("Remaing questions: " + remain);
		}
		
		System.out.println("\n");
		System.out.println("LAST QUESTION!");
		System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
		System.out.println("1) Serenity            2) The Battlestar Galactica");
		System.out.println("3) The USS Enterprise  4) The Millennium Falcon\n");
		System.out.print("YOUR ANSWER: ");
		
		int inputThird = scanner.nextInt();
		remain--;
		if(inputThird == 3) {
			marks++;
			System.out.println("Correct!");
			System.out.println("Current score: " + marks + "/3");
			System.out.println("Remaing questions: " + remain);
		}
		else {
			System.out.println("Your choice " + inputThird + " is incorrect, the correct answer is '3'");
			System.out.println("Current score: " + marks + "/3");
			System.out.println("Remaing questions: " + remain);
		}
		System.out.println("\n");
		if(marks == 3) {
			System.out.println("Awesome!");
		}
		scanner.close();
		System.out.println("Nice job - you got " + marks + " correct!");
	}

}
