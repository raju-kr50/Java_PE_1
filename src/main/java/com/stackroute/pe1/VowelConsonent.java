package com.stackroute.pe1;
import java.util.Scanner;

public class VowelConsonent {

    public static void main (String[] args) {
        String word;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        word = scan.nextLine();
        char[] ch = word.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
                    ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                System.out.print(ch[i] + "- vowel ");
            } else {
                System.out.print(ch[i] + "- consonent");
            }
        }
    }
}
