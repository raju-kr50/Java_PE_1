package com.stackroute.pe1;
import java.util.Scanner;

public class StringRepeat {

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

}
