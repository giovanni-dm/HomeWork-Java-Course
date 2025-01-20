package Homework;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        // HW: Create a number-guessing game using do-while loop. Give user some amount of tries, when user fails, let user know.

        Scanner scanner = new Scanner(System.in);

        int numberToGuess = 20;

        int tries = 5;

        do {

            System.out.println("Guess a number between 10 and 50: ");
            int userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations, you guessed the correct number!");
                break;
            } else {
                tries--;
                System.out.println("Wrong guess! You have " + tries + " tries left.");
            }


        } while (tries > 0);

        if (tries == 0) {
            System.out.println("Sorry, you've run out of tries. The correct number was: " + numberToGuess);
        }

    }
}
