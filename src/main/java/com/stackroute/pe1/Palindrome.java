package com.stackroute.pe1;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int number, reversedNumber = 0, sum = 0, temp, remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        temp = number;
        while(temp != 0) {
            remainder = temp % 10;
            if(remainder % 2 == 0)
                sum = sum + remainder;
            reversedNumber = reversedNumber *10 + remainder;
            temp = temp / 10;
        }

        if(reversedNumber == number) {
            System.out.println(number + " is a palindrome");
        }
        else{
            if(sum > 25) {
                System.out.println(number+ " is not palindrome and the sum of even numbers is greater than 25");
            }
            else
                System.out.println(number + " is not palindrome and the sum of even numbers is not greater than 25");
        }
    }
}

