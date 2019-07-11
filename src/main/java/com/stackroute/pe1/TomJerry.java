package com.stackroute.pe1;

import java.util.Scanner;

public class TomJerry {

//    public static void main(String[] args) {
    public String tomAndJerry(int number) {
 //      int number;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        number = scan.nextInt();
        if(number < 0) {
            return "No negative numbers are allowed";
        }
        if ((number > 20) && (number <30)) {
            if (number % 2 == 0) {
                return "Tom";
            } else {
                return "Jerry";
            }
        } else {
            return  "Please enter a number between 20 and 30";
        }

    }
}
