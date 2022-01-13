package com.javabasics.ifelse;

import java.util.Scanner;

public class FieldDay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String teamName;

        System.out.print("What's your last name? ");
        String userLastName = scanner.nextLine().toLowerCase();
        
        char initial = userLastName.charAt(0);

        if(initial <= 'b') {
        	teamName = "Red Dragons";
        	System.out.println("Aha! You're on the team " + teamName + "!");
        }
        
        if(initial >= 'b' && initial <= 'd') {
        	teamName = "Dark Wizards";
        	System.out.println("Aha! You're on the team " + teamName + "!");
        }
        
        if(initial >= 'd' && initial <= 'h') {
        	teamName = "Moving Castles";
        	System.out.println("Aha! You're on the team " + teamName + "!");
        }
        
        if(initial >= 'h' && initial <= 'p') {
        	teamName = "Golden Snitches";
        	System.out.println("Aha! You're on the team " + teamName + "!");
        }
        
        if(initial >= 'p' && initial <= 'v') {
        	teamName = "Night Guards";
        	System.out.println("Aha! You're on the team " + teamName + "!");
        }
        
        if(initial >= 'v') {
        	teamName = "Black Holes";
        	System.out.println("Aha! You're on the team " + teamName + "!");
        }
        
        scanner.close();
        System.out.println("Good luck in the games!");
	}
}

// i think my code is wrong it does not display properly the result if the name start with the condition initial
