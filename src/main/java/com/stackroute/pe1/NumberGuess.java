package com.stackroute.pe1;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        int number;
        int originalNumber = 41;
        boolean guess = false;
        Scanner scan = new Scanner(System.in);
        while(guess == false) {
            System.out.println("Guess a number between 1 to 50: ");
            number = scan.nextInt();

            if ((number >= 1) && (number <= 50)) {
                if (number == originalNumber) {
                    System.out.println("Number guessed matches the original number");
                    guess = true;
                } else if (number < originalNumber) {
                    System.out.println("Number guessed is less than original number");
                } else {
                    System.out.println("Number guessed is more than original number");
                }
            } else {
                System.out.println("Please enter the number between 1 to 50");
            }
        }
    }
}
