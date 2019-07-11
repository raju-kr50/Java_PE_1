package com.stackroute.pe1;
import java.util.Scanner;

public class AddIntegers {

    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers you want to add? ");
        n = scan.nextInt();
        int[] numbers=new int[n];
        System.out.println("Enter numbers you want to add. ");
        for(int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
            sum = sum + numbers[i];
        }
        System.out.println("The sum of entered numbers is "+sum);
    }
}
