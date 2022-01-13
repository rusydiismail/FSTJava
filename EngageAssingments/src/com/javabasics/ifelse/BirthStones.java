package com.javabasics.ifelse;

import java.util.Scanner;

public class BirthStones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("What month's birthstone do you want to know? ");
		int input = scanner.nextInt();
		if(input == 1) {
			System.out.println("January's birthstone is Garnet.");
		} 
		if(input == 2) {
			System.out.println("February's birthstone is Amethyst.");
		} 
		if(input == 3) {
			System.out.println("March's birthstone is Aquamarine.");
		} 
		if(input == 4) {
			System.out.println("April's birthstone is Diamond.");
		} 
		if(input == 5) {
			System.out.println("May's birthstone is Emerald.");
		} 
		if(input == 6) {
			System.out.println("June's birthstone is Pearl.");
		} 
		if(input == 7) {
			System.out.println("July's birthstone is Ruby.");
		} 
		if(input == 8) {
			System.out.println("August's birthstone is Peridot.");
		} 
		if(input == 9) {
			System.out.println("September's birthstone is Sapphire.");
		} 
		if(input == 10) {
			System.out.println("October's birthstone is Opal.");
		} 
		if(input == 11) {
			System.out.println("November's birthstone is Topaz.");
		} 
		if(input == 12) {
			System.out.println("December's birthstone is Turquoise.");
		} 
		else {
			System.out.println("I think you must be confused, " + input + " doesn't match a month");
		}
		scanner.close();
	}

}
