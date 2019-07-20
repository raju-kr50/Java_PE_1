package com.stackroute.pe1;

public class NumberGuess {

    public String guessNumber(int number, int originalNumber) {
        boolean guess = false;
        String result = "";
        if ((number >= 1) && (number <= 50)) {
            if (number == originalNumber) {
                result = "Number guessed matches the original number";
                guess = true;
            } else if (number < originalNumber) {
                result = "Number guessed is less than original number";
            } else {
                result = "Number guessed is more than original number";
            }
        } else {
            result = "Please enter the number between 1 to 50";
        }
        return result;
    }
}
