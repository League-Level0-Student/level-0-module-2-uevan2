//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		for(int x = 0; x < 10; x++) {
		
			int randomNumber = randomMaker.nextInt(6)+1;
		
			System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		
				if (randomNumber == 1) {
					System.out.println("your an ");
				} else if (randomNumber == 2) {
					System.out.println("you have eaten an ");
				} else if (randomNumber == 3) {
					System.out.println("you like ");
				} else if (randomNumber == 4) {
					System.out.println("you you own ");
				} else if (randomNumber == 5) {
					System.out.println("you're an ");
				} else {
					System.out.println("you look like an ");
			};
		
			// 2. Repeat all the code above 10 times
		
			// 3. Find someone to test out your program. They will like it :)
		}
	}
}
