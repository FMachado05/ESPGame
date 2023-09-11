/*
* Class: CMSC203
* Instructor: Khandan Monshi
* Description: class ESPGame contains a extrasensorial mini-game in which the user tries to guess the right color randomized by the program between 7 options.
* 			   class Scanner receives input from the keyboard 
*              class Random generates a random number(in this case between 1 and 7)
* Due: 09/11/2023
* Platform/compiler: Eclipse IDE
* I pledge that I have completed the programming assignment
* independently. I have not copied the code from a student or
* any source. I have not given my code to any student.
* Print your Name here: Felipe da Rocha de Brito Machado
*/

import java.util.Scanner;
import java.util.Random;
public class ESPGame {

	public static void main(String[] args) {

		final String GAME_QUESTION = "I am thinking of a color.\nIs it Red, Green, Blue, Orange, Yellow, Purple or Black?\nEnter your guess:";
		String color;
		final int NUMBER_OF_ROUNDS = 11;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name here: ");

		String userName = input.nextLine();

		System.out.print("Describe yourself: ");

		String userDescription = input.nextLine();

		System.out.print("Due Date: ");

		String dueDate = input.nextLine();

		System.out.println("CMSC203 Assignment1: Test your ESP skills!");

		int correctGuesses = 0; // declare a variable to keep track of the number of correct guesses and
								// initialize it to 0
		for (int i = 0; i < NUMBER_OF_ROUNDS; i++) { // for loop will iterate until it reaches the number of rounds
														// given

			Random rand = new Random();
			int randomNum = rand.nextInt(7) + 1; // generate a random number between 1 and 7 for each
															// iteration of the for loop

			switch (randomNum) { // switch will receive a different argument for every time the loop iterates
			case 1:
				color = "Red";
				break;
			case 2:
				color = "Green";
				break;
			case 3:
				color = "Blue";
				break;
			case 4:
				color = "Orange";
				break;
			case 5:
				color = "Yellow";
				break;
			case 6:
				color = "Purple";
				break;
			case 7:
				color = "Black";
				break;
			default:
				color = "wrong"; // used to check if the random number is outside of 1-7(inclusive)
			}

			System.out.println("Round " + (i + 1)); // increase 1 to index to show Round 1,2,3.. instead of Round
													// 0,1,2...

			System.out.println(GAME_QUESTION); // "I am thinking of a color..." question for each iteration of the for
												// loop

			String userChoice = input.nextLine();

			int count = 0; // declare a variable to keep track of how many times used tried to guess a
							// color

			while (!userChoice.equalsIgnoreCase(color) && count < 2) { // the loop will continue until the user gets the
																		// wrong answer 3 times in a row. count < 2
																		// instead of count < 3 because of 0 index

				System.out.println(
						"You entered incorrect color. Is it Red, Green, Blue, Orange, Yellow, Purple, or Black?\nEnter your guess again: ");

				count++; // counter will increase every time the user try to guess. if the user uses the
							// wrong guess 3 times the while loop breaks
				userChoice = input.nextLine();

			}
			if (userChoice.equalsIgnoreCase(color)) { // case insensitive
				correctGuesses++; // this will increase every time the user gets the right color
			}

			System.out.println("I was thinking of " + color + ".");

		}

		System.out.println("You guessed " + correctGuesses + " out of " + NUMBER_OF_ROUNDS + " colors correctly");

		// CREDITS

		System.out.println("User Name: " + userName);

		System.out.println("User Description: " + userDescription);

		System.out.print("Due Date: " + dueDate);

	}

}
