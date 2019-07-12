package com.stackroute.pe1;
import java.util.Scanner;

public class SmallCapital {

//    public static void main(String[] args) {
//        char character;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a character ");
//        character = scan.next().charAt(0);
        public String checkSmallCapital(char character) {
            String result = "";
        if((character >= 65) && (character <= 90)) {
            result = "Capital Letter";
        } else if((character >= 97) && (character <= 122)) {
            result = "Small Letter";
        } else if((character >= 48) && (character <= 57)) {
            result = "Digit";
        } else {
            result = "Please enter letter or digit";
        }
            return result;
    }

}
