package com.javabasics.ifelse;

import java.util.Scanner;

public class MiniZork {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) { 
            	System.out.println("You slowly stick your hand in the mailbox...");
            	System.out.println("You felt something weird in there.");
            	System.out.print("Take out the item or leave the place? ");
            	action = userInput.nextLine();
            	
            	if(action.equals("take out the item")) {
            		System.out.println("It was a knife and someone is standing behind you right now");
            		System.out.println("You've been killed by a grue");
            	} else if(action.equals("leave the place")) {
            		System.out.println("You run away from the place as fast as you can");
                    System.out.println("But you alive. Possibly a wise choice.");
            	}
            }
        } else if (action.equals("go to the house")) { 
        	System.out.println("After opening the door you heard something upstairs");
        	System.out.println("As well as foul smell coming from the kitchen");
        	System.out.print("Go to the kitchen or upstairs? ");
        	action = userInput.nextLine();
        	
        	if(action.equals("go to the kitchen")) {
        		System.out.println("You saw a dead body in the kitchen");
        		System.out.println("Probably that's where the stench came from");
        		System.out.print("Inspect the body or quickly leave? ");
        		action = userInput.nextLine();
        		
        		if(action.equals("inspect the body")) {
        			System.out.println("Someone wished for an early death.");
        			System.out.println("While inspecting the body, the grue crept behind and killed you");
        		}
        		else if(action.equals("quickly leave")) {
        			System.out.println("Probably the best choice you could have ever made");
        			System.out.println("You left the scene without ever turning back.");
        		}
        	}
        	else if(action.equals("upstairs")) {
        		System.out.println("The sound gets louder as you make you way up the stairs");
        		System.out.println("Sounds like someone is sharpening something in a room up ahead");
        		System.out.print("Investigate the room or get out of the house? ");
        		action = userInput.nextLine();
        		
        		if(action.equals("investigate the room")) {
        			System.out.println("You peeked at the small gap of the door and saw grue sharpening his blade");
        			System.out.println("Grue made eye contact with you and starts chasing you");
        			System.out.println("He caught up and killed you instantly");
        		}
        		else if(action.equals("get out of the house")) {
        			System.out.println("You quickly make your way back down the stairs");
        			System.out.println("And ran out of the house.");
        		}
        	}
        }
	}

}
