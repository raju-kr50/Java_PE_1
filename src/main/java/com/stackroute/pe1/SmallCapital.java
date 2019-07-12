package com.stackroute.pe1;

import java.util.Scanner;

public class SmallCapital {

    public String checkSmallCapital(char character) {
        String result = "";
        if ((character >= 65) && (character <= 90)) {
            result = "Capital Letter";
        } else if ((character >= 97) && (character <= 122)) {
            result = "Small Letter";
        } else if ((character >= 48) && (character <= 57)) {
            result = "Digit";
        } else {
            result = "Please enter letter or digit";
        }
        return result;
    }

}
