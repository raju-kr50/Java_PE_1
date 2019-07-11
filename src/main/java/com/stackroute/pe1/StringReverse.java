package com.stackroute.pe1;
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        String originalString;
        String reversedString="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string you want to reverse");
        originalString = scan.nextLine();
        for(int i = originalString.length()-1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }
        System.out.println(reversedString);
    }
}
