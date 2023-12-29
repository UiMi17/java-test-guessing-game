package org.danylo;
import java.util.Random;
import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(101);
        System.out.println("Please enter your name:");
        String username = scanner.nextLine();
        System.out.println("Let the game begin!");


        while (true) {
            System.out.println("Enter a number:");
            int userAnswer = scanner.nextInt();
            scanner.nextLine();
            if (userAnswer < numberToGuess) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (userAnswer > numberToGuess) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.printf("Congratulations, %s! %nWanna try again? (yes/no):%n", username);

                String again = scanner.nextLine().toLowerCase();
                if (!again.equals("yes") && !again.equals("y")) {
                    break;
                }
                numberToGuess = random.nextInt(101);
            }
        }

        scanner.close();
    }
}

