package com.stackroute.pe1;

public class Palindrome {

    public String checkPalindrome(int number) {
        if (number <= 0) {
            return "Enter number greater than 0";
        }

        int temp = number;
        int remainder;
        int sum = 0;
        int reversedNumber = 0;
        String result;
        while (temp != 0) {
            remainder = temp % 10;
            if (remainder % 2 == 0)
                sum = sum + remainder;
            reversedNumber = reversedNumber * 10 + remainder;
            temp = temp / 10;
        }

        if (reversedNumber == number) {
            if (sum > 25) {
                result = "The number is palindrome and the sum of even numbers is greater than 25";
            } else {
                result = "The number is palindrome and the sum of even numbers is not greater than 25";
            }
        } else {
            result = "Not Palindrome";
        }
        return result;
    }
}

