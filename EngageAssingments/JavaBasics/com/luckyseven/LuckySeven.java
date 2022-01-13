package com.luckyseven;

import java.util.Random;
import java.util.Scanner;

public class LuckySeven {

	public static void main(String[] args) {
		int rollCount = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many dollars do you have? ");
		int amount = Integer.parseInt(scanner.nextLine());
		
		
		
		while(amount > 0) {
			int[] rolls1 = {1,2,3,4,5,6}; //,"7","8","9","10","11","12"
			int diceRoll1 = rolls1[new Random().nextInt(rolls1.length)];
			int[] rolls2 = {1,2,3,4,5,6};
			int diceRoll2 = rolls2[new Random().nextInt(rolls2.length)];
			int totalRoll = diceRoll1 + diceRoll2;
			
			int maxAmount = Math.max(amount, rollCount);
			
			if(totalRoll == 7) {
				rollCount++;
				System.out.println(totalRoll);
				amount = amount + 4;
//				System.out.println(maxAmount);
				
			}
			else {
				rollCount++;
				System.out.println(totalRoll);
				amount = amount - 1;
			}
			
			
			if(amount == 0) {
				System.out.println("You are broke after " + rollCount + " rolls");
				System.out.println("You should have quit after " + rollCount + " rolls when you had " + maxAmount);
				break;
				
			}
		}
	}
}
