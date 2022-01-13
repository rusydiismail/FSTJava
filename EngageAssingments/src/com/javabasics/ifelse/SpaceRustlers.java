package com.javabasics.ifelse;

public class SpaceRustlers {
	
	public static void main(String[] args) {

        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } 
        else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } 
        else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } 
        else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        if(cows > aliens) {
        	System.out.println("Oh no! The herds got restless and took over! Looks like _we're_ hamburger now!!");
        }
        
        // 3rd question
        if(aliens > cows) {
        	System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        }
        else if(cows == aliens || cows > aliens) {
        	System.out.println("Oh no! The herds got restless and took over! Looks like _we're_ hamburger now!!");
        }
    }
}

// else if: for condition that does not satisfy 'if' statement
// if: if loop will run when the condition in the bracket satisfy the condition

// if you remove the 'else' from 'else if', it will just become a normal if loop 
