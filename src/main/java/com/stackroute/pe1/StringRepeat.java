package com.stackroute.pe1;
import java.util.Scanner;

public class StringRepeat {

/*
    public static void main(String[] args) {
        int n;
        int n1=0;
        String word;
        String repeatedChar = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        word = scan.nextLine();
        System.out.println("How many characters you want to repeat");
        n = scan.nextInt();
       while(n1!=n) {
           for (int i = word.length() - n; i <= word.length() - 1; i++) {
               repeatedChar = repeatedChar + word.charAt(i);
           }
           n1++;
       }
            System.out.println(word+repeatedChar);
    }

*/
    public String substringRepeat(String word, int numberCharRepeat) {
        String stringAfterRepeat = "";
        String subString = "";
        if(word == null) {
            return "Error: String cannot be null";
        }

        for(int repeatTime = 0; repeatTime <= numberCharRepeat - 1; repeatTime++) {
            for (int i = word.length() - numberCharRepeat; i <= word.length() - 1; i++) {
                subString = subString + word.charAt(i);
            }
        }
        stringAfterRepeat = word + subString;
        return stringAfterRepeat;
    }


}
