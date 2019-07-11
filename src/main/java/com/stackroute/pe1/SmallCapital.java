package com.stackroute.pe1;
import java.util.Scanner;

public class SmallCapital {

    public static void main(String[] args) {
        char character;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character ");
        character = scan.next().charAt(0);

        if((character >= 65) && (character <= 90)) {
            System.out.println("Capital Letter");
        } else if((character >= 97) && (character <= 122)) {
            System.out.println("Small Letter");
        } else if((character >= 48) && (character <= 57)) {
            System.out.println("Digits");
        }
    }
}
