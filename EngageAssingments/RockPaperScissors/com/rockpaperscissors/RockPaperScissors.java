package com.rockpaperscissors;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String args[]) {
    	// counter for how many times the user wants to play
    	int rounds = 0;
    	// variables for user records
    	int myWins = 0;
    	int myLosses = 0;
    	int myTies = 0;
    	// variables for computer records
    	int compWins = 0;
    	int compLosses = 0;
    	int compTies = 0;
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("How many rounds of Rock-Paper-Scissors would you like to play? minimum: 1, maximum: 10");
    	int input = Integer.parseInt(scanner.nextLine());
    	
    	while(rounds < input) {
			if(input > 10) {
				System.out.println("10 rounds maximum, you've entered: " + input);
				break;
			}
			System.out.println("What is your move? To make a move, enter 1 = rock, 2 = paper, or 3 = scissors.");
			String myMove = scanner.nextLine();
			
			if(!myMove.equals("1") && !myMove.equals("2") && !myMove.equals("3")) {
				System.out.println("Your move isn't valid!");
			} 
			else {
				String[] rps = {"1","2","3"};
				String showMove = "";
				String opponentMove = rps[new Random().nextInt(rps.length)];
				
				if(opponentMove == "1") {
					showMove = "rock";
				} else if(opponentMove == "2") {
					showMove = "paper";
				} else {
					showMove = "scissors";
				}
				System.out.println("Opponent move: " + showMove);
					
				if(myMove.equals(opponentMove)) {
					System.out.println("It's a tie");
					myTies++;
					compTies++;
				} 
				else if(myMove.equals("1")) {
					if(opponentMove.equals("2")) {
						System.out.println("You lose");
						myLosses++;
						compWins++;
					}
					else if (opponentMove.equals("3")) {
						System.out.println("You win");
						myWins++;
						compLosses++;
					}
				} 
				else if(myMove.equals("2")) {
					if(opponentMove.equals("1")) {
						System.out.println("You win");
						myWins++;
						compLosses++;
					}
					else if (opponentMove.equals("3")) {
						System.out.println("You lose");
						myLosses++;
						compWins++;
					}
				} 
				else if(myMove.equals("3")) {
					if(opponentMove.equals("2")) {
						System.out.println("You win");
						myWins++;
						compLosses++;
					}
					else if (opponentMove.equals("1")) {
						System.out.println("You lose");
						myLosses++;
						compWins++;
					}
				} 
				System.out.println("You have won: " + myWins + " lost: " + myLosses + " tied: " + myTies +" games");
			}
			rounds++;
			 
	    	if(myWins > compWins) {
	    		System.out.println("You won more rounds than the computer");
	    	}
	    	else {
	    		System.out.println("Computer won more rounds");
	    	}
		}
    	while(true) { // will have to fix this
    		System.out.println("Play again? (y/n)");
	    	String playAgain = scanner.nextLine();
	    	if(!playAgain.equals("y")) {
	    		break;
	    	}
    	}
    	scanner.close();
		System.out.println("Thank you for playing");
    }
}


