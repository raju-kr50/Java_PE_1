package com.stackroute.pe1;

public class TomJerry {

    public String tomAndJerry(int number) {

        if (number < 0) {
            return "No negative numbers are allowed";
        }
        if ((number > 20) && (number < 30)) {
            if (number % 2 == 0) {
                return "Tom";
            } else {
                return "Jerry";
            }
        } else {
            return "Please enter a number between 20 and 30";
        }

    }
}
